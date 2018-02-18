package dto;

import java.io.Serializable;
import java.util.Date;

public class LoteDTO implements Serializable {
	
	private static final long serialVersionUID = -2582825385773550673L;
	
	private int nroLote;
	private int codLote;
	private Date fechaVtoLote;
	private String proveedor;
	
	
	public LoteDTO(int nroLote, int codLote, Date fechaVtoLote, String proveedor) {
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

	@Override
	public String toString() {
		return "LoteDTO [nroLote=" + nroLote + ", codLote=" + codLote + ", fechaVtoLote=" + fechaVtoLote
				+ ", proveedor=" + proveedor + "]";
	}
	
	
}
