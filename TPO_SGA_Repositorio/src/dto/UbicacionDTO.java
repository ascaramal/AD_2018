package dto;

import java.io.Serializable;

public class UbicacionDTO implements Serializable {

	private static final long serialVersionUID = -2608850933342264753L;
	
	private int nroUbicacion;
	private ArticuloDTO articulo;
	private String codigoUbicacion;
	private int cantLibre;
	

	public UbicacionDTO(int nroUbicacion, ArticuloDTO articulo, String codigoUbicacion, int cantLibre) {
		super();
		this.nroUbicacion = nroUbicacion;
		this.articulo = articulo;
		this.codigoUbicacion = codigoUbicacion;
		this.cantLibre = cantLibre;
	}

	public int getNroUbicacion() {
		return nroUbicacion;
	}

	public void setNroUbicacion(int nroUbicacion) {
		this.nroUbicacion = nroUbicacion;
	}

	public ArticuloDTO getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloDTO articulo) {
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

	
	@Override
	public String toString() {
		return "UbicacionDTO [nroUbicacion=" + nroUbicacion + ", articulo=" + articulo + ", codigoUbicacion="
				+ codigoUbicacion + ", cantLibre=" + cantLibre + "]";
	}

	public boolean sosUbicacion() {
		return false;
	}
}
