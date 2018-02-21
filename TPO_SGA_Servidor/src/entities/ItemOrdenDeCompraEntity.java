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
@Table(name="ItemsOC")
public class ItemOrdenDeCompraEntity  {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idItemOC")
	private int nroItemOrdenDeCompra;
	@Column(name="cant")
	private int cantidad;
	
	@ManyToOne
	@JoinColumn(name="codArticulo")
	private ArticuloEntity articulo;
	
	@ManyToOne
	@JoinColumn(name="nroOC")
	private OrdenDeCompraEntity ordenDeCompraEntity;
	
	
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

	public int getNroItemOrdenDeCompra() {
		return nroItemOrdenDeCompra;
	}

	public void setNroItemOrdenDeCompra(int nroItemOrdenDeCompra) {
		this.nroItemOrdenDeCompra = nroItemOrdenDeCompra;
	}
	
	
}
