package entities;

public class ItemOrdenEntity {
	
	private int nroItemOrden;
	private ArticuloEntity articulo;
	private UbicacionEntity ubicacion;
	
	public ItemOrdenEntity(int nroItemOrden, ArticuloEntity articulo, UbicacionEntity ubicacion) {
		super();
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

	public ArticuloEntity getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloEntity articulo) {
		this.articulo = articulo;
	}

	public UbicacionEntity getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(UbicacionEntity ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	

	
}
