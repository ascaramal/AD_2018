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

	public ItemPedido() {
		
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
	
	public float calcularSubtotal()
	{
		return (this.articulo.getPrecio() * this.cantidad);
	}
	
	public ItemPedidoDTO toDTO() {
		ItemPedidoDTO res = new ItemPedidoDTO();
		res.setNroItemPedido(this.nroItemPedido);
		res.setCantidad(this.cantidad);

		if (this.articulo != null)
			res.setArticulo(this.articulo.toDTO());
			
		return res;
	}
}
