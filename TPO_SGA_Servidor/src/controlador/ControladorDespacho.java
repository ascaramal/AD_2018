package controlador;

import dao.ClienteDAO;
import dto.ClienteDTO;
import entities.ClienteEntity;

public class ControladorDespacho {

	private static ControladorDespacho instancia;
	
	public static ControladorDespacho getInstancia() {
		if(instancia == null)
			instancia = new ControladorDespacho();
		return instancia;
	}
	
	public ClienteDTO recuperarCliente(Integer nroCliente) {
		ClienteEntity clienteBusqueda;
		clienteBusqueda=ClienteDAO.getInstancia().recuperarCliente(nroCliente);
		if (clienteBusqueda!= null){
			return clienteBusqueda.toDTO();
		}
		else{
			return null;
		}
	}

	
}
