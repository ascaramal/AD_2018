package dto;

public class RemitoDTO {
	
	private static final long serialVersionUID = -6343086119078212271L;
	
	private FacturaDTO factura;
	
	public RemitoDTO() {
		super();
	}

	public FacturaDTO getFactura() {
		return factura;
	}

	public void setFactura(FacturaDTO factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "RemitoDTO [factura=" + factura + "]";
	}
		
	
}
