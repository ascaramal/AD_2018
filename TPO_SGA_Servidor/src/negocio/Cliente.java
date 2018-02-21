package negocio;

import dto.ClienteDTO;

public class Cliente {

	private int nroCliente;
	private String razonSocial;
	private String direccion;
	private String localidad;
	private int codPostal;
	private String telefono;
	private String cuit;
	private String condIVA;
	private float limiteDeCredito;
	private float saldo;

	public Cliente() {
	}
	
	public Cliente(int nroCliente, String razonSocial, String direccion, String localidad, int codPostal,
			String telefono, String cuit, String condIVA, float limiteDeCredito, float saldo) {
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
		ClienteDTO res = new ClienteDTO();
		res.setNroCliente(this.nroCliente);
		res.setRazonSocial(this.razonSocial);
		res.setDireccion(this.direccion);
		res.setLocalidad(this.localidad);
		res.setCodPostal(this.codPostal);
		res.setCuit(this.cuit);
		res.setCondIVA(this.condIVA);
		res.setTelefono(this.telefono);
		res.setSaldo(this.saldo);
		res.setLimiteDeCredito(this.limiteDeCredito);
		
		return res; 
	}
}