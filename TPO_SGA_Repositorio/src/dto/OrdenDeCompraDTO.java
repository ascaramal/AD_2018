package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import enumerations.EstadoOC;

public class OrdenDeCompraDTO implements Serializable {

	private static final long serialVersionUID = -129116213862222038L;
	
	private int nroOrdenDeCompra;
	private int nroProveedor;
	private EstadoOC estado;
	private List<ItemOrdenDeCompraDTO> itemsOC;
	
	
	public OrdenDeCompraDTO() {
		this.itemsOC = new ArrayList<ItemOrdenDeCompraDTO>();
	}

	public int getNroOrdenDeCompra() {
		return nroOrdenDeCompra;
	}

	public void setNroOrdenDeCompra(int nroOrdenDeCompra) {
		this.nroOrdenDeCompra = nroOrdenDeCompra;
	}

	public int getNroProveedor() {
		return nroProveedor;
	}

	public void setNroProveedor(int nroProveedor) {
		this.nroProveedor = nroProveedor;
	}

	public EstadoOC getEstado() {
		return estado;
	}

	public void setEstado(EstadoOC estado) {
		this.estado = estado;
	}

	public List<ItemOrdenDeCompraDTO> getItemsOC() {
		return itemsOC;
	}

	public void setItemsOC(List<ItemOrdenDeCompraDTO> itemsOC) {
		this.itemsOC = itemsOC;
	}

	@Override
	public String toString() {
		return "OrdenDeCompraDTO [nroOrdenDeCompra=" + nroOrdenDeCompra + ", nroProveedor=" + nroProveedor + ", estado="
				+ estado + ", itemsOC=" + itemsOC + "]";
	}

	
}
