package negocio;

import dto.UbicacionDTO;

public class Ubicacion {

	private int nroUbicacion;
	private String codigoUbicacion;
	private int cantLibre;
	private Lote lote;
	private int capacidadMax;

	public int getCantLibre() {
		return cantLibre;
	}

	public void setCantLibre(int cantLibre) {
		this.cantLibre = cantLibre;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public Ubicacion(int nroUbicacion, String codigoUbicacion, int cantLibre, Lote lote, int capacidadMax) {
		this.nroUbicacion = nroUbicacion;
		this.codigoUbicacion = codigoUbicacion;
		this.cantLibre = cantLibre;
		this.lote = lote;
		this.capacidadMax = capacidadMax;
	}

	public Ubicacion() {

	}

	public int getNroUbicacion() {
		return nroUbicacion;
	}

	public void setNroUbicacion(int nroUbicacion) {
		this.nroUbicacion = nroUbicacion;
	}

	public String getCodigoUbicacion() {
		return codigoUbicacion;
	}

	public void setCodigoUbicacion(String codigoUbicacion) {
		this.codigoUbicacion = codigoUbicacion;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public boolean sosUbicacion() {
		return false;
	}

	public UbicacionDTO toDTO() {
		UbicacionDTO res = new UbicacionDTO();
		res.setNroUbicacion(this.nroUbicacion);
		res.setCodigoUbicacion(this.codigoUbicacion);
		res.setCantLibre(this.cantLibre);
		res.setLote(this.lote.toDTO());
		return res;
	}
}
