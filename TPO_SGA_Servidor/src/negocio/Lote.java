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
	private Articulo articulo;
	private Movimiento movimiento;

	public Lote(int codLote, Date fechaVtoLote, List<Ubicacion> ubicaciones, Articulo articulo, Movimiento movimiento) {
		super();
		this.codLote = codLote;
		this.fechaVtoLote = fechaVtoLote;
		this.ubicaciones = new ArrayList<Ubicacion>();
		this.articulo = articulo;
		this.movimiento = movimiento;
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

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}


	public Movimiento getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}

	public LoteDTO toDTO() {
		LoteDTO res = new LoteDTO();
		res.setCodLote(this.codLote);
		res.setFechaVtoLote(this.fechaVtoLote);
		res.setArticulo(this.articulo.toDTO());
		res.setMovimiento(this.movimiento.toDTO());
		
		for(Ubicacion ubiAux : this.getUbicaciones()) {
			UbicacionDTO ubicacionDTO = ubiAux.toDTO();
			ubicacionDTO.setLote(res);
		}
		
		return res;	
	}
}











