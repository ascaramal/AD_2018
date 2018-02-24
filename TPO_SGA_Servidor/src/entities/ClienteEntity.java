package entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import dto.ClienteDTO;
import negocio.Cliente;

@Entity
@Table(name = "Clientes")
public class ClienteEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nroCliente;
	private String razonSocial;
	private String direccion;
	private String localidad;
	private Integer codPostal;
	private String telefono;
	private String cuit;
	@Column(name = "condicionIVA")
	private String condIVA;
	private float limiteDeCredito;
	private float saldo;
/*	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "nroCliente")
	private List<RemitoEntity> remitos;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "nroCliente")
	private List<FacturaEntity> facturas;*/

	//@OneToMany(cascade = CascadeType.ALL)
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "nroCliente")
	private List<PedidoEntity> pedidos = new ArrayList<PedidoEntity>();

	// Constructor
	public ClienteEntity() {
//		this.remitos = new ArrayList<RemitoEntity>();
//		this.facturas = new ArrayList<FacturaEntity>();
		//this.pedidos 

	}

	public Integer getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(Integer nroCliente) {
		this.nroCliente = nroCliente;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Integer getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(Integer codPostal) {
		this.codPostal = codPostal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getCondIVA() {
		return condIVA;
	}

	public void setCondIVA(String condIVA) {
		this.condIVA = condIVA;
	}

	public float getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(float limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	/*public List<RemitoEntity> getRemitos() {
		return remitos;
	}

	public void setRemitos(List<RemitoEntity> remitos) {
		this.remitos = remitos;
	}

	public List<FacturaEntity> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<FacturaEntity> facturas) {
		this.facturas = facturas;
	}*/

	public List<PedidoEntity> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<PedidoEntity> pedidos) {
		this.pedidos = pedidos;
	}

	public ClienteDTO toDTO() {
		ClienteDTO cliente = new ClienteDTO();
		cliente.setNroCliente(this.nroCliente);
		cliente.setRazonSocial(this.razonSocial);
		cliente.setDireccion(this.direccion);
		cliente.setLocalidad(this.localidad);
		cliente.setCodPostal(this.codPostal);
		cliente.setTelefono(this.telefono);
		cliente.setCondIVA(this.condIVA);
		cliente.setCuit(this.cuit);
		cliente.setLimiteDeCredito(this.limiteDeCredito);
		cliente.setSaldo(this.saldo);

		return cliente;
	}

	@Override
	public String toString() {
//		return "ClienteEntity [nroCliente=" + nroCliente + ", razonSocial=" + razonSocial + ", direccion=" + direccion
//				+ ", localidad=" + localidad + ", codPostal=" + codPostal + ", telefono=" + telefono + ", cuit=" + cuit
//				+ ", condIVA=" + condIVA + ", limiteDeCredito=" + limiteDeCredito + ", saldo=" + saldo + ", pedidos="
//				+ pedidos + "]";
		return "";
	}

	public Cliente toNegocio() {
		Cliente res = new Cliente();
		res.setNroCliente(this.nroCliente);
		res.setRazonSocial(this.razonSocial);
		res.setDireccion(this.direccion);
		res.setCondIVA(this.condIVA);
		res.setSaldo(this.saldo);
		res.setLocalidad(this.localidad);
		res.setCuit(this.cuit);
		res.setTelefono(this.telefono);
		res.setLimiteDeCredito(this.limiteDeCredito);
		res.setCodPostal(this.codPostal);
		
		return res;
	}

	
}
