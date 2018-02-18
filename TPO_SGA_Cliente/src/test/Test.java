package test;

import java.util.List;

import businessDelegate.BusinessDelegate;
import dto.ClienteDTO;
import exceptions.ClienteException;
import exceptions.SistemaException;

public class Test {

	public static void main(String[] args) {
		
		try {
			BusinessDelegate bd = BusinessDelegate.getInstance();
			List<ClienteDTO> clientes = bd.getClientes();
			
			for(ClienteDTO cliente : clientes)
				System.out.println(cliente.toString());
		} catch (SistemaException | ClienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
