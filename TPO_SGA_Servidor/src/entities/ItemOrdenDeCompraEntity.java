package entities;


import javax.persistence.*;

@Entity
@Table(name="ItemsOC")
public class ItemOrdenDeCompraEntity  {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="nroOC")
	private int nroOrdenDeCompra;
	private int cantidad;
	private ArticuloEntity articulo;
	
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

	public int getNroOrdenDeCompra() {
		return nroOrdenDeCompra;
	}

	public void setNroOrdenDeCompra(int nroOrdenDeCompra) {
		this.nroOrdenDeCompra = nroOrdenDeCompra;
	}
	
	
}
