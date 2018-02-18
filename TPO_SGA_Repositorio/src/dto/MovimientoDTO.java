package dto;

public abstract class MovimientoDTO {
	
	protected int nroMovimiento;
	protected String tipoMovimiento;
	protected OrdenDeCompraDTO ordenDeCompra;
	protected PedidoDTO pedido;
	
	
	public MovimientoDTO(int nroMovimiento, String tipoMovimiento, OrdenDeCompraDTO ordenDeCompra, PedidoDTO pedido) {
		this.nroMovimiento = nroMovimiento;
		this.tipoMovimiento = tipoMovimiento;
		this.ordenDeCompra = ordenDeCompra;
		this.pedido = pedido;
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
	
	public OrdenDeCompraDTO getOrdenDeCompra() {
		return ordenDeCompra;
	}
	
	public void setOrdenDeCompra(OrdenDeCompraDTO ordenDeCompra) {
		this.ordenDeCompra = ordenDeCompra;
	}
	
	public PedidoDTO getPedido() {
		return pedido;
	}
	
	public void setPedido(PedidoDTO pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "MovimientoDTO [nroMovimiento=" + nroMovimiento + ", tipoMovimiento=" + tipoMovimiento
				+ ", ordenDeCompra=" + ordenDeCompra + ", pedido=" + pedido + "]";
	}
	
}
