package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ubicaciones")
public class UbicacionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nroUbicacion;

	private String codigoUbicacion;
	private int cantOcupada;
	private int capacidadMax;

	@ManyToOne
	@JoinColumn(name = "codLote")
	private LoteEntity lote;

	
	// Constructor
	public UbicacionEntity() {

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

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public int getCantOcupada() {
		return cantOcupada;
	}

	public void setCantOcupada(int cantOcupada) {
		this.cantOcupada = cantOcupada;
	}

	public LoteEntity getLote() {
		return lote;
	}

	public void setLote(LoteEntity lote) {
		this.lote = lote;
	}

}
