package dto;

import java.io.Serializable;

public class UbicacionDTO implements Serializable {

	private static final long serialVersionUID = -2608850933342264753L;

	private int nroUbicacion;
	private String codigoUbicacion;
	private int cantOcupada;
	private int capacidadMax;

	
	//Constructor
	public UbicacionDTO() {

	}

	public UbicacionDTO(int nroUbicacion, String codigoUbicacion, int cantOcupada, int capacidadMax) {
		this.nroUbicacion = nroUbicacion;
		this.codigoUbicacion = codigoUbicacion;
		this.cantOcupada = cantOcupada;
		this.capacidadMax = capacidadMax;
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

	public int getCantOcupada() {
		return cantOcupada;
	}

	public void setCantOcupada(int cantOcupada) {
		this.cantOcupada = cantOcupada;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	// Metodos
	public boolean sosUbicacion() {
		return false;
	}
}
