package negocio;

import java.util.Date;

public abstract class Comprobante {

	protected int numeroComprobante;
	protected int prefijo;
	protected Date fechaEmision;
	protected Cliente cliente;
	
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
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
