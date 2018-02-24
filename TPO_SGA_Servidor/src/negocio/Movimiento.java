package negocio;

import java.util.ArrayList;
import java.util.List;

import dto.MovimientoDTO;
import enumerations.TipoMovimiento;

public class Movimiento {

	private int nroMovimiento;
	private TipoMovimiento tipoMovimiento;
	private int nroPedido;
	private int nroOrdenDeCompra;
	private String motivoAjuste;
	private int cant;
	private String empleado;
	private List<Lote> lotes;

	//Constructor
	public Movimiento() {
		this.lotes = new ArrayList<Lote>();
	}

	public Movimiento(int nroMovimiento, TipoMovimiento tipoMovimiento, int nroPedido, int nroOrdenDeCompra,
			String motivoAjuste, int cant, String empleado, List<Lote> lotes) {
		this.nroMovimiento = nroMovimiento;
		this.tipoMovimiento = tipoMovimiento;
		this.nroPedido = nroPedido;
		this.nroOrdenDeCompra = nroOrdenDeCompra;
		this.motivoAjuste = motivoAjuste;
		this.cant = cant;
		this.empleado = empleado;
		this.lotes = lotes;
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

	public List<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

	public MovimientoDTO toDTO() {
		MovimientoDTO res = new MovimientoDTO();
		res.setNroMovimiento(this.nroMovimiento);
		res.setCant(this.cant);
		res.setEmpleado(this.empleado);
		res.setMotivoAjuste(this.motivoAjuste);
		res.setNroOrdenDeCompra(this.nroOrdenDeCompra);
		res.setNroPedido(this.nroPedido);
		res.setTipoMovimiento(this.tipoMovimiento);

		return res;
	}
}
