package entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Articulos")
public class ArticuloEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codArticulo;
	private String codigoBarras;
	private String marca;
	private String tipo;
	private String descripcion;
	private String presentacion;
	private String tamano;
	private Integer unidad;
	@Column(name = "cantidadAComprar")
	private Integer cantAComprar;
	private Integer cantReservada;
	private Integer cantReal;
	private Integer cantFuturoDisponible;
	private float precio;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "nroMovimiento")
	private List<MovimientoEntity> movimientos;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "codLote")
	private List<LoteEntity> lotes;

	// Constructor
	public ArticuloEntity() {
		this.movimientos = new ArrayList<MovimientoEntity>();
		this.lotes = new ArrayList<LoteEntity>();
	}

	public Integer getCodArticulo() {
		return codArticulo;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public Integer getUnidad() {
		return unidad;
	}

	public void setUnidad(Integer unidad) {
		this.unidad = unidad;
	}

	public Integer getCantAComprar() {
		return cantAComprar;
	}

	public void setCantAComprar(Integer cantAComprar) {
		this.cantAComprar = cantAComprar;
	}

	public Integer getCantReservada() {
		return cantReservada;
	}

	public void setCantReservada(Integer cantReservada) {
		this.cantReservada = cantReservada;
	}

	public Integer getCantReal() {
		return cantReal;
	}

	public void setCantReal(Integer cantReal) {
		this.cantReal = cantReal;
	}

	public Integer getCantFuturoDisponible() {
		return cantFuturoDisponible;
	}

	public void setCantFuturoDisponible(Integer cantFuturoDisponible) {
		this.cantFuturoDisponible = cantFuturoDisponible;
	}

	public void setCodArticulo(Integer codArticulo) {
		this.codArticulo = codArticulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public List<MovimientoEntity> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<MovimientoEntity> movimientos) {
		this.movimientos = movimientos;
	}

	public List<LoteEntity> getLotes() {
		return lotes;
	}

	public void setLotes(List<LoteEntity> lotes) {
		this.lotes = lotes;
	}

}
