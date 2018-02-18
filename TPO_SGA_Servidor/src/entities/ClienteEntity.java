package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import dto.ClienteDTO;

@Entity
@Table(name="Clientes")
public class ClienteEntity implements Serializable {

	private static final long serialVersionUID = 4654600082063806717L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cliente_id")
	private Integer nroCliente;
	private String razonSocial;
	private String direccion;
	private String localidad;
	@Column(name="codigoPostal")
	private Integer codPostal;
	private String telefono;
	private String cuit;
	@Column(name="condicionIVA")
	private String condIVA;
	private float limiteDeCredito;
	private float saldo;

	
	public ClienteEntity() {
	
	}	

	public ClienteEntity(Integer nroCliente, String razonSocial, String direccion, String localidad, Integer codPostal,
			String telefono, String cuit, String condIVA, float limiteDeCredito, float saldo) {
		super();
		this.nroCliente = nroCliente;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.localidad = localidad;
		this.codPostal = codPostal;
		this.telefono = telefono;
		this.cuit = cuit;
		this.condIVA = condIVA;
		this.limiteDeCredito = limiteDeCredito;
		this.saldo = saldo;
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
}
