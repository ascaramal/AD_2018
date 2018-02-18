package entities;

import java.util.List;

public class OrdenDespachoEntity extends OrdenEntity {

	private int numeroPedido;

	public OrdenDespachoEntity() {
		
	}
	
	public OrdenDespachoEntity(int nroOrden, List<ItemOrdenEntity> itemsOrden, int numeroPedido) {
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
