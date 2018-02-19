package negocio;

import java.util.List;

import dto.ArticuloDTO;

public class Articulo {

	private int nroArticulo;
	private String codigoBarras;
	private String marca;
	private String tipo;
	private String descripcion;
	private String presentacion;
	private String tamano;
	private int unidad;
	private int cantidadAComprar;
	private List<Lote> lotes;
	private List<Ubicacion> ubicaciones;
	private int cantReservada;
	private float precio;
	private List<Movimiento> movimientos;
	
	public Articulo(int nroArticulo, String codigoBarras, String marca, String tipo, String descripcion,
			String presentacion, String tamano, int unidad, int cantidadAComprar, List<Lote> lotes,
			List<Ubicacion> ubicaciones, int cantReservada, float precio, List<Movimiento> movimientos) {
		this.nroArticulo = nroArticulo;
		this.codigoBarras = codigoBarras;
		this.marca = marca;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.presentacion = presentacion;
		this.tamano = tamano;
		this.unidad = unidad;
		this.cantidadAComprar = cantidadAComprar;
		this.lotes = lotes;
		this.ubicaciones = ubicaciones;
		this.cantReservada = cantReservada;
		this.precio = precio;
		this.movimientos = movimientos;
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

	public int getCantidadAComprar() {
		return cantidadAComprar;
	}

	public void setCantidadAComprar(int cantidadAComprar) {
		this.cantidadAComprar = cantidadAComprar;
	}

	public List<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

	public List<Ubicacion> getUbicaciones() {
		return ubicaciones;
	}

	public void setUbicaciones(List<Ubicacion> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}

	public int getCantReservada() {
		return cantReservada;
	}

	public void setCantReservada(int cantReservada) {
		this.cantReservada = cantReservada;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public ArticuloDTO toDTO() {
		ArticuloDTO resultado = new ArticuloDTO(nroArticulo, codigoBarras, marca, tipo, descripcion,
				presentacion, tamano, unidad, cantidadAComprar, lotes.toDTO(), ubicaciones.toDTO(), cantReservada, precio, movimientos.toDTO() );
		return resultado;
	}
	
}
