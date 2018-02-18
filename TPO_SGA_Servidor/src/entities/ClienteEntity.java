package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="nroCuentaCorriente_id")
	private CuentaCorrienteEntity nroCtaCte;

	
	public ClienteEntity() {
	
	}	

	public ClienteEntity(Integer nroCliente, String razonSocial, String direccion, 
			String localidad, Integer codPostal, String telefono, String cuit, String condIVA, 
			CuentaCorrienteEntity nroCtaCte) {
		this.nroCliente = nroCliente;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.localidad = localidad;
		this.codPostal = codPostal;
		this.telefono = telefono;
		this.cuit = cuit;
		this.condIVA = condIVA;
		this.nroCtaCte = nroCtaCte;
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
	
	public CuentaCorrienteEntity getNroCtaCte() {
		return nroCtaCte;
	}
	
	public void setNroCtaCte(CuentaCorrienteEntity nroCtaCte) {
		this.nroCtaCte = nroCtaCte;
	}

	public ClienteDTO toDTO() {
		ClienteDTO cliente = new ClienteDTO();
		cliente.setNroCliente(this.nroCliente);
		cliente.setNroCtaCte(this.nroCtaCte.toDTO());
		cliente.setRazonSocial(this.razonSocial);
		cliente.setDireccion(this.direccion);
		cliente.setLocalidad(this.localidad);
		cliente.setCodPostal(this.codPostal);
		cliente.setTelefono(this.telefono);
		cliente.setCondIVA(this.condIVA);
		cliente.setCuit(this.cuit);

		return cliente;

	}
}
