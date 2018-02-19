package entities;

import java.io.Serializable;

public class ItemOrdenDeCompraEntity implements Serializable {

	private static final long serialVersionUID = -5799446753184265316L;

	private int nroOrdenDeCompra;
	private int cantidad;
	private ArticuloEntity articulo;
	
	//Constructor
	public ItemOrdenDeCompraEntity() {
	
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

	public int getNroOrdenDeCompra() {
		return nroOrdenDeCompra;
	}

	public void setNroOrdenDeCompra(int nroOrdenDeCompra) {
		this.nroOrdenDeCompra = nroOrdenDeCompra;
	}
	
	
}
