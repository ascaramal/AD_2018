package dto;

import java.io.Serializable;
import java.util.Date;


public class LoteDTO implements Serializable {
	
	private static final long serialVersionUID = -2582825385773550673L;
	
	private int codLote;
	private Date fechaVtoLote;
	private String proveedor;
	private UbicacionDTO ubicacion;
	
	public LoteDTO(int codLote, Date fechaVtoLote, String proveedor, dto.UbicacionDTO ubicacion) {
		this.codLote = codLote;
		this.fechaVtoLote = fechaVtoLote;
		this.proveedor = proveedor;
		this.ubicacion = ubicacion;
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
	
	public UbicacionDTO getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(UbicacionDTO ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	@Override
	public String toString() {
		return "LoteDTO [codLote=" + codLote + ", fechaVtoLote=" + fechaVtoLote + ", proveedor=" + proveedor + "]";
	}
	
}
