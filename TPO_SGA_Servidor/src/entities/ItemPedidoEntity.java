package entities;

public class ItemPedidoEntity {
	
	private int nroItemPedido;
	private ArticuloEntity articulo;
	private int cantidad;

	
	public ItemPedidoEntity(int nroItemPedido, ArticuloEntity articulo, int cantidad) {
		this.nroItemPedido = nroItemPedido;
		this.articulo = articulo;
		this.cantidad = cantidad;
	}

	public int getNroItemPedido() {
		return nroItemPedido;
	}
	
	public void setNroItemPedido(int nroItemPedido) {
		this.nroItemPedido = nroItemPedido;
	}
	
	public ArticuloEntity getArticulo() {
		return articulo;
	}
	
	public void setArticulo(ArticuloEntity articulo) {
		this.articulo = articulo;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
