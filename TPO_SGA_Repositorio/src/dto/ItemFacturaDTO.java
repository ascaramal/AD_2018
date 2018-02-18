package dto;


public class ItemFacturaDTO {

	private int nroItemFactura;
	private int cantidad;
	private ArticuloDTO articulo;
	private float precio;


	public ItemFacturaDTO(int nroItemFactura, int cantidad, ArticuloDTO articulo, float precio) {
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

	public ArticuloDTO getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "ItemFacturaDTO [nroItemFactura=" + nroItemFactura + ", cantidad=" + cantidad + ", articulo=" + articulo
				+ ", precio=" + precio + "]";
	}

	//metodos
    public float getSubtotal() {
        return this.precio * this.cantidad;
    }
	
	
}
