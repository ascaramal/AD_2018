package negocio;

import java.util.Date;


public class Lote {
	
	private int codLote;
	private Date fechaVtoLote;
	private String proveedor;
	private Ubicacion ubicacion;
	
	public Lote(int codLote, Date fechaVtoLote, String proveedor, Ubicacion ubicacion) {
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
	
	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public LoteDTO toDTO() {
		
	}
}
