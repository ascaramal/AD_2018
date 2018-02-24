package test;

import java.util.List;

import businessDelegate.BusinessDelegate;
import dto.ArticuloDTO;
import dto.ClienteDTO;
import dto.PedidoDTO;
import exceptions.ArticuloException;
import exceptions.ClienteException;
import exceptions.PedidoException;
import exceptions.SistemaException;
public class Test {

	public static void main(String[] args) throws ClienteException, ArticuloException {
		//prueba para guido 20-2-18 16:11hs
		//test x
//
//		try {
//			BusinessDelegate bd = BusinessDelegate.getInstance();
//			ClienteDTO cliente = BusinessDelegate.getInstance().findCliente(4);
//			List<ClienteDTO> clientes = bd.getClientes();
//			System.out.println("Listado de Clientes: "); 
//			System.out.println(cliente.getRazonSocial());
//			for(ClienteDTO cliente2 : clientes)
//				System.out.println(cliente2.toString());
//		} catch (SistemaException | ClienteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		
//		try {
//			ArticuloDTO articulo = BusinessDelegate.getInstance().findArticulo(4);
//			System.out.println(articulo.getDescripcion());
//			System.out.println(articulo.getCodArticulo());
//		} catch (SistemaException | ArticuloException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		try {
			List<PedidoDTO> pedidos = BusinessDelegate.getInstance().getPedidos();
			System.out.println("Listado de Pedidos: "); 
			for(PedidoDTO pedido2 : pedidos)
				System.out.println(pedido2.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
			
	}

}
