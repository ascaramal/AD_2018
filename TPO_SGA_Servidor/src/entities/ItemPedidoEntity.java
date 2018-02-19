package entities;


public class ItemPedidoEntity {
	
	private int nroItemPedido;
	private ArticuloEntity articulo;
	private int cantidad;

	public ItemPedidoEntity() {
		
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
