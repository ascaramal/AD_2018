package dto;

public class MovimientoPorAjusteDTO extends MovimientoDTO {

	private EmpleadoDTO responsable;
	private String razon;

	
	public MovimientoPorAjusteDTO(int nroMovimiento, String tipoMovimiento, OrdenDeCompraDTO ordenDeCompra, PedidoDTO pedido,
			EmpleadoDTO responsable, String razon) {
		super(nroMovimiento, tipoMovimiento, ordenDeCompra, pedido);
		this.responsable = responsable;
		this.razon = razon;
	}

	public EmpleadoDTO getResponsable() {
		return responsable;
	}

	public void setResponsable(EmpleadoDTO responsable) {
		this.responsable = responsable;
	}

	public String getRazon() {
		return razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}

	@Override
	public String toString() {
		return "MovimientoPorAjusteDTO [responsable=" + responsable + ", razon=" + razon + "]";
	}
	
	
}
