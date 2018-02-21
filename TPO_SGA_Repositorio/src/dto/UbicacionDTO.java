package dto;

import java.io.Serializable;

public class UbicacionDTO implements Serializable {

	private static final long serialVersionUID = -2608850933342264753L;

	private int nroUbicacion;
	private String codigoUbicacion;
	private int cantLibre;
	private LoteDTO lote;
	private int capacidadMax;

	public UbicacionDTO() {

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

	public int getCantLibre() {
		return cantLibre;
	}

	public void setCantLibre(int cantLibre) {
		this.cantLibre = cantLibre;
	}

	public LoteDTO getLote() {
		return lote;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public void setLote(LoteDTO lote) {
		this.lote = lote;
	}

	@Override
	public String toString() {
		return "UbicacionDTO [nroUbicacion=" + nroUbicacion + ", codigoUbicacion=" + codigoUbicacion + ", cantLibre="
				+ cantLibre + ", lote=" + lote + ", capacidadMax=" + capacidadMax + "]";
	}

	// Metodos
	public boolean sosUbicacion() {
		return false;
	}
}
