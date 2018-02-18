package entities;



public class ItemFacturaEntity {

	private int nroItemFactura;
	private int cantidad;
	private ArticuloEntity articulo;
	private float precio;


	public ItemFacturaEntity(int nroItemFactura, int cantidad, ArticuloEntity articulo, float precio) {
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

	public ArticuloEntity getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloEntity articulo) {
		this.articulo = articulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}


	//metodos
    public float getSubtotal() {
        return this.precio * this.cantidad;
    }
	
	
}
