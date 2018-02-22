package test;

import businessDelegate.BusinessDelegate;
import dto.ClienteDTO;
import dto.ItemPedidoDTO;
import dto.PedidoDTO;
import exceptions.ArticuloException;
import exceptions.ClienteException;
import exceptions.PedidoException;
import exceptions.SistemaException;


public class AltaPedido {
	
	public static void main(String[] args) throws SistemaException, ArticuloException, PedidoException, ClienteException {
	      generarPedido();
	}
	
	public static void generarPedido() throws SistemaException, ArticuloException, PedidoException, ClienteException {
		ClienteDTO cliente = new ClienteDTO();
		cliente.setNroCliente(1);
		ClienteDTO clienteVuelta = new ClienteDTO();
		clienteVuelta = BusinessDelegate.getInstance().findCliente(cliente.getNroCliente());

		if (clienteVuelta != null) {
			PedidoDTO pedido = new PedidoDTO();
			ItemPedidoDTO iPedido = new ItemPedidoDTO();
			ItemPedidoDTO iPedido2 = new ItemPedidoDTO();
			ItemPedidoDTO iPedido3 = new ItemPedidoDTO();
			ItemPedidoDTO iPedido4 = new ItemPedidoDTO();
			ItemPedidoDTO iPedido5 = new ItemPedidoDTO();
			
 		
 				iPedido.setArticulo(BusinessDelegate.getInstance().findArticulo(1));
				iPedido.setCantidad(100);
				pedido.agregarItemPedido(iPedido);
				
	 	  		iPedido2.setArticulo(BusinessDelegate.getInstance().findArticulo(2));
	   	 		iPedido2.setCantidad(100);
	   	 		pedido.agregarItemPedido(iPedido2);
	 			
	   	 		iPedido3.setArticulo(BusinessDelegate.getInstance().findArticulo(3));
	 	 		iPedido3.setCantidad(100);
	  			pedido.agregarItemPedido(iPedido3);
	 			
	   			iPedido4.setArticulo(BusinessDelegate.getInstance().findArticulo(4));
	   			iPedido4.setCantidad(100);
	  			pedido.agregarItemPedido(iPedido4);
				
	  			iPedido5.setArticulo(BusinessDelegate.getInstance().findArticulo(5));
	   			iPedido5.setCantidad(100);
	  			pedido.agregarItemPedido(iPedido5);

				pedido.setCliente(clienteVuelta);
				
				System.out.println(BusinessDelegate.getInstance().nuevoPedido(pedido));

			}
		else{
			System.out.println("Cliente Inexistente");
		}
	}
	

}
