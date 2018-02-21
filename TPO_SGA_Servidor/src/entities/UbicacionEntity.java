package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ubicaciones")
public class UbicacionEntity {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nroUbicacion;
	private String codigoUbicacion;
	private int cantLibre;
	private int capacidadMax;
	
	@ManyToOne
	@JoinColumn(name="codLote")
	private int codLote;
	
	
	public UbicacionEntity(int nroUbicacion, String codigoUbicacion, int cantLibre, int capacidadMax) {
		this.nroUbicacion = nroUbicacion;
		this.codigoUbicacion = codigoUbicacion;
		this.cantLibre = cantLibre;
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

	public boolean sosUbicacion() {
		return false;
	}
}
