package entities;

public class RemitoEntity extends ComprobanteEntity {
	
	private FacturaEntity factura;
	
	public RemitoEntity() {
		super();
	}

	public FacturaEntity getFactura() {
		return factura;
	}

	public void setFactura(FacturaEntity factura) {
		this.factura = factura;
	}
		
}
