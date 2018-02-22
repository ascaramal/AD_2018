package controlador;

import java.util.List;

import negocio.Articulo;

public class ControladorCompra {

	private static ControladorCompra instancia;
	
	public static ControladorCompra getInstancia() {
		if(instancia == null)
			instancia = new ControladorCompra();
		return instancia;
	}

	public void generarOrdenDeCompra(List<Articulo> controlarStockPedido) {
		// TODO Auto-generated method stub
		
	}
}
