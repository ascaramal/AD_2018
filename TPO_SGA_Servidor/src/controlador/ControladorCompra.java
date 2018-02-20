package controlador;
import negocio.Cliente;

public class ControladorCompra {

	private static ControladorCompra instancia;
	
	private static ControladorCompra getInstancia() {
		if(instancia == null)
			instancia = new ControladorCompra();
		return instancia;
	}
	
	public void generarCobranza(int cliente, float monto)
	{
		//Busca el Cliente (en base de datos?)
		Cliente cl = new Cliente ();
		
		
		//Si existe modifica el Saldo
		cl.setSaldo(cl.getSaldo() + monto);
		//Si no, devuelve Error al buscar el Cliente.
	}
}
