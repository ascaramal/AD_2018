package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoteDTO implements Serializable {

	private static final long serialVersionUID = -2582825385773550673L;

	private int codLote;
	private Date fechaVtoLote;
	private List<UbicacionDTO> ubicaciones;
	private ArticuloDTO articulo;

	// Constructor
	public LoteDTO() {
		this.ubicaciones = new ArrayList<UbicacionDTO>();
	}

	public LoteDTO(int codLote, Date fechaVtoLote, List<UbicacionDTO> ubicaciones, ArticuloDTO articulo) {
		this.codLote = codLote;
		this.fechaVtoLote = fechaVtoLote;
		this.ubicaciones = new ArrayList<UbicacionDTO>();
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

	public List<UbicacionDTO> getUbicaciones() {
		return ubicaciones;
	}

	public void setUbicaciones(List<UbicacionDTO> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}

	public ArticuloDTO getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}

	@Override
	public String toString() {
		return "LoteDTO [codLote=" + codLote + ", fechaVtoLote=" + fechaVtoLote + ", ubicaciones=" + ubicaciones
				+ ", articulo=" + articulo + "]";
	}

}
