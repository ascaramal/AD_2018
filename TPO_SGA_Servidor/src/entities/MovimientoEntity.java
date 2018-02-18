package entities;

public abstract class MovimientoEntity {
	
	protected int nroMovimiento;
	protected String tipoMovimiento;
	protected OrdenDeCompraEntity ordenDeCompra;
	protected PedidoEntity pedido;
	
	
	public MovimientoEntity(int nroMovimiento, String tipoMovimiento, OrdenDeCompraEntity ordenDeCompra, PedidoEntity pedido) {
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
	
	public OrdenDeCompraEntity getOrdenDeCompra() {
		return ordenDeCompra;
	}
	
	public void setOrdenDeCompra(OrdenDeCompraEntity ordenDeCompra) {
		this.ordenDeCompra = ordenDeCompra;
	}
	
	public PedidoEntity getPedido() {
		return pedido;
	}
	
	public void setPedido(PedidoEntity pedido) {
		this.pedido = pedido;
	}
	
	
	public void agregarMovimiento(){
		
	}
	
}
