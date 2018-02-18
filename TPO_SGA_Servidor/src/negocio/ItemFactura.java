package negocio;

import java.util.List;
import negocio.Articulo;

public class ItemFactura {

	private int nroItemFactura;
	private int cantidad;
	private List<Articulo> articulos;
	private float precio;


	public ItemFactura(int nroItemFactura, int cantidad, List<Articulo> articulos, float precio) {
		this.nroItemFactura = nroItemFactura;
		this.cantidad = cantidad;
		this.articulos = articulos;
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

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
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
