package negocio;

import java.util.Date;

import dto.RecepcionCompraDTO;

public class RecepcionCompra {

	private Articulo articulo;
	private int cantidad;
	private Lote lote;
	private Date fechaVtoLote;

	public RecepcionCompra(Articulo articulo, int cantidad, Lote lote, Date fechaVtoLote) {
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.lote = lote;
		this.fechaVtoLote = fechaVtoLote;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public Date getFechaVtoLote() {
		return fechaVtoLote;
	}

	public void setFechaVtoLote(Date fechaVtoLote) {
		this.fechaVtoLote = fechaVtoLote;
	}

	public RecepcionCompraDTO toDTO() {
		RecepcionCompraDTO res = new RecepcionCompraDTO();
		res.setArticulo(this.articulo.toDTO());
		res.setCantidad(this.cantidad);
		res.setFechaVtoLote(this.fechaVtoLote);
		res.setLote(this.lote.toDTO());
		
		return res;
		
	}
}
