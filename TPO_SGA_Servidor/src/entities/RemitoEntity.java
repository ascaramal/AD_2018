package entities;

import java.util.Date;
import java.util.List;


public class RemitoEntity {

	private int numero;
	private int prefijo;
	private Date fecha;
	private ClienteEntity cliente;
	private List<ItemRemitoEntity> items;
	
	public RemitoEntity() {
		
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

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public List<ItemRemitoEntity> getItems() {
		return items;
	}

	public void setItems(List<ItemRemitoEntity> items) {
		this.items = items;
	}
	
	
}
