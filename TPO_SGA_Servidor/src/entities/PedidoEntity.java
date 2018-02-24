package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumerations.EstadoPedido;
import negocio.Articulo;
import negocio.Cliente;
import negocio.ItemPedido;
import negocio.Pedido;

import javax.persistence.*;

import dto.ItemPedidoDTO;
import dto.PedidoDTO;

@Entity
@Table(name="Pedidos")
public class PedidoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nroPedido;
	
	@ManyToOne()
	@JoinColumn(name="nroCliente")
	private ClienteEntity cliente;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="estadoPedido", columnDefinition = "int")
	private EstadoPedido estadoPedido;
	
	@Column(name="fechaGeneracion")
	private Date fechaGeneracion;
	
	@Column(name="fechaDespacho")
	private Date fechaDespacho;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name ="nroPedido")
	private List<ItemPedidoEntity> itemsPedido = new ArrayList<ItemPedidoEntity>();;
	
	@Column(name="total")
	private float total;
	
	
	//Constructor
	public PedidoEntity() {
		
	}

	public int getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public EstadoPedido getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(EstadoPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public Date getFechaDespacho() {
		return fechaDespacho;
	}

	public void setFechaDespacho(Date fechaDespacho) {
		this.fechaDespacho = fechaDespacho;
	}

	public List<ItemPedidoEntity> getItemsPedido() {
		return itemsPedido;
	}

	public void setItemsPedido(List<ItemPedidoEntity> itemsPedido) {
		this.itemsPedido = itemsPedido;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "PedidoEntity [nroPedido=" + nroPedido + ", cliente=" + cliente + ", estadoPedido=" + estadoPedido
				+ ", fechaGeneracion=" + fechaGeneracion + ", fechaDespacho=" + fechaDespacho + ", itemsPedido="
				+ itemsPedido + ", total=" + total + "]";
	}
	
	
}
