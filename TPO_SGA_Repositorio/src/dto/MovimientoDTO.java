package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class MovimientoDTO implements Serializable {
	
	private static final long serialVersionUID = 8108690230805397910L;
	
	private int nroMovimiento;
	private String tipoMovimiento;
	private int nroPedido;
	private int nroOrdenDeCompra;
	private String motivoAjuste;
	private int cant;
	private String empleado;
	private ArticuloDTO articulo;
	private List<LoteDTO> lotes;
	
	
	public MovimientoDTO() {
		this.lotes = new ArrayList<LoteDTO>();  
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

	public int getNroOrdenDeCompra() {
		return nroOrdenDeCompra;
	}

	public void setNroOrdenDeCompra(int nroOrdenDeCompra) {
		this.nroOrdenDeCompra = nroOrdenDeCompra;
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

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

	public ArticuloDTO getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}

	public List<LoteDTO> getLotes() {
		return lotes;
	}

	public void setLotes(List<LoteDTO> lotes) {
		this.lotes = lotes;
	}
	
	@Override
	public String toString() {
		return "MovimientoDTO [nroMovimiento=" + nroMovimiento + ", tipoMovimiento=" + tipoMovimiento + ", nroPedido="
				+ nroPedido + ", nroOrdenDeCompra=" + nroOrdenDeCompra + ", motivoAjuste=" + motivoAjuste + ", cant="
				+ cant + ", empleado=" + empleado + ", articulo=" + articulo + "]";
	}

}
