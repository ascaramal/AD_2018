package dto;

import java.io.Serializable;
import java.util.List;

public class OrdenDeCompraDTO implements Serializable {

	private static final long serialVersionUID = -8121523449254283620L;
	
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

	@Override
	public String toString() {
		return "OrdenDeCompraDTO [nroOrdenDeCompra=" + nroOrdenDeCompra + ", itemsOC=" + itemsOC + "]";
	}
	
	
	
}
