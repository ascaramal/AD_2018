package test;

import businessDelegate.BusinessDelegate;
import dto.ArticuloDTO;
import dto.ClienteDTO;
import dto.ItemPedidoDTO;
import dto.PedidoDTO;


public class AltaPedido {
	
	public static void main(String[] args) {
	      generarPedido();
	}
	
	public static void generarPedido() {
		ClienteDTO cliente = new ClienteDTO();
		cliente.setNroCliente(1);
		ClienteDTO clienteVuelta = new ClienteDTO();
		clienteVuelta = BusinessDelegate.getInstance().findCliente(cliente);

		if (clienteVuelta != null) {
			PedidoDTO pedido = new PedidoDTO();
			ItemPedidoDTO iPedido = new ItemPedidoDTO();
			ItemPedidoDTO iPedido2 = new ItemPedidoDTO();
			ItemPedidoDTO iPedido3 = new ItemPedidoDTO();
			ItemPedidoDTO iPedido4 = new ItemPedidoDTO();
			ItemPedidoDTO iPedido5 = new ItemPedidoDTO();
			
			ArticuloDTO articulo = new ArticuloDTO();
			
 		
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
	   			iPedido4.setCantidad(5);
	  			pedido.agregarItemPedido(iPedido4);
				


				pedido.setCliente(clienteVuelta);
				

				pedido = Controlador.getInstancia().altaPedido(pedido);

				System.out.println(pedido.getMensaje());
				System.out.println(pedido.getCodigoPedido());

			}
		else{
			System.out.println("Cliente Inexistente");
		}
	}
	

}
