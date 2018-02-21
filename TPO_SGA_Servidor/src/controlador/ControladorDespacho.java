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
			articulo = ArticuloDAO.getInstancia().findArticulo(nroArticulo).toDTO(); 
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	

	
}
