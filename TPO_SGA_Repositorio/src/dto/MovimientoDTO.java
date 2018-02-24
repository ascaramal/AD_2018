package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import enumerations.TipoMovimiento;

public class MovimientoDTO implements Serializable {

	private static final long serialVersionUID = 8108690230805397910L;

	private int nroMovimiento;
	private TipoMovimiento tipoMovimiento;
	private int nroPedido;
	private int nroOrdenDeCompra;
	private String motivoAjuste;
	private int cant;
	private String empleado;
	private List<LoteDTO> lotes;
	private ArticuloDTO articulo;

	// Constructor
	public MovimientoDTO() {
		this.lotes = new ArrayList<LoteDTO>();
	}

	public MovimientoDTO(int nroMovimiento, TipoMovimiento tipoMovimiento, int nroPedido, int nroOrdenDeCompra,
			String motivoAjuste, int cant, String empleado, List<LoteDTO> lotes, ArticuloDTO articulo) {
		this.nroMovimiento = nroMovimiento;
		this.tipoMovimiento = tipoMovimiento;
		this.nroPedido = nroPedido;
		this.nroOrdenDeCompra = nroOrdenDeCompra;
		this.motivoAjuste = motivoAjuste;
		this.cant = cant;
		this.empleado = empleado;
		this.lotes = new ArrayList<LoteDTO>();
		this.articulo = articulo;
	}

	public int getNroMovimiento() {
		return nroMovimiento;
	}

	public void setNroMovimiento(int nroMovimiento) {
		this.nroMovimiento = nroMovimiento;
	}

	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
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

	public List<LoteDTO> getLotes() {
		return lotes;
	}

	public void setLotes(List<LoteDTO> lotes) {
		this.lotes = lotes;
	}

	public ArticuloDTO getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}

	@Override
	public String toString() {
		return "MovimientoDTO [nroMovimiento=" + nroMovimiento + ", tipoMovimiento=" + tipoMovimiento + ", nroPedido="
				+ nroPedido + ", nroOrdenDeCompra=" + nroOrdenDeCompra + ", motivoAjuste=" + motivoAjuste + ", cant="
				+ cant + ", empleado=" + empleado + ", lotes=" + lotes + ", articulo=" + articulo + "]";
	}

}
