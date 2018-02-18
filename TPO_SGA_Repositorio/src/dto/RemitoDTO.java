package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RemitoDTO implements Serializable {
	
	private static final long serialVersionUID = 9125813595335138324L;
	
	private int numero;
	private int prefijo;
	private Date fecha;
	private ClienteDTO cliente;
	private List<ItemRemitoDTO> items;

	public RemitoDTO() {
	
	}

	public RemitoDTO(int numero, int prefijo, Date fecha, ClienteDTO cliente, List<ItemRemitoDTO> items) {
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

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public List<ItemRemitoDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemRemitoDTO> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "RemitoDTO [numero=" + numero + ", prefijo=" + prefijo + ", fecha=" + fecha + ", cliente=" + cliente
				+ ", items=" + items + "]";
	}
	
	
	
	
}
