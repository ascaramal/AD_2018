package negocio;

import java.util.List;

public class OrdenDeCompra {
	
	private int nroOrdenDeCompra;
	private List<ItemOrdenDeCompra> itemsOC;
	
	public int getNroOrdenDeCompra() {
		return nroOrdenDeCompra;
	}
	
	public void setNroOrdenDeCompra(int nroOrdenDeCompra) {
		this.nroOrdenDeCompra = nroOrdenDeCompra;
	}

	public List<ItemOrdenDeCompra> getItemsOC() {
		return itemsOC;
	}

	public void setItemsOC(List<ItemOrdenDeCompra> itemsOC) {
		this.itemsOC = itemsOC;
	}

	
	public void imprimirOrdenDeCompra() { 
		
	}
	
}
