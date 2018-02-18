package dto;

import java.io.Serializable;


public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = -8655239895983395351L;

	private int nroCliente;
	private String razonSocial;
	private String direccion;
	private String localidad;
	private int codPostal;
	private String telefono;
	private String cuit;
	private String condIVA;
	private CuentaCorrienteDTO nroCtaCte;
	
	public ClienteDTO() { }


	public ClienteDTO(int nroCliente, String razonSocial, String direccion, 
			String localidad, int codPostal, String telefono, String cuit, String condIVA, 
			CuentaCorrienteDTO nroCtaCte) {
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

	public int getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(int nroCliente) {
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

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
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


	public CuentaCorrienteDTO getNroCtaCte() {
		return nroCtaCte;
	}


	public void setNroCtaCte(CuentaCorrienteDTO nroCtaCte) {
		this.nroCtaCte = nroCtaCte;
	}
	
	@Override
	public String toString() {
		return "Cliente [" + nroCliente + " - " + razonSocial + " - " + direccion
				+ " - " + localidad + " - " + codPostal + " - " + telefono + " - " + cuit
				+ " - " + condIVA + " - " + nroCtaCte.toString() + "]";
	}

}
