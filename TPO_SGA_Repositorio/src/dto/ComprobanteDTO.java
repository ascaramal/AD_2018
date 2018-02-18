package dto;

import java.io.Serializable;
import java.util.Date;

public abstract class ComprobanteDTO implements Serializable{

	private static final long serialVersionUID = 5090933786816404295L;

	protected int numeroComprobante;
	protected int prefijo;
	protected Date fechaEmision;
	protected ClienteDTO cliente;
	
	public int getNumeroComprobante() {
		return numeroComprobante;
	}
	
	public void setNumeroComprobante(int numeroComprobante) {
		this.numeroComprobante = numeroComprobante;
	}
	
	public int getPrefijo() {
		return prefijo;
	}
	
	public void setPrefijo(int prefijo) {
		this.prefijo = prefijo;
	}
	
	public Date getFechaEmision() {
		return fechaEmision;
	}
	
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	public ClienteDTO getCliente() {
		return cliente;
	}
	
	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "ComprobanteDTO [numeroComprobante=" + numeroComprobante + ", prefijo=" + prefijo + ", fechaEmision="
				+ fechaEmision + ", cliente=" + cliente + "]";
	}

	
}
