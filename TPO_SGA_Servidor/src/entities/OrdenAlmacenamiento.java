package entities;

import java.util.List;

public class OrdenAlmacenamiento extends OrdenEntity {

	private OrdenDeCompraEntity ordenDeCompra;

	public OrdenAlmacenamiento(int nroOrden, List<ItemOrdenEntity> itemsOrden, OrdenDeCompraEntity ordenDeCompra) {
		super(nroOrden, itemsOrden);
		this.ordenDeCompra = ordenDeCompra;
	}

	public OrdenDeCompraEntity getOrdenDeCompra() {
		return ordenDeCompra;
	}

	public void setOrdenDeCompra(OrdenDeCompraEntity ordenDeCompra) {
		this.ordenDeCompra = ordenDeCompra;
	}
	
	
	
}
