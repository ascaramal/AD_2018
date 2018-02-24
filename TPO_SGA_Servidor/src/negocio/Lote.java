package negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dto.LoteDTO;
import dto.UbicacionDTO;

public class Lote {

	private int codLote;
	private Date fechaVtoLote;
	private List<Ubicacion> ubicaciones;

	// Constructor
	public Lote() {
		this.ubicaciones = new ArrayList<Ubicacion>();
	}

	public Lote(int codLote, Date fechaVtoLote, List<Ubicacion> ubicaciones) {
		super();
		this.codLote = codLote;
		this.fechaVtoLote = fechaVtoLote;
		this.ubicaciones = ubicaciones;
	}

	public int getCodLote() {
		return codLote;
	}

	public void setCodLote(int codLote) {
		this.codLote = codLote;
	}

	public Date getFechaVtoLote() {
		return fechaVtoLote;
	}

	public void setFechaVtoLote(Date fechaVtoLote) {
		this.fechaVtoLote = fechaVtoLote;
	}

	public List<Ubicacion> getUbicaciones() {
		return ubicaciones;
	}

	public void setUbicaciones(List<Ubicacion> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}

	

	public LoteDTO toDTO() {
		LoteDTO res = new LoteDTO();
		res.setCodLote(this.codLote);
		res.setFechaVtoLote(this.fechaVtoLote);
		
		for (Ubicacion ubiAux : this.ubicaciones) {
			UbicacionDTO ubicacionDTO = ubiAux.toDTO();
			ubicacionDTO.setLote(res);
		}
		
		return res;	
	}

	public void agregarUbicaciones(Ubicacion ubic) {
		ubicaciones.add(ubic);

	}
}
