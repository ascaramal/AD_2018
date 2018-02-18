package dto;

import java.io.Serializable;


public class MovimientoDTO implements Serializable {
	
	private static final long serialVersionUID = 8108690230805397910L;
	
	private int nroMovimiento;
	private String tipoMovimiento;
	private int nroPedido;
	private int nroOCompra;
	private EmpleadoDTO responsable;
	private String motivoAjuste;
	private int cant;
	
	public MovimientoDTO(int nroMovimiento, String tipoMovimiento, int nroPedido, int nroOCompra,
			EmpleadoDTO responsable, String motivoAjuste, int cant) {
		super();
		this.nroMovimiento = nroMovimiento;
		this.tipoMovimiento = tipoMovimiento;
		this.nroPedido = nroPedido;
		this.nroOCompra = nroOCompra;
		this.responsable = responsable;
		this.motivoAjuste = motivoAjuste;
		this.cant = cant;
	}
	
	public int getNroMovimiento() {
		return nroMovimiento;
	}
	
	public void setNroMovimiento(int nroMovimiento) {
		this.nroMovimiento = nroMovimiento;
	}
	
	public String getTipoMovimiento() {
		return tipoMovimiento;
	}
	
	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	
	public int getNroPedido() {
		return nroPedido;
	}
	
	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}
	
	public int getNroOCompra() {
		return nroOCompra;
	}
	
	public void setNroOCompra(int nroOCompra) {
		this.nroOCompra = nroOCompra;
	}
	
	public EmpleadoDTO getResponsable() {
		return responsable;
	}
	
	public void setResponsable(EmpleadoDTO responsable) {
		this.responsable = responsable;
	}
	
	public String getMotivoAjuste() {
		return motivoAjuste;
	}
	
	public void setMotivoAjuste(String motivoAjuste) {
		this.motivoAjuste = motivoAjuste;
	}
	
	public int getCant() {
		return cant;
	}
	
	public void setCant(int cant) {
		this.cant = cant;
	}

	@Override
	public String toString() {
		return "MovimientoDTO [nroMovimiento=" + nroMovimiento + ", tipoMovimiento=" + tipoMovimiento + ", nroPedido="
				+ nroPedido + ", nroOCompra=" + nroOCompra + ", responsable=" + responsable + ", motivoAjuste="
				+ motivoAjuste + ", cant=" + cant + "]";
	}
	
	
	
	
}
