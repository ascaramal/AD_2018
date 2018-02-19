package negocio;

import dto.ItemPedidoDTO;

public class ItemPedido {
	
	private int nroItemPedido;
	private Articulo articulo;
	private int cantidad;

	
	public ItemPedido(int nroItemPedido, Articulo articulo, int cantidad) {
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
	
	public ItemPedidoDTO toDTO() {
		ItemPedidoDTO resultado = new ItemPedidoDTO();
		resultado.setNroItemPedido(this.nroItemPedido);
		resultado.setArticulo(this.articulo.toDTO());
		resultado.setCantidad(this.cantidad);
		
		return resultado;
	}
}
