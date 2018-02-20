package test;

import java.util.List;

import businessDelegate.BusinessDelegate;
import dto.ClienteDTO;
import dto.PedidoDTO;
import exceptions.ClienteException;
import exceptions.PedidoException;
import exceptions.SistemaException;
public class Test {

	public static void main(String[] args) {
		//prueba euge2
		//prueba euge 3
		try {
			BusinessDelegate bd = BusinessDelegate.getInstance();
			List<ClienteDTO> clientes = bd.getClientes();
			System.out.println("Listado de Clientes: ");
			for(ClienteDTO cliente : clientes)
				System.out.println(cliente.toString());
		} catch (SistemaException | ClienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			BusinessDelegate bd = BusinessDelegate.getInstance();
			List<PedidoDTO> pedidos = bd.recuperarListaPedidosAceptado();
			System.out.println("Listado de Pedidos Aceptados: ");
			for(PedidoDTO pedido : pedidos)
				System.out.println(pedido.toString());
		} catch (SistemaException | PedidoException e) {
			e.printStackTrace();
		}*/
	}

}
