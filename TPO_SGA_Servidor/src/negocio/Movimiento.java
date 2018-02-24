package negocio;

import java.util.ArrayList;
import java.util.List;

import dto.LoteDTO;
import dto.MovimientoDTO;

public class Movimiento {

	private int nroMovimiento;
	private String tipoMovimiento;
	private int nroPedido;
	private int nroOrdenDeCompra;
	private String motivoAjuste;
	private int cant;
	private String empleado;
	private Articulo articulo;
	private List<Lote> lotes;

	public Movimiento() {
		this.lotes = new ArrayList<Lote>();
	}

	public Movimiento(int nroMovimiento, String tipoMovimiento, int nroPedido, int nroOrdenDeCompra,
			String motivoAjuste, int cant, String empleado, Articulo articulo, List<Lote> lotes) {
		this.nroMovimiento = nroMovimiento;
		this.tipoMovimiento = tipoMovimiento;
		this.nroPedido = nroPedido;
		this.nroOrdenDeCompra = nroOrdenDeCompra;
		this.motivoAjuste = motivoAjuste;
		this.cant = cant;
		this.empleado = empleado;
		this.articulo = articulo;
		this.lotes = new ArrayList<Lote>();
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

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
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
		res.setArticulo(this.articulo.toDTO());
		
		for(Lote loteAux : this.getLotes()) {
			LoteDTO loteDTO = loteAux.toDTO();
			loteDTO.setMovimiento(res);
			res.getLotes().add(loteDTO);
		}

		return res;
	}
}
