package entities;

import java.util.List;

public class OrdenAlmacenamiento extends OrdenEntity {

	private OrdenDeCompra ordenDeCompra;

	public OrdenAlmacenamiento(int nroOrden, List<ItemOrdenEntity> itemsOrden, OrdenDeCompra ordenDeCompra) {
		super(nroOrden, itemsOrden);
		this.ordenDeCompra = ordenDeCompra;
	}

	public OrdenDeCompra getOrdenDeCompra() {
		return ordenDeCompra;
	}

	public void setOrdenDeCompra(OrdenDeCompra ordenDeCompra) {
		this.ordenDeCompra = ordenDeCompra;
	}
	
	
	
}
