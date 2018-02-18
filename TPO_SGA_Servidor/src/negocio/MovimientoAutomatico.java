package negocio;

public class MovimientoAutomatico extends Movimiento {

	private int nroPedido;
	
	public MovimientoAutomatico(int nroMovimiento, String tipoMovimiento, OrdenDeCompra ordenDeCompra, Pedido pedido) {
		super(nroMovimiento, tipoMovimiento, ordenDeCompra, pedido);
	}

	public int getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}

	
}
