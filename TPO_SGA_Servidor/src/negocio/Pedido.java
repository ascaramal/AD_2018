package negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dto.ItemPedidoDTO;
import dto.OrdenDeTrabajoDTO;
import dto.PedidoDTO;
import enumerations.EstadoPedido;

public class Pedido {

	private int nroPedido;
	private Cliente cliente;
	private EstadoPedido estadoPedido;
	private Date fechaGeneracion;
	private Date fechaDespacho;
	private List<ItemPedido> itemsPedido;
	private List<OrdenDeTrabajo> ordenesDeTrabajo;
	private float total;
	
	public Pedido() {
		
	}
	
	public Pedido(int nroPedido, Cliente cliente, EstadoPedido estadoPedido, Date fechaGeneracion, Date fechaDespacho,
			List<ItemPedido> itemsPedido, List<OrdenDeTrabajo> ordenesDeTrabajo, float total) {
		this.nroPedido = nroPedido;
		this.cliente = cliente;
		this.estadoPedido = estadoPedido;
		this.fechaGeneracion = fechaGeneracion;
		this.fechaDespacho = fechaDespacho;
		this.itemsPedido = new ArrayList<ItemPedido>();
		this.ordenesDeTrabajo = new ArrayList<OrdenDeTrabajo>();
		this.total = total;
	}

	public int getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
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

	public List<ItemPedido> getItemsPedido() {
		return itemsPedido;
	}

	public void setItemsPedido(List<ItemPedido> itemsPedido) {
		this.itemsPedido = itemsPedido;
	}

	public List<OrdenDeTrabajo> getOrdenesDeTrabajo() {
		return ordenesDeTrabajo;
	}

	public void setOrdenesDeTrabajo(List<OrdenDeTrabajo> ordenesDeTrabajo) {
		this.ordenesDeTrabajo = ordenesDeTrabajo;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	
	//Metodos
	public void agregarItemPedido(ItemPedido itemP) {
		itemsPedido.add(itemP);
	}
	
	public PedidoDTO toDTO() {
		PedidoDTO res = new PedidoDTO();
		res.setNroPedido(this.nroPedido);
		res.setCliente(this.cliente.toDTO());
		res.setEstadoPedido(this.estadoPedido);
		res.setFechaGeneracion(this.getFechaGeneracion());
		res.setFechaDespacho(this.fechaDespacho);
		res.setTotal(this.total);
		
		for(ItemPedido iPedidoAux : this.getItemsPedido()) {
			ItemPedidoDTO itemPDTO = iPedidoAux.toDTO();
			itemPDTO.setPedido(res);
			
		}
		
		for(OrdenDeTrabajo oDeTAux : this.getOrdenesDeTrabajo()) {
			OrdenDeTrabajoDTO oDeTDTO = oDeTAux.toDTO();
			oDeTDTO.setPedido(res);
		}
		
		return res;
	}
	
}
