package negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dto.FacturaDTO;
import dto.ItemFacturaDTO;


public class Factura {

	private int numero;
	private int prefijo;
	private Date fechaEmision;
	private Cliente cliente;
	private float total;
	private List<ItemFactura> itemsFactura;
	
	
	public Factura(int numero, int prefijo, Date fechaEmision, Cliente cliente, float total,
			List<ItemFactura> itemsFactura) {
		this.numero = numero;
		this.prefijo = prefijo;
		this.fechaEmision = fechaEmision;
		this.cliente = cliente;
		this.total = total;
		this.itemsFactura = new ArrayList<ItemFactura>();
	}
	
	
	public Factura() {
		this.itemsFactura = new ArrayList<ItemFactura>();
		
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public List<ItemFactura> getItemsFactura() {
		return itemsFactura;
	}

	public void setItemsFactura(List<ItemFactura> itemsFactura) {
		this.itemsFactura = itemsFactura;
	}

	
	public FacturaDTO toDTO() {
		FacturaDTO res = new FacturaDTO();
		res.setNumero(this.numero);
		res.setPrefijo(this.prefijo);
		res.setFechaEmision(this.fechaEmision);
		res.setCliente(this.cliente.toDTO());
		res.setTotal(this.total);
		
		for(ItemFactura itemFacAux : this.getItemsFactura()) {
			ItemFacturaDTO itemFacDTO = itemFacAux.toDTO();
			itemFacDTO.setFactura(res);
			res.getItemsFactura().add(itemFacDTO);
		}
		
		return res; 
	}

	//metodos 
	public float calcularTotal() {
		return 0;	
	}
	
	public void agregarItemFactura(ItemFactura item) {
		itemsFactura.add(item);
	}
}
