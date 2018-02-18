package entities;

import java.util.Date;

public abstract class ComprobanteEntity {

	protected int numeroComprobante;
	protected int prefijo;
	protected Date fechaEmision;
	protected ClienteEntity cliente;
	
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
	
	public ClienteEntity getCliente() {
		return cliente;
	}
	
	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

}
