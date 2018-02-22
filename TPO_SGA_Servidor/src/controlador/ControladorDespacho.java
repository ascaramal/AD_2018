package controlador;

import dao.ArticuloDAO;
import dao.ClienteDAO;
import dto.ArticuloDTO;
import dto.ClienteDTO;
import exceptions.DAOException;


public class ControladorDespacho {

	private static ControladorDespacho instancia;
	
	public static ControladorDespacho getInstancia() {
		if(instancia == null)
			instancia = new ControladorDespacho();
		return instancia;
	}
	
	public ClienteDTO findCliente(int nroCliente) {
		ClienteDTO cliente = new ClienteDTO();
		try {
			cliente = ClienteDAO.getInstancia().findCliente(nroCliente).toDTO();
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		return cliente;
	}

	public ArticuloDTO findArticulo(Integer nroArticulo) {
		ArticuloDTO articulo = new ArticuloDTO();
		try {
<<<<<<< HEAD
			articulo = ArticuloDAO.getInstancia().findArticulo(nroArticulo).toDTO();
=======
			articulo = ArticuloDAO.getInstancia().findArticulo(nroArticulo).toDTO(); 
>>>>>>> branch 'master' of https://github.com/ascaramal/AD_2018.git
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	

	
}
