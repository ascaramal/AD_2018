package dto;

import java.io.Serializable;

public class EmpleadoDTO implements Serializable{

	private static final long serialVersionUID = 7661458079385048758L;
	
	private int nroLegajo;
	private String nombre;
	
	public EmpleadoDTO(int nroLegajo, String nombre) {
		super();
		this.nroLegajo = nroLegajo;
		this.nombre = nombre;
	}
	
	public int getNroLegajo() {
		return nroLegajo;
	}
	
	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "EmpleadoDTO [nroLegajo=" + nroLegajo + ", nombre=" + nombre + "]";
	}
	
	
}
