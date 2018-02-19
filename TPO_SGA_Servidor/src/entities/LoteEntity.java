package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoteEntity  {
	
	private int codLote;
	private Date fechaVtoLote;
	private List<UbicacionEntity> ubicaciones;
	private ArticuloEntity articulo;

	
	public LoteEntity() {
		this.ubicaciones = new ArrayList<UbicacionEntity>();
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


	public List<UbicacionEntity> getUbicaciones() {
		return ubicaciones;
	}


	public void setUbicaciones(List<UbicacionEntity> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}


	public ArticuloEntity getArticulo() {
		return articulo;
	}


	public void setArticulo(ArticuloEntity articulo) {
		this.articulo = articulo;
	}

	
}
