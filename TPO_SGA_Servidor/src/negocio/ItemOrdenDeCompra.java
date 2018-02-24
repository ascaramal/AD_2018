package negocio;

import dto.ItemOrdenDeCompraDTO;

public class ItemOrdenDeCompra {

	private int nroItemOrdenDeCompra;
	private int cantidad;
	private Articulo articulo;
	
	
	//Constructor
	public ItemOrdenDeCompra() {
	
	}

	public ItemOrdenDeCompra(int nroItemOrdenDeCompra, int cantidad, Articulo articulo) {
		this.nroItemOrdenDeCompra = nroItemOrdenDeCompra;
		this.cantidad = cantidad;
		this.articulo = articulo;
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

	public int getNroItemOrdenDeCompra() {
		return nroItemOrdenDeCompra;
	}

	public void setNroItemOrdenDeCompra(int nroItemOrdenDeCompra) {
		this.nroItemOrdenDeCompra = nroItemOrdenDeCompra;
	}

	public ItemOrdenDeCompraDTO toDTO() {
		ItemOrdenDeCompraDTO res = new ItemOrdenDeCompraDTO();
		res.setNroItemOrdenDeCompra(this.nroItemOrdenDeCompra);
		res.setCantidad(this.cantidad);
		
		if (this.articulo != null)
			res.setArticulo(this.articulo.toDTO());
		
		return res;
	}
	
	
}
