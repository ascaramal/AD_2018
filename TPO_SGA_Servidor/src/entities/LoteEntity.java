package entities;

import java.io.Serializable;
import java.util.Date;

public class LoteEntity implements Serializable {
	
	private static final long serialVersionUID = 2076203845381608484L;
	
	private int codLote;
	private Date fechaVtoLote;
	private String proveedor;
	private UbicacionEntity ubicacion;
	
	public LoteEntity() {
		
	}

	public LoteEntity(int codLote, Date fechaVtoLote, String proveedor, UbicacionEntity ubicacion) {
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

	public UbicacionEntity getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(UbicacionEntity ubicacion) {
		this.ubicacion = ubicacion;
	}
	

	
	
}
