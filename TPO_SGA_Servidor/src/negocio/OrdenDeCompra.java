package negocio;

import java.util.ArrayList;
import java.util.List;

import dto.OrdenDeCompraDTO;
import enumerations.EstadoOC;

public class OrdenDeCompra {

	private int nroOrdenDeCompra;
	private int nroProveedor;
	private EstadoOC estado;
	private List<ItemOrdenDeCompra> itemsOC;
	private List<OrdenDeTrabajo> ordenesDeTrabajo;

	// Constructor
	public OrdenDeCompra() {
		this.itemsOC = new ArrayList<ItemOrdenDeCompra>();
		this.ordenesDeTrabajo = new ArrayList<OrdenDeTrabajo>();
	}

	public OrdenDeCompra(int nroOrdenDeCompra, int nroProveedor, EstadoOC estado, List<ItemOrdenDeCompra> itemsOC,
			List<OrdenDeTrabajo> ordenesDeTrabajo) {
		this.nroOrdenDeCompra = nroOrdenDeCompra;
		this.nroProveedor = nroProveedor;
		this.estado = estado;
		this.itemsOC = itemsOC;
		this.ordenesDeTrabajo = ordenesDeTrabajo;
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

	public OrdenDeCompraDTO toDTO() {
		OrdenDeCompraDTO res = new OrdenDeCompraDTO();
		res.setNroOrdenDeCompra(this.nroOrdenDeCompra);
		res.setEstado(this.estado);
		res.setNroProveedor(this.nroProveedor);
		
		for (ItemOrdenDeCompra itemOC : this.itemsOC) {
			res.getItemsOC().add(itemOC.toDTO());
		}
		
		
		return res;
		
	}

	public void agregarItemOC(ItemOrdenDeCompra itemOC) {
		itemsOC.add(itemOC);
	}
}
