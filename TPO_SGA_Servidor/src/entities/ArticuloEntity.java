package entities;

import java.util.List;


import javax.persistence.*;

@Entity
@Table(name="Articulos")
public class ArticuloEntity {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codArticulo")
	private int codArticulo;
	
	@Column(name = "codigoBarras")
	private String codigoBarras;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "presentacion")
	private String presentacion;
	
	@Column(name = "tamano")
	private String tamano;
	
	@Column(name = "unidad")
	private int unidad;
	
	@Column(name = "cantidadAComprar")
	private int cantAComprar;
	
	@Column(name = "cantReservada")
	private int cantReservada;
	
	@Column(name = "cantReal")
	private int cantReal;
	
	@Column(name = "cantFuturoDisponible")
	private int cantFuturoDisponible;
	
	@Column(name = "precio")
	private float precio;
	
	@OneToMany
    @JoinColumn(name = "nroMovimiento")
	private List<MovimientoEntity> movimientos;
	
	@OneToMany
    @JoinColumn(name = "codLote")
	private List<LoteEntity> lotes;

	
	
	
	public int getCodArticulo() {
		return codArticulo;
	}

	public void setCodArticulo(int codArticulo) {
		this.codArticulo = codArticulo;
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

	public int getUnidad() {
		return unidad;
	}

	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}

	public int getCantAComprar() {
		return cantAComprar;
	}

	public void setCantAComprar(int cantAComprar) {
		this.cantAComprar = cantAComprar;
	}

	public int getCantReservada() {
		return cantReservada;
	}

	public void setCantReservada(int cantReservada) {
		this.cantReservada = cantReservada;
	}

	public int getCantReal() {
		return cantReal;
	}

	public void setCantReal(int cantReal) {
		this.cantReal = cantReal;
	}

	public int getCantFuturoDisponible() {
		return cantFuturoDisponible;
	}

	public void setCantFuturoDisponible(int cantFuturoDisponible) {
		this.cantFuturoDisponible = cantFuturoDisponible;
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

	public ArticuloEntity() {
		super();
	}
	
	
	
}
