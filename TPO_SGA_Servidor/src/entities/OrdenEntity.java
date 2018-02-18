package entities;

import java.util.List;

public abstract class OrdenEntity {
	
	protected int nroOrden;
	protected List<ItemOrdenEntity> itemsOrden;
	
	public OrdenEntity() {
		
	}
	
	public OrdenEntity(int nroOrden, List<ItemOrdenEntity> itemsOrden) {
		this.nroOrden = nroOrden;
		this.itemsOrden = itemsOrden;
	}

	public int getNroOrden() {
		return nroOrden;
	}

	public void setNroOrden(int nroOrden) {
		this.nroOrden = nroOrden;
	}

	public List<ItemOrdenEntity> getItemsOrden() {
		return itemsOrden;
	}

	public void setItemsOrden(List<ItemOrdenEntity> itemsOrden) {
		this.itemsOrden = itemsOrden;
	}
	
	
}
