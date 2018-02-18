package controlador;

import java.util.ArrayList;
import java.util.List;

import dao.ClienteDAO;
import dto.ClienteDTO;
import negocio.Cliente;

public class ControladorTest {

	private static ControladorTest instancia;

	private ControladorTest() {
		
	}
	
	public static ControladorTest getInstancia(){
		if(instancia == null)
			instancia = new ControladorTest();
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
