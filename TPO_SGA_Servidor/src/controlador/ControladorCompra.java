package controlador;
import dao.ClienteDAO;
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
		Cliente cl = ClienteDAO.getInstancia().buscarPorCodigo(nro);
		//Si existe modifica el Saldo
		float actual = cl.getSaldo() + platita;
		cl.setSaldo(actual);
		//Persistencia?
	}
}
