package negocio;

import java.util.List;

public class OrdenDespacho extends Orden {

	private int numeroPedido;

	
	public OrdenDespacho(int nroOrden, List<ItemOrden> itemsOrden, int numeroPedido) {
		super(nroOrden, itemsOrden);
		this.numeroPedido = numeroPedido;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	
	
	
}
