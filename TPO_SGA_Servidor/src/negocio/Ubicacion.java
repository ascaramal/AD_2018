package negocio;

import dto.UbicacionDTO;

public class Ubicacion {

	private int nroUbicacion;
	private Articulo articulo;
	private String codigoUbicacion;
	private int cantLibre;
	private Lote lote;

	public Ubicacion(int nroUbicacion, Articulo articulo, String codigoUbicacion, int cantLibre, Lote lote) {
		this.nroUbicacion = nroUbicacion;
		this.articulo = articulo;
		this.codigoUbicacion = codigoUbicacion;
		this.cantLibre = cantLibre;
		this.lote = lote;
	}

	public int getNroUbicacion() {
		return nroUbicacion;
	}

	public void setNroUbicacion(int nroUbicacion) {
		this.nroUbicacion = nroUbicacion;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public String getCodigoUbicacion() {
		return codigoUbicacion;
	}

	public void setCodigoUbicacion(String codigoUbicacion) {
		this.codigoUbicacion = codigoUbicacion;
	}

	public int getCantLibre() {
		return cantLibre;
	}

	public void setCantLibre(int cantLibre) {
		this.cantLibre = cantLibre;
	}

	public boolean sosUbicacion() {
		return false;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public UbicacionDTO toDTO() {
		UbicacionDTO res = new UbicacionDTO();
		res.setNroUbicacion(this.nroUbicacion);
		res.setCodigoUbicacion(this.codigoUbicacion);
		res.setArticulo(this.articulo.toDTO());
		res.setCantLibre(this.cantLibre);
		res.setLote(this.lote.toDTO());
		return res;
	}
}
