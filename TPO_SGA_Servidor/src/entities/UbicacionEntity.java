package entities;

public class UbicacionEntity {

	private int nroUbicacion;
	private ArticuloEntity articulo;
	private String codigoUbicacion;
	private int cantLibre;
	

	public UbicacionEntity(int nroUbicacion, ArticuloEntity articulo, String codigoUbicacion, int cantLibre) {
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

	public ArticuloEntity getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloEntity articulo) {
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
}
