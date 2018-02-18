package negocio;

import java.util.Date;
import java.util.List;

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
		this.items = items;
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
	
	
		
}
