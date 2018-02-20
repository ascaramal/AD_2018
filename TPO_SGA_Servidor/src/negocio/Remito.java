package negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dto.ItemRemitoDTO;
import dto.RemitoDTO;

public class Remito {
	
	private int numero;
	private int prefijo;
	private Date fecha;
	private Cliente cliente;
	private List<ItemRemito> items;
	
	public Remito(int numero, int prefijo, Date fecha, Cliente cliente, List<ItemRemito> items) {
		this.numero = numero;
		this.prefijo = prefijo;
		this.fecha = fecha;
		this.cliente = cliente;
		this.items = new ArrayList<ItemRemito>();
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemRemito> getItems() {
		return items;
	}

	public void setItems(List<ItemRemito> items) {
		this.items = items;
	}
	
	public RemitoDTO toDTO() {
		RemitoDTO res = new RemitoDTO();
		res.setNumero(this.numero);
		res.setPrefijo(this.prefijo);
		res.setCliente(this.cliente.toDTO());
		res.setFecha(this.fecha);
		
		for(ItemRemito itemRAux : this.getItems()) {
			ItemRemitoDTO itemRDTO = itemRAux.toDTO();
			itemRDTO.setRemito(res);
			res.getItems().add(itemRDTO);
		}
		
		return res;
	}
	
		
}
