package negocio;

public class ItemOrden {
	
	private int nroItemOrden;
	private Articulo articulo;
	private Ubicacion ubicacion;
	
	public ItemOrden(int nroItemOrden, Articulo articulo, Ubicacion ubicacion) {
		this.nroItemOrden = nroItemOrden;
		this.articulo = articulo;
		this.ubicacion = ubicacion;
	}

	public int getNroItemOrden() {
		return nroItemOrden;
	}

	public void setNroItemOrden(int nroItemOrden) {
		this.nroItemOrden = nroItemOrden;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	

	
}
