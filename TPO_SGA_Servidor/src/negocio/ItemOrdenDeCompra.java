package negocio;

public class ItemOrdenDeCompra {

	private int nroItemOrdenDeCompra;
	private int cantidad;
	private Articulo articulo;
	
	public ItemOrdenDeCompra(int nroItemOrdenDeCompra, int cantidad, Articulo articulo) {
		this.setNroItemOrdenDeCompra(nroItemOrdenDeCompra);
		this.cantidad = cantidad;
		this.articulo = articulo;
	}

	public ItemOrdenDeCompra() {
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public Articulo getArticulo() {
		return articulo;
	}
	
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public int getNroItemOrdenDeCompra() {
		return nroItemOrdenDeCompra;
	}

	public void setNroItemOrdenDeCompra(int nroItemOrdenDeCompra) {
		this.nroItemOrdenDeCompra = nroItemOrdenDeCompra;
	}
	
	
}
