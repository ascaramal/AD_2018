package entities;

import java.util.Date;
import java.util.List;

import enumerations.EstadoPedido;

public class PedidoEntity {

	private int nroPedido;
	private ClienteEntity cliente;
	private EstadoPedido estadoPedido;
	private Date fechaGeneracion;
	private Date fechaDespacho;
	private List<ItemPedidoEntity> itemPedido;
	
		
	public PedidoEntity(int nroPedido, ClienteEntity cliente, EstadoPedido estadoPedido, Date fechaGeneracion, Date fechaDespacho,
			List<ItemPedidoEntity> itemPedido) {
		this.nroPedido = nroPedido;
		this.cliente = cliente;
		this.estadoPedido = estadoPedido;
		this.fechaGeneracion = fechaGeneracion;
		this.fechaDespacho = fechaDespacho;
		this.itemPedido = itemPedido;
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
	
	public List<ItemPedidoEntity> getItemPedido() {
		return itemPedido;
	}
	
	public void setItemPedido(List<ItemPedidoEntity> itemPedido) {
		this.itemPedido = itemPedido;
	}
	
	
}
