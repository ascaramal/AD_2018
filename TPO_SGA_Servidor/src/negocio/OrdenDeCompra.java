package negocio;

import java.util.ArrayList;
import java.util.List;

import enumerations.EstadoOC;

public class OrdenDeCompra {
	
	private int nroOrdenDeCompra;
	private int nroProveedor;
	private EstadoOC estado;
	private List<ItemOrdenDeCompra> itemsOC;
	
	public OrdenDeCompra(int nroOrdenDeCompra, int nroProveedor, EstadoOC estado, List<ItemOrdenDeCompra> itemsOC) {
		this.nroOrdenDeCompra = nroOrdenDeCompra;
		this.nroProveedor = nroProveedor;
		this.estado = estado;
		this.itemsOC = new ArrayList<ItemOrdenDeCompra>();
	}

	public OrdenDeCompra() {
		this.itemsOC = new ArrayList<ItemOrdenDeCompra>();
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

	public List<ItemOrdenDeCompra> getItemsOC() {
		return itemsOC;
	}

	public void setItemsOC(List<ItemOrdenDeCompra> itemsOC) {
		this.itemsOC = itemsOC;
	}

	public void imprimirOrdenDeCompra() { 
		
	}
	
	public void agregarItemOC(ItemOrdenDeCompra itemOC) {
		itemsOC.add(itemOC);
	}
}
