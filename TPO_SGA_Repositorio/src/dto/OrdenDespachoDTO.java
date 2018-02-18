package dto;

import java.util.List;

public class OrdenDespachoDTO extends OrdenDTO {

	private static final long serialVersionUID = -6693312853777264175L;

	private int nroOrdenDespacho;
	private PedidoDTO pedido;
	
	
	public OrdenDespachoDTO(int nroOrden, List<ItemOrdenDTO> itemsOrden, int nroOrdenDespacho, PedidoDTO pedido) {
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
	
	public PedidoDTO getPedido() {
		return pedido;
	}
	
	public void setPedido(PedidoDTO pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "OrdenDespachoDTO [nroOrdenDespacho=" + nroOrdenDespacho + ", pedido=" + pedido + "]";
	}
	
	
}
