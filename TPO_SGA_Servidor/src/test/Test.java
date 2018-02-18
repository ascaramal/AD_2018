package test;

import java.util.List;

import controlador.Controlador;
import dto.ClienteDTO;


public class Test {

	public static void main(String[] args) {
		
		List<ClienteDTO> clientes = Controlador.getInstancia().getClientes();
		for(ClienteDTO cliente : clientes)
			System.out.println(cliente.toString());

	}

}
