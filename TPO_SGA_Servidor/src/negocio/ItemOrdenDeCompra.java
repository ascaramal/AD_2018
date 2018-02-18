package negocio;

public class ItemOrdenDeCompra {

	private int cantidad;
	private Articulo articulo;
	
	public ItemOrdenDeCompra(int cantidad, Articulo articulo) {
		this.cantidad = cantidad;
		this.articulo = articulo;
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
	
	
}
