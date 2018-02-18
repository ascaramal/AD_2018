package controlador;

public class ControladorCompra {

	private static ControladorCompra instancia;
	
	private static ControladorCompra getInstancia() {
		if(instancia == null)
			instancia = new ControladorCompra();
		return instancia;
	}
}
