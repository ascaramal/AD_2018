package negocio;

import dto.OrdenDeTrabajoDTO;

public class OrdenDeTrabajo {

	private Articulo articulo;
	private int cantidad;
	private Ubicacion ubicacion;
	private Lote lote;

	// Constructor
	public OrdenDeTrabajo() {

	}

	public OrdenDeTrabajo(Articulo articulo, int cantidad, Ubicacion ubicacion, Lote lote) {
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.ubicacion = ubicacion;
		this.setLote(lote);
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

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public OrdenDeTrabajoDTO toDTO() {
		OrdenDeTrabajoDTO res = new OrdenDeTrabajoDTO();
		res.setCantidad(this.cantidad);
		
		if (this.articulo != null)
			res.setArticulo(this.articulo.toDTO());
		
		if (this.ubicacion != null)
			res.setUbicacion(this.ubicacion.toDTO());

		return res;
	}

}
