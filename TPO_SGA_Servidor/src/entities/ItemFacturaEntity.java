package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ItemsFactura")
public class ItemFacturaEntity {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idItemFactura")
	private int nroItemFactura;
	private int cantidad;
	private ArticuloEntity articulo;
	private float precio;

	//Constructor
	public ItemFacturaEntity() {
		
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
