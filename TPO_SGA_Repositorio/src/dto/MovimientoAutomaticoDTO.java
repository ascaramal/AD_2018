package dto;

public class MovimientoAutomaticoDTO extends MovimientoDTO {

	private int nroPedido;
	
	public MovimientoAutomaticoDTO(int nroMovimiento, String tipoMovimiento, OrdenDeCompraDTO ordenDeCompra, PedidoDTO pedido) {
		super(nroMovimiento, tipoMovimiento, ordenDeCompra, pedido);
	}

	public int getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}

	@Override
	public String toString() {
		return "MovimientoAutomaticoDTO [nroPedido=" + nroPedido + "]";
	}

	
}
