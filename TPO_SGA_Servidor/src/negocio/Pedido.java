package negocio;

import java.util.Date;
import java.util.List;

import dto.PedidoDTO;
import enumerations.EstadoPedido;

public class Pedido {

	private int nroPedido;
	private Cliente cliente;
	private EstadoPedido estadoPedido;
	private Date fechaGeneracion;
	private Date fechaDespacho;
	private List<ItemPedido> itemPedido;
	private float total;
	
	public Pedido(int nroPedido, Cliente cliente, EstadoPedido estadoPedido, Date fechaGeneracion, Date fechaDespacho,
			List<ItemPedido> itemPedido, float total) {
		this.nroPedido = nroPedido;
		this.cliente = cliente;
		this.estadoPedido = estadoPedido;
		this.fechaGeneracion = fechaGeneracion;
		this.fechaDespacho = fechaDespacho;
		this.itemPedido = itemPedido;
		this.setTotal(total);
	}

	public Pedido() {
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
	
	public List<ItemPedido> getItemPedido() {
		return itemPedido;
	}
	
	public void setItemPedido(List<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public PedidoDTO toDTO() {
		PedidoDTO resultado = new PedidoDTO(nroPedido, cliente.toDTO(), estadoPedido, fechaGeneracion, fechaDespacho,
				itemPedido.toDTO(), total);
		return resultado;
	}
	
	
}
