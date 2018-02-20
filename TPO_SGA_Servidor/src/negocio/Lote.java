package negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dto.LoteDTO;
import dto.UbicacionDTO;



public class Lote {
	
	private int codLote;
	private Date fechaVtoLote;
	private List<Ubicacion> ubicaciones;
	private Articulo articulo;
	
	
	public Lote(int codLote, Date fechaVtoLote, List<Ubicacion> ubicaciones, Articulo articulo) {
		this.codLote = codLote;
		this.fechaVtoLote = fechaVtoLote;
		this.ubicaciones = new ArrayList<Ubicacion>();
		this.articulo = articulo;
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

	public List<Ubicacion> getUbicaciones() {
		return ubicaciones;
	}

	public void setUbicaciones(List<Ubicacion> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}


	public LoteDTO toDTO() {
		LoteDTO res = new LoteDTO();
		res.setCodLote(this.codLote);
		res.setFechaVtoLote(this.fechaVtoLote);
		res.setArticulo(this.articulo.toDTO());
		
		for(UbicacionDTO ubiAux : this.getUbicaciones()) {
			UbicacionDTO ubicacionDTO = ubiAux.toDTO();
			ubicacionDTO.setLote(res);
		}
		
		return res;	
	}
}











