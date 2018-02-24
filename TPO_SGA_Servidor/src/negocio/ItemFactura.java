package negocio;

import dto.ItemFacturaDTO;
import negocio.Articulo;

public class ItemFactura {

	private int nroItemFactura;
	private int cantidad;
	private Articulo articulo;
	private float precio;
	
	
	//Constructor
	public ItemFactura() {
	
	}
	
	public ItemFactura(int nroItemFactura, int cantidad, Articulo articulo, float precio) {
		this.nroItemFactura = nroItemFactura;
		this.cantidad = cantidad;
		this.articulo = articulo;
		this.precio = precio;
	}

	public int getNroItemFactura() {
		return nroItemFactura;
	}

	public void setNroItemFactura(int nroItemFactura) {
		this.nroItemFactura = nroItemFactura;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public ItemFacturaDTO toDTO() {
		ItemFacturaDTO res = new ItemFacturaDTO();
		res.setNroItemFactura(this.nroItemFactura);
		res.setCantidad(this.cantidad);
		res.setPrecio(this.precio);

		if (this.articulo != null)
			res.setArticulo(this.articulo.toDTO());

		return res;	
	}
	
	// metodos
	public float getSubtotal() {
		return this.precio * this.cantidad;
	}

}
