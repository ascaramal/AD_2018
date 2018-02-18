package entities;

public class MovimientoAutomatico extends MovimientoEntity {

	private int nroPedido;
	
	public MovimientoAutomatico(int nroMovimiento, String tipoMovimiento, OrdenDeCompra ordenDeCompra, PedidoEntity pedido) {
		super(nroMovimiento, tipoMovimiento, ordenDeCompra, pedido);
	}

	public int getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}

	
}
