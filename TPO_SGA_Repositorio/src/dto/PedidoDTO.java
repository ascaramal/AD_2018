package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumerations.EstadoPedido;

public class PedidoDTO implements Serializable {

	private static final long serialVersionUID = 846109194779402439L;

	private int nroPedido;
	private ClienteDTO cliente;
	private EstadoPedido estadoPedido;
	private Date fechaGeneracion;
	private Date fechaDespacho;
	private List<ItemPedidoDTO> itemsPedido;
	private List<OrdenDeTrabajoDTO> ordenesDeTrabajo;
	private float total;

	// Constructor
	public PedidoDTO() {
		this.itemsPedido = new ArrayList<ItemPedidoDTO>();
		this.ordenesDeTrabajo = new ArrayList<OrdenDeTrabajoDTO>();
	}

	public PedidoDTO(int nroPedido, ClienteDTO cliente, EstadoPedido estadoPedido, Date fechaGeneracion,
			Date fechaDespacho, List<ItemPedidoDTO> itemsPedido, List<OrdenDeTrabajoDTO> ordenesDeTrabajo,
			float total) {
		this.nroPedido = nroPedido;
		this.cliente = cliente;
		this.estadoPedido = estadoPedido; 
		this.fechaGeneracion = fechaGeneracion;
		this.fechaDespacho = fechaDespacho;
		this.itemsPedido = new ArrayList<ItemPedidoDTO>();
		this.ordenesDeTrabajo = new ArrayList<OrdenDeTrabajoDTO>();
		this.total = total;
	}

	public List<OrdenDeTrabajoDTO> getOrdenesDeTrabajo() {
		return ordenesDeTrabajo;
	}

	public void setOrdenesDeTrabajo(List<OrdenDeTrabajoDTO> ordenesDeTrabajo) {
		this.ordenesDeTrabajo = ordenesDeTrabajo;
	}

	public int getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
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

	public List<ItemPedidoDTO> getItemsPedido() {
		return itemsPedido;
	}

	public void setItemsPedido(List<ItemPedidoDTO> itemsPedido) {
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
		return "PedidoDTO [nroPedido=" + nroPedido + ", cliente=" + cliente + ", estadoPedido=" + estadoPedido
				+ ", fechaGeneracion=" + fechaGeneracion + ", fechaDespacho=" + fechaDespacho + ", itemsPedido="
				+ itemsPedido + ", total=" + total + "]";
	}
 
	// Metodo
	public void agregarItemPedido(ItemPedidoDTO iPedido) {
		itemsPedido.add(iPedido);
	}

}
