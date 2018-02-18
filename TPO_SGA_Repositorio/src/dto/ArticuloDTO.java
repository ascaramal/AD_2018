package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class ArticuloDTO implements Serializable {

	private static final long serialVersionUID = -1228576285913548205L;
	
	private int nroArticulo;
	private String codigoBarras;
	private String marca;
	private String tipo;
	private String descripcion;
	private String presentacion;
	private String tamano;
	private int unidad;
	private int cantidadAComprar;
	private List<LoteDTO> lotes;
	private StockDTO stock;
	private List<UbicacionDTO> ubicaciones;
	private Date fechaVto;
	private float precio;
	
	public ArticuloDTO() { }

	public ArticuloDTO(int nroArticulo, String codigoBarras, String marca, String tipo, String descripcion,
			String presentacion, String tamano, int unidad, int cantidadAComprar, List<LoteDTO> lotes, StockDTO stock,
			List<UbicacionDTO> ubicaciones, Date fechaVto, float precio) {
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
		this.stock = stock;
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

	public List<LoteDTO> getLotes() {
		return lotes;
	}

	public void setLotes(List<LoteDTO> lotes) {
		this.lotes = lotes;
	}

	public StockDTO getStock() {
		return stock;
	}

	public void setStock(StockDTO stock) {
		this.stock = stock;
	}

	public List<UbicacionDTO> getUbicaciones() {
		return ubicaciones;
	}

	public void setUbicaciones(List<UbicacionDTO> ubicaciones) {
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

	@Override
	public String toString() {
		return "ArticuloDTO [nroArticulo=" + nroArticulo + ", codigoBarras=" + codigoBarras + ", marca=" + marca
				+ ", tipo=" + tipo + ", descripcion=" + descripcion + ", presentacion=" + presentacion + ", tamano="
				+ tamano + ", unidad=" + unidad + ", cantidadAComprar=" + cantidadAComprar + ", lotes=" + lotes
				+ ", stock=" + stock + ", ubicaciones=" + ubicaciones + ", fechaVto=" + fechaVto + ", precio=" + precio
				+ "]";
	}

	
		
}
