package negocio;

import dto.UbicacionDTO;

public class Ubicacion {

	private int nroUbicacion;
	private String codigoUbicacion;
	private int cantOcupada;
	private int capacidadMax;

	
	// Constructor
	public Ubicacion() {

	}

	public Ubicacion(int nroUbicacion, String codigoUbicacion, int cantOcupada, int capacidadMax) {
		this.nroUbicacion = nroUbicacion;
		this.codigoUbicacion = codigoUbicacion;
		this.cantOcupada = cantOcupada;
		this.capacidadMax = capacidadMax;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
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

	public boolean sosUbicacion() {
		return false;
	}

	public UbicacionDTO toDTO() {
		UbicacionDTO res = new UbicacionDTO();
		res.setNroUbicacion(this.nroUbicacion);
		res.setCodigoUbicacion(this.codigoUbicacion);
		res.setCantOcupada(this.cantOcupada);
		
		return res;
	}
}
