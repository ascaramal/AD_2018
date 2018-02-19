package entities;

import java.util.ArrayList;
import java.util.List;

import enumerations.EstadoOC;

public class OrdenDeCompraEntity {
	
	private int nroOrdenDeCompra;
	private int nroProveedor;
	private EstadoOC estado;
	private List<ItemOrdenDeCompraEntity> itemsOC;
	
	
	public OrdenDeCompraEntity() {
		this.itemsOC = new ArrayList<ItemOrdenDeCompraEntity>();
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

	public List<ItemOrdenDeCompraEntity> getItemsOC() {
		return itemsOC;
	}

	public void setItemsOC(List<ItemOrdenDeCompraEntity> itemsOC) {
		this.itemsOC = itemsOC;
	}


	public void imprimirOrdenDeCompra() { 
		
	}
	
}
