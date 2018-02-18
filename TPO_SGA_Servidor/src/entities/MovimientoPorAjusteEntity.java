package entities;

public class MovimientoPorAjusteEntity extends MovimientoEntity {

	private EmpleadoEntity responsable;
	private String razon;

	
	public MovimientoPorAjusteEntity(int nroMovimiento, String tipoMovimiento, OrdenDeCompra ordenDeCompra, PedidoEntity pedido,
			EmpleadoEntity responsable, String razon) {
		super(nroMovimiento, tipoMovimiento, ordenDeCompra, pedido);
		this.responsable = responsable;
		this.razon = razon;
	}

	public EmpleadoEntity getResponsable() {
		return responsable;
	}

	public void setResponsable(EmpleadoEntity responsable) {
		this.responsable = responsable;
	}

	public String getRazon() {
		return razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}
}
