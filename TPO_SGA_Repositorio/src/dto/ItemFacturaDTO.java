package dto;

import java.util.List;

public class ItemFacturaDTO {

	private int nroItemFactura;
	private int cantidad;
	private List<ArticuloDTO> articulos;
	private float precio;


	public ItemFacturaDTO(int nroItemFactura, int cantidad, List<ArticuloDTO> articulos, float precio) {
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

	public List<ArticuloDTO> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<ArticuloDTO> articulos) {
		this.articulos = articulos;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	@Override
	public String toString() {
		return "ItemFacturaDTO [nroItemFactura=" + nroItemFactura + ", cantidad=" + cantidad + ", articulos="
				+ articulos + ", precio=" + precio + "]";
	}

	//metodos
    public float getSubtotal() {
        return this.precio * this.cantidad;
    }
	
	
}
