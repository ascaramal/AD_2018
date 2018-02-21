package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ItemsFactura")
public class ItemFacturaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idItemFactura")
	private int nroItemFactura;
	private int cantidad;

	@ManyToOne
	@JoinColumn(name = "codArticulo")
	private ArticuloEntity articulo;
	
	private float precio;

	@ManyToOne
	@JoinColumn(name = "nroFactura")
	private FacturaEntity facturaEntity;

	// Constructor
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

	public FacturaEntity getFacturaEntity() {
		return facturaEntity;
	}

	public void setFacturaEntity(FacturaEntity facturaEntity) {
		this.facturaEntity = facturaEntity;
	}

}
