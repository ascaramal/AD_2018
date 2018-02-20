package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Facturas")
public class FacturaEntity{

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="nroFactura")
	private int numero;
	private int prefijo;
	private Date fechaEmision;
	private ClienteEntity cliente;
	private float total;
	private List<ItemFacturaEntity> itemsFactura;
	
	
	//Constructor
	public FacturaEntity() {
		this.itemsFactura = new ArrayList<ItemFacturaEntity>();
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

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

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
