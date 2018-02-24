package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumerations.EstadoPedido;

import javax.persistence.*;

@Entity
@Table(name="Pedidos")
public class PedidoEntity implements Serializable {
	
	private static final long serialVersionUID = 5317362669318773293L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nroPedido;
	
	@ManyToOne
	@JoinColumn(name="nroCliente")
	private ClienteEntity cliente;
	
	@Column(name="estadoPedido")
	private EstadoPedido estadoPedido;
	
	@Column(name="fechaGeneracion")
	private Date fechaGeneracion;
	
	@Column(name="fechaDespacho")
	private Date fechaDespacho;
	
	@OneToMany(cascade=CascadeType.ALL) 
	@JoinColumn(name="nroPedido")
	private List<ItemPedidoEntity> itemsPedido;
	
	@Column(name="total")
	private float total;
	
	public PedidoEntity() {
		this.itemsPedido = new ArrayList<ItemPedidoEntity>();
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
	
	
}
