package negocio;

import java.util.List;

public class OrdenDespacho extends Orden {

	private int nroOrdenDespacho;
	private Pedido pedido;
	
	
	public OrdenDespacho(int nroOrden, List<ItemOrden> itemsOrden, int nroOrdenDespacho, Pedido pedido) {
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
	
	public Pedido getPedido() {
		return pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
}
