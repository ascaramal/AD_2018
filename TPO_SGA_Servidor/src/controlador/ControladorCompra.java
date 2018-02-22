package controlador;
import dao.ClienteDAO;
import negocio.Cliente;

import java.util.List;

import negocio.Articulo;

public class ControladorCompra {

	private static ControladorCompra instancia;
	
	public static ControladorCompra getInstancia() {
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


	public void generarOrdenDeCompra(List<Articulo> controlarStockPedido) {
		// TODO Auto-generated method stub
		
	}
}
