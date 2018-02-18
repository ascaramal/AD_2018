package dto;

import java.io.Serializable;

public class ItemOrdenDeCompraDTO implements Serializable{

	private static final long serialVersionUID = 2331798291360422676L;
	
	private int cantidad;
	private ArticuloDTO articulo;
	
	public ItemOrdenDeCompraDTO() {
		
	}
	
	public ItemOrdenDeCompraDTO(int cantidad, ArticuloDTO articulo) {
		this.cantidad = cantidad;
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public ArticuloDTO getArticulo() {
		return articulo;
	}
	
	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}

	@Override
	public String toString() {
		return "ItemOrdenDeCompra [cantidad=" + cantidad + ", articulo=" + articulo + "]";
	}
	
	
}
