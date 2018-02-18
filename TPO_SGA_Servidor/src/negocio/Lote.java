package negocio;

import java.util.Date;

public class Lote {
	
	private int nroLote;
	private int codLote;
	private Date fechaVtoLote;
	private String proveedor;
	
	
	public Lote(int nroLote, int codLote, Date fechaVtoLote, String proveedor) {
		super();
		this.nroLote = nroLote;
		this.codLote = codLote;
		this.fechaVtoLote = fechaVtoLote;
		this.proveedor = proveedor;
	}

	public int getNroLote() {
		return nroLote;
	}

	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}

	public int getCodLote() {
		return codLote;
	}
	
	public void setCodLote(int codLote) {
		this.codLote = codLote;
	}
	
	public Date getFechaVtoLote() {
		return fechaVtoLote;
	}
	
	public void setFechaVtoLote(Date fechaVtoLote) {
		this.fechaVtoLote = fechaVtoLote;
	}
	
	public String getProveedor() {
		return proveedor;
	}
	
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	
	
}
