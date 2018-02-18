package negocio;

import java.util.List;

public abstract class Orden {
	
	protected int nroOrden;
	protected List<ItemOrden> itemsOrden;
	
	public Orden(int nroOrden, List<ItemOrden> itemsOrden) {
		super();
		this.nroOrden = nroOrden;
		this.itemsOrden = itemsOrden;
	}
	
	public int getNroOrden() {
		return nroOrden;
	}
	
	public void setNroOrden(int nroOrden) {
		this.nroOrden = nroOrden;
	}
	
	public List<ItemOrden> getItemsOrden() {
		return itemsOrden;
	}
	
	public void setItemsOrden(List<ItemOrden> itemsOrden) {
		this.itemsOrden = itemsOrden;
	}
	
	

}
