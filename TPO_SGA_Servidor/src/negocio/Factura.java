package negocio;

import java.util.ArrayList;
import java.util.List;

public class Factura extends Comprobante{

	private List<ItemFactura> itemsFactura = new ArrayList<ItemFactura>();
	
	
	public List<ItemFactura> getItemsFactura() {
		return itemsFactura;
	}
	
	public void setItemsFactura(List<ItemFactura> itemsFactura) {
		this.itemsFactura = itemsFactura;
	}

	//metodos 
	public float calcularTotal() {
		return 0;	
	}
	
	public void agregarItemFactura(ItemFactura item) {
		itemsFactura.add(item);
	}
}
