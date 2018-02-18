package entities;

import java.io.Serializable;
import java.util.List;

import enumerations.EstadoOC;

public class OrdenDeCompraEntity implements Serializable{

	private static final long serialVersionUID = -60969457653842533L;
	
	private int nroOrdenDeCompra;
	private int nroProveedor;
	private EstadoOC estado;
	private List<ItemOrdenDeCompraEntity> itemsOC;
	
	
	public OrdenDeCompraEntity() {
		
	}
	
	public OrdenDeCompraEntity(int nroOrdenDeCompra, int nroProveedor, EstadoOC estado,
			List<ItemOrdenDeCompraEntity> itemsOC) {
		super();
		this.nroOrdenDeCompra = nroOrdenDeCompra;
		this.nroProveedor = nroProveedor;
		this.estado = estado;
		this.itemsOC = itemsOC;
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
