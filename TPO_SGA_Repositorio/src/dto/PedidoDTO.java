package dto;

import java.io.Serializable;
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
	private List<ItemPedidoDTO> itemPedido;
	
		
	public PedidoDTO(int nroPedido, ClienteDTO cliente, EstadoPedido estadoPedido, Date fechaGeneracion, Date fechaDespacho,
			List<ItemPedidoDTO> itemPedido) {
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
	
	public List<ItemPedidoDTO> getItemPedido() {
		return itemPedido;
	}
	
	public void setItemPedido(List<ItemPedidoDTO> itemPedido) {
		this.itemPedido = itemPedido;
	}
	
	@Override
	public String toString() {
		return "PedidoDTO [nroPedido=" + nroPedido + ", cliente=" + cliente + ", estadoPedido=" + estadoPedido
				+ ", fechaGeneracion=" + fechaGeneracion + ", fechaDespacho=" + fechaDespacho + ", itemPedido="
				+ itemPedido + "]";
	}

}
