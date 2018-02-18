package negocio;

public class Remito extends Comprobante {
	
	private Factura factura;
	
	public Remito() {
		super();
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
		
}
