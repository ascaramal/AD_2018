package negocio;

import dto.OrdenDeTrabajoDTO;

public class OrdenDeTrabajo {

	private Articulo articulo;
	private int cantidad;
	private Ubicacion ubicacion;
	
	public OrdenDeTrabajo(Articulo articulo, int cantidad, Ubicacion ubicacion) {
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.ubicacion = ubicacion;
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
	
	public OrdenDeTrabajoDTO toDTO() {
		OrdenDeTrabajoDTO res = new OrdenDeTrabajoDTO();
		res.setCantidad(this.cantidad);
		res.setArticulo(this.articulo.toDTO());
		res.setUbicacion(this.ubicacion.toDTO());
		
		return res;
	}
	
	
}
