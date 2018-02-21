package entities;	

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Remitos")
public class RemitoEntity {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="nroRemito")
	private int numero;
	
	private int prefijo;
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="nroRemito")
	private ClienteEntity cliente;
	
	@OneToMany
	@JoinColumn(name="nroRemito")
	private List<ItemRemitoEntity> items;
	

	
	//Constructor
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
