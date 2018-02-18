package entities;

public class EmpleadoEntity {

	private int nroLegajo;
	private String nombre;
	
	
	public EmpleadoEntity(int nroLegajo, String nombre) {
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
	
	
}
