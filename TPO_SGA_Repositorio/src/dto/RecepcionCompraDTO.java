package dto;

import java.io.Serializable;
import java.util.Date;


public class RecepcionCompraDTO implements Serializable {

	private static final long serialVersionUID = -6013668971457057606L;

	private ArticuloDTO articulo;
	private int cantidad;
	private LoteDTO lote;
	private Date fechaVtoLote;

	public RecepcionCompraDTO() {
		
	}
	
	public ArticuloDTO getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LoteDTO getLote() {
		return lote;
	}

	public void setLote(LoteDTO lote) {
		this.lote = lote;
	}

	public Date getFechaVtoLote() {
		return fechaVtoLote;
	}

	public void setFechaVtoLote(Date fechaVtoLote) {
		this.fechaVtoLote = fechaVtoLote;
	}

	@Override
	public String toString() {
		return "RecepcionCompraDTO [articulo=" + articulo + ", cantidad=" + cantidad + ", lote=" + lote
				+ ", fechaVtoLote=" + fechaVtoLote + "]";
	}


}
