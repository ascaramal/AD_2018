package entities;

public class ItemOrdenDeCompra {

	private int cantidad;
	private ArticuloEntity articulo;
	
	public ItemOrdenDeCompra(int cantidad, ArticuloEntity articulo) {
		this.cantidad = cantidad;
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public ArticuloEntity getArticulo() {
		return articulo;
	}
	
	public void setArticulo(ArticuloEntity articulo) {
		this.articulo = articulo;
	}
	
	
}
