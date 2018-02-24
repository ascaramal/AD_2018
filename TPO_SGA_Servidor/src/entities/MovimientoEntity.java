package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Movimientos")
public class MovimientoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nroMovimiento;
	private String tipoMovimiento;
	private int nroPedido;

	@Column(name = "nroOCompra")
	private int nroOrdenDeCompra;

	@Column(name = "motivoDeAjuste")
	private String motivoAjuste;

	@Column(name = "cantidad")
	private int cant;
	private String empleado;

	@ManyToOne
	@JoinColumn(name = "codArticulo")
	private ArticuloEntity articuloEntity;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "LotesMovimientos")
	private List<LoteEntity> lotes;

	
	// Constructor
	public MovimientoEntity() {
		this.lotes = new ArrayList<LoteEntity>();
	}

	public int getNroMovimiento() {
		return nroMovimiento;
	}

	public void setNroMovimiento(int nroMovimiento) {
		this.nroMovimiento = nroMovimiento;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public int getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}

	public ArticuloEntity getArticuloEntity() {
		return articuloEntity;
	}

	public void setArticuloEntity(ArticuloEntity articuloEntity) {
		this.articuloEntity = articuloEntity;
	}

	public int getNroOrdenDeCompra() {
		return nroOrdenDeCompra;
	}

	public void setNroOrdenDeCompra(int nroOrdenDeCompra) {
		this.nroOrdenDeCompra = nroOrdenDeCompra;
	}

	public String getMotivoAjuste() {
		return motivoAjuste;
	}

	public void setMotivoAjuste(String motivoAjuste) {
		this.motivoAjuste = motivoAjuste;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

	public void agregarMovimiento() {

	}

	public List<LoteEntity> getLotes() {
		return lotes;
	}

	public void setLotes(List<LoteEntity> lotes) {
		this.lotes = lotes;
	}

}
