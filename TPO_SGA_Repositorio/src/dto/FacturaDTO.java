package dto;

import java.util.ArrayList;
import java.util.List;

public class FacturaDTO extends ComprobanteDTO{

	private static final long serialVersionUID = 1890664212209660227L;
	
	private List<ItemFacturaDTO> itemsFactura = new ArrayList<ItemFacturaDTO>();
	
	
	public List<ItemFacturaDTO> getItemsFactura() {
		return itemsFactura;
	}
	
	public void setItemsFactura(List<ItemFacturaDTO> itemsFactura) {
		this.itemsFactura = itemsFactura;
	}

	
	
	@Override
	public String toString() {
		return "FacturaDTO [itemsFactura=" + itemsFactura + "]";
	}

	//metodos 
	public float calcularTotal() {
		return 0;	
	}
	
	public void agregarItemFactura(ItemFacturaDTO item) {
		itemsFactura.add(item);
	}
}
