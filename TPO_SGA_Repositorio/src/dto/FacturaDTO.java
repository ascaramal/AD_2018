package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacturaDTO implements Serializable{
	
	private static final long serialVersionUID = 5065139918157523159L;
	
	private int numero;
	private int prefijo;
	private Date fechaEmision;
	private ClienteDTO cliente;
	private float total;
	private List<ItemFacturaDTO> itemsFactura;
	
	//Constructor 
	public FacturaDTO() {
		this.itemsFactura = new ArrayList<ItemFacturaDTO>();  
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(int prefijo) {
		this.prefijo = prefijo;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public List<ItemFacturaDTO> getItemsFactura() {
		return itemsFactura;
	}

	public void setItemsFactura(List<ItemFacturaDTO> itemsFactura) {
		this.itemsFactura = itemsFactura;
	}



	@Override
	public String toString() {
		return "FacturaDTO [numero=" + numero + ", prefijo=" + prefijo + ", fechaEmision=" + fechaEmision + ", cliente="
				+ cliente + ", total=" + total + ", itemsFactura=" + itemsFactura + "]";
	}

	//metodos 
	public float calcularTotal() {
		return 0;	
	}
	
	public void agregarItemFactura(ItemFacturaDTO item) {
		itemsFactura.add(item);
	}
}
