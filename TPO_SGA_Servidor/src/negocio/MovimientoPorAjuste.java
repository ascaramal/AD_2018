package negocio;

public class MovimientoPorAjuste extends Movimiento {

	private Empleado responsable;
	private String razon;

	
	public MovimientoPorAjuste(int nroMovimiento, String tipoMovimiento, OrdenDeCompra ordenDeCompra, Pedido pedido,
			Empleado responsable, String razon) {
		super(nroMovimiento, tipoMovimiento, ordenDeCompra, pedido);
		this.responsable = responsable;
		this.razon = razon;
	}

	public Empleado getResponsable() {
		return responsable;
	}

	public void setResponsable(Empleado responsable) {
		this.responsable = responsable;
	}

	public String getRazon() {
		return razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}
}
