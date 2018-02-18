package dto;

import java.io.Serializable;

public class ItemPedidoDTO implements Serializable {

	private static final long serialVersionUID = -1470363000856056474L;
	
	private int nroItemPedido;
	private ArticuloDTO articulo;
	private int cantidad;

	
	public ItemPedidoDTO(int nroItemPedido, ArticuloDTO articulo, int cantidad) {
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
	
	public ArticuloDTO getArticulo() {
		return articulo;
	}
	
	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ItemPedidoDTO [nroItemPedido=" + nroItemPedido + ", articulo=" + articulo + ", cantidad=" + cantidad
				+ "]";
	}
	
	
}
