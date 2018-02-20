package controlador;
import negocio.Cliente;

public class ControladorCompra {

	private static ControladorCompra instancia;
	
	private static ControladorCompra getInstancia() {
		if(instancia == null)
			instancia = new ControladorCompra();
		return instancia;
	}
	
	public void generarCobranza(int nro, float platita)
	{
		//Creo un cliente Clase
		Cliente cl = new Cliente ();
		//Busca el Cliente (en base de datos?)
		//que contenga el ID = nro
				
		//Si existe modifica el Saldo
			cl.setSaldo(cl.getSaldo() + platita);
			
		//Si no, devuelve Error al buscar el Cliente. (Exception??)
			//Lanzo Exception de cliente no encontrado
	}
}
