package entities;

import java.util.ArrayList;
import java.util.List;

public class FacturaEntity extends ComprobanteEntity{

	private List<ItemFacturaEntity> itemsFactura = new ArrayList<ItemFacturaEntity>();
	
	
	public List<ItemFacturaEntity> getItemsFactura() {
		return itemsFactura;
	}
	
	public void setItemsFactura(List<ItemFacturaEntity> itemsFactura) {
		this.itemsFactura = itemsFactura;
	}

	//metodos 
	public float calcularTotal() {
		return 0;	
	}
	
	public void agregarItemFactura(ItemFacturaEntity item) {
		itemsFactura.add(item);
	}
}
