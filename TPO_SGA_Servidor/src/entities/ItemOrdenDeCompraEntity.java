package entities;

import java.io.Serializable;

public class ItemOrdenDeCompraEntity implements Serializable {

	private static final long serialVersionUID = -5799446753184265316L;

	private int cantidad;
	private ArticuloEntity articulo;
	
	public ItemOrdenDeCompraEntity(int cantidad, ArticuloEntity articulo) {
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
