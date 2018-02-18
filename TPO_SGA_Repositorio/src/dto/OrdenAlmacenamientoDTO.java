package dto;

import java.util.List;

public class OrdenAlmacenamientoDTO extends OrdenDTO {

	
	private OrdenDeCompraDTO ordenDeCompra;

	public OrdenAlmacenamientoDTO(int nroOrden, List<ItemOrdenDTO> itemsOrden, OrdenDeCompraDTO ordenDeCompra) {
		super(nroOrden, itemsOrden);
		this.ordenDeCompra = ordenDeCompra;
	}

	public OrdenDeCompraDTO getOrdenDeCompra() {
		return ordenDeCompra;
	}

	public void setOrdenDeCompra(OrdenDeCompraDTO ordenDeCompra) {
		this.ordenDeCompra = ordenDeCompra;
	}

	@Override
	public String toString() {
		return "OrdenAlmacenamientoDTO [ordenDeCompra=" + ordenDeCompra + "]";
	}
	
}
