package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ArticuloDTO implements Serializable {

	private static final long serialVersionUID = -6053174672137577622L;

	private int codArticulo;
	private String codigoBarras;
	private String marca;
	private String tipo;
	private String descripcion;
	private String presentacion;
	private String tamano;
	private int unidad;
	private int cantAComprar;
	private int cantReservada;
	private int cantReal;
	private int cantFuturoDisponible;
	private float precio;
	private List<MovimientoDTO> movimientos;
	private List<LoteDTO> lotes;

	
	//Constructor
	public ArticuloDTO() {
		this.movimientos = new ArrayList<MovimientoDTO>();
		this.lotes = new ArrayList<LoteDTO>();
	}

	public ArticuloDTO(int codArticulo, String codigoBarras, String marca, String tipo, String descripcion,
			String presentacion, String tamano, int unidad, int cantAComprar, int cantReservada, int cantReal,
			int cantFuturoDisponible, float precio, List<MovimientoDTO> movimientos, List<LoteDTO> lotes) {
		this.codArticulo = codArticulo;
		this.codigoBarras = codigoBarras;
		this.marca = marca;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.presentacion = presentacion;
		this.tamano = tamano;
		this.unidad = unidad;
		this.cantAComprar = cantAComprar;
		this.cantReservada = cantReservada;
		this.cantReal = cantReal;
		this.cantFuturoDisponible = cantFuturoDisponible;
		this.precio = precio;
		this.movimientos = new ArrayList<MovimientoDTO>();
		this.lotes = new ArrayList<LoteDTO>();
	}


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

	public List<MovimientoDTO> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<MovimientoDTO> movimientos) {
		this.movimientos = movimientos;
	}

	public List<LoteDTO> getLotes() {
		return lotes;
	}

	public void setLotes(List<LoteDTO> lotes) {
		this.lotes = lotes;
	}


	@Override
	public String toString() {
		return "ArticuloDTO [codArticulo=" + codArticulo + ", codigoBarras=" + codigoBarras + ", marca=" + marca
				+ ", tipo=" + tipo + ", descripcion=" + descripcion + ", presentacion=" + presentacion + ", tamano="
				+ tamano + ", unidad=" + unidad + ", cantAComprar=" + cantAComprar + ", cantReservada=" + cantReservada
				+ ", cantReal=" + cantReal + ", cantFuturoDisponible=" + cantFuturoDisponible + ", precio=" + precio
				+ ", movimientos=" + movimientos + ", lotes=" + lotes + "]";
	}
	
}
