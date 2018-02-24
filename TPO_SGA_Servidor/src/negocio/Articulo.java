package negocio;

import java.util.ArrayList;
import java.util.List;

import dto.ArticuloDTO;
import dto.LoteDTO;
import dto.MovimientoDTO;
import entities.MovimientoEntity;

public class Articulo {

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
	private List<Movimiento> movimientos;
	private List<Lote> lotes;

	public Articulo() {
		this.movimientos = new ArrayList<Movimiento>();
		this.lotes = new ArrayList<Lote>();
	}	
	
	public Articulo(int codArticulo, String codigoBarras, String marca, String tipo, String descripcion,
			String presentacion, String tamano, int unidad, int cantAComprar, int cantReservada, int cantReal,
			int cantFuturoDisponible, float precio, List<Movimiento> movimientos, List<Lote> lotes) {
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
		this.movimientos = new ArrayList<Movimiento>();
		this.lotes = new ArrayList<Lote>();
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

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public List<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

	public ArticuloDTO toDTO() {
		ArticuloDTO res = new ArticuloDTO();
		res.setCodArticulo(this.codArticulo);
		res.setCodigoBarras(this.codigoBarras);
		res.setMarca(this.marca);
		res.setTipo(this.tipo);
		res.setDescripcion(this.descripcion);
		res.setPresentacion(this.presentacion);
		res.setTamano(this.tamano);
		res.setUnidad(this.unidad);
		res.setCantAComprar(this.cantAComprar);
		res.setCantReservada(this.cantReservada);
		res.setPrecio(this.precio);

//		for(Lote loteAux : this.getLotes()) {
//			LoteDTO loteDTO = loteAux.toDTO();
//			loteDTO.setArticulo(res);
//			res.getLotes().add(loteDTO);
//		}
//		
//		for(Movimiento movAux : this.getMovimientos()) {
//			MovimientoDTO movimientoDTO = movAux.toDTO();
//			movimientoDTO.setArticulo(res);
//			res.getMovimientos().add(movimientoDTO);
//		}
		
		return res;
	}

	// metodos

	public Movimiento generarMovimientoVenta(int cantPedida, String tipoMovimiento, int nroPedido) {

		return null;
	}

	public Movimiento generarMovimientoCompra(int cantComprada, String tipoMovimiento, int nroOrdenDeCompra) {

		return null;
	}

	public Movimiento generarMovimientoAjusteEntrada(int cant, String tipoMovimiento, String empleado,
			String motivoDeAjuste) {

		return null;
	}

	public Movimiento generarMovimientoAjusteSalida(int cant, String tipoMovimiento, String empleado,
			String motivoDeAjuste) {

		return null;
	}

}
