package negocio;

import dto.MovimientoDTO;

public class Movimiento {

	private int nroMovimiento;
	private String tipoMovimiento;
	private int nroPedido;
	private int nroOrdenDeCompra;
	private String motivoAjuste;
	private int cant;
	private String empleado;

	public Movimiento(int nroMovimiento, String tipoMovimiento, int nroPedido, int nroOCompra, String motivoAjuste,
			int cant) {
		this.nroMovimiento = nroMovimiento;
		this.tipoMovimiento = tipoMovimiento;
		this.nroPedido = nroPedido;
		this.nroOrdenDeCompra = nroOCompra;
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

	public MovimientoDTO toDTO() {
		MovimientoDTO res = new MovimientoDTO();
		res.setNroMovimiento(this.nroMovimiento);
		//falta completar
		return null;
	}
}
