package entities;

import java.util.List;

public class OrdenDeCompraEntity {
	
	private int nroOrdenDeCompra;
	private List<ItemOrdenDeCompraEntity> itemsOC;
	
	public int getNroOrdenDeCompra() {
		return nroOrdenDeCompra;
	}
	
	public void setNroOrdenDeCompra(int nroOrdenDeCompra) {
		this.nroOrdenDeCompra = nroOrdenDeCompra;
	}

	public List<ItemOrdenDeCompraEntity> getItemsOC() {
		return itemsOC;
	}

	public void setItemsOC(List<ItemOrdenDeCompraEntity> itemsOC) {
		this.itemsOC = itemsOC;
	}

	
	public void imprimirOrdenDeCompra() { 
		
	}
	
}
