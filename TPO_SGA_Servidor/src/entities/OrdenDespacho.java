package entities;

import java.util.List;

public class OrdenDespacho extends OrdenEntity {

	private int nroOrdenDespacho;
	private PedidoEntity pedido;
	
	
	public OrdenDespacho(int nroOrden, List<ItemOrdenEntity> itemsOrden, int nroOrdenDespacho, PedidoEntity pedido) {
		super(nroOrden, itemsOrden);
		this.nroOrdenDespacho = nroOrdenDespacho;
		this.pedido = pedido;
	}

	public int getNroOrdenDespacho() {
		return nroOrdenDespacho;
	}
	
	public void setNroOrdenDespacho(int nroOrdenDespacho) {
		this.nroOrdenDespacho = nroOrdenDespacho;
	}
	
	public PedidoEntity getPedido() {
		return pedido;
	}
	
	public void setPedido(PedidoEntity pedido) {
		this.pedido = pedido;
	}
	
	
}
