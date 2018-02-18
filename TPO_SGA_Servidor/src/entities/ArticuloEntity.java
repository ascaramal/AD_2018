package entities;

import java.util.Date;
import java.util.List;

public class ArticuloEntity {

	private int nroArticulo;
	private String codigoBarras;
	private String tipo;
	private String marca;
	private String descripcion;
	private String presentacion;
	private String tamano;
	private int unidad;
	private int cantidadAComprar;
	private List<LoteEntity> lotes;
	private StockEntity stock;
	private List<UbicacionEntity> ubicaciones;
	private Date fechaVto;
	private float precio;
	
	public ArticuloEntity(int nroArticulo, String codigoBarras, String tipo, String marca, String descripcion, String presentacion,
			String tamano, int unidad, int cantidadAComprar, List<LoteEntity> lotes, StockEntity stock, 
			List<UbicacionEntity> ubicaciones, Date fechaVto, float precio) {
		this.nroArticulo = nroArticulo;
		this.codigoBarras = codigoBarras;
		this.marca = marca;
		this.descripcion = descripcion;
		this.presentacion = presentacion;
		this.tamano = tamano;
		this.unidad = unidad;
		this.cantidadAComprar = cantidadAComprar;
		this.lotes = lotes;
		this.stock = stock;
		this.tipo = tipo;
		this.ubicaciones = ubicaciones;
		this.fechaVto = fechaVto;
		this.precio = precio;
	}

	public int getNroArticulo() {
		return nroArticulo;
	}
	
	public void setNroArticulo(int nroArticulo) {
		this.nroArticulo = nroArticulo;
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
	
	public int getCantidadAComprar() {
		return cantidadAComprar;
	}
	
	public void setCantidadAComprar(int cantidadAComprar) {
		this.cantidadAComprar = cantidadAComprar;
	}
	
	public List<LoteEntity> getLotes() {
		return lotes;
	}
	
	public void setLotes(List<LoteEntity> lotes) {
		this.lotes = lotes;
	}
	
	public StockEntity getStock() {
		return stock;
	}
	
	public void setStock(StockEntity stock) {
		this.stock = stock;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public List<UbicacionEntity> getUbicaciones() {
		return ubicaciones;
	}
	
	public void setUbicaciones(List<UbicacionEntity> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}
	
	public Date getFechaVto() {
		return fechaVto;
	}
	
	public void setFechaVto(Date fechaVto) {
		this.fechaVto = fechaVto;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
