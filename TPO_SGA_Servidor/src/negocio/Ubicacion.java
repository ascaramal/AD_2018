package negocio;

import dto.UbicacionDTO;

public class Ubicacion {

	private int nroUbicacion;
	private Articulo articulo;
	private String codigoUbicacion;
	private int cantLibre;
	

	public Ubicacion(int nroUbicacion, Articulo articulo, String codigoUbicacion, int cantLibre) {
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
	
	public UbicacionDTO toDTO() {
		UbicacionDTO resultado = new UbicacionDTO(nroUbicacion, articulo.toDTO(), codigoUbicacion, cantLibre);
		return resultado;
	}
}
