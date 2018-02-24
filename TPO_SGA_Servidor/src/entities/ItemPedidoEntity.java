package entities;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ItemsPedido")
public class ItemPedidoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nroItemPedido")
	private int nroItemPedido;

//	@ManyToOne(cascade = CascadeType.ALL)
	@ManyToOne()
	@JoinColumn(name = "codArticulo")
	private ArticuloEntity articulo;

	@Column(name="cantidad")
	private int cantidad;

//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name = "nroPedido")
	private PedidoEntity pedidoEntity;

	
	
	// Constructor
	public ItemPedidoEntity() {

	}

	public int getNroItemPedido() {
		return nroItemPedido;
	}

	public void setNroItemPedido(int nroItemPedido) {
		this.nroItemPedido = nroItemPedido;
	}

	public ArticuloEntity getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloEntity articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public PedidoEntity getPedidoEntity() {
		return pedidoEntity;
	}

	public void setPedidoEntity(PedidoEntity pedidoEntity) {
		this.pedidoEntity = pedidoEntity;
	}

	@Override
	public String toString() {
		return "ItemPedidoEntity [nroItemPedido=" + nroItemPedido + ", articulo=" + articulo + ", cantidad=" + cantidad
				+ ", pedidoEntity=" + pedidoEntity + "]";
	}

}
