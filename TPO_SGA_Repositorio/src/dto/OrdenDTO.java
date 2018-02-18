package dto;

import java.io.Serializable;
import java.util.List;

public abstract class OrdenDTO implements Serializable {

	private static final long serialVersionUID = 2693607474901881367L;
	
	protected int nroOrden;
	protected List<ItemOrdenDTO> itemsOrden;
	
	public OrdenDTO(int nroOrden, List<ItemOrdenDTO> itemsOrden) {
		this.nroOrden = nroOrden;
		this.itemsOrden = itemsOrden;
	}

	public int getNroOrden() {
		return nroOrden;
	}

	public void setNroOrden(int nroOrden) {
		this.nroOrden = nroOrden;
	}

	public List<ItemOrdenDTO> getItemsOrden() {
		return itemsOrden;
	}

	public void setItemsOrden(List<ItemOrdenDTO> itemsOrden) {
		this.itemsOrden = itemsOrden;
	}
	
	
}
