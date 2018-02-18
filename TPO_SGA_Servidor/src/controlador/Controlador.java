package controlador;

import java.util.ArrayList;
import java.util.List;

import dao.ClienteDAO;
import dto.ClienteDTO;
import negocio.Cliente;

public class Controlador {

	private static Controlador instancia;

	private Controlador() {
		
	}
	
	public static Controlador getInstancia(){
		if(instancia == null)
			instancia = new Controlador();
		return instancia;
	}
	
	public List<ClienteDTO> getClientes() {
		List<ClienteDTO> resultado = new ArrayList<ClienteDTO>();
		List<Cliente> clientes = ClienteDAO.getInstancia().getClientes();
		for(Cliente cliente : clientes) 
			resultado.add(cliente.toDTO());
		return resultado;
		
	}
}
