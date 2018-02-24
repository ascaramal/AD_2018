package test;

import businessDelegate.BusinessDelegate;
import controlador.ControladorDespacho;
import dto.ClienteDTO;
import dto.ItemPedidoDTO;
import dto.PedidoDTO;
import exceptions.ArticuloException;
import exceptions.ClienteException;
import exceptions.SistemaException;

public class TestAltaPedidoSinRMI {

	public static void main(String[] args) throws ArticuloException {
		
			ClienteDTO cliente = new ClienteDTO();
			cliente.setNroCliente(2);
			ClienteDTO clienteVuelta = new ClienteDTO();
			try {
				clienteVuelta = ControladorDespacho.getInstancia().findCliente(cliente.getNroCliente());
			} catch (ClienteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 

			if (clienteVuelta != null) {
				PedidoDTO pedidoDTO = new PedidoDTO();
				ItemPedidoDTO iPedido = new ItemPedidoDTO();
				//ItemPedidoDTO iPedido2 = new ItemPedidoDTO();
				ItemPedidoDTO iPedido3 = new ItemPedidoDTO();


				pedidoDTO.setCliente(clienteVuelta);
				
//				iPedido.setArticulo(BusinessDelegate.getInstance().findArticulo(1));
//				iPedido.setCantidad(100);
//				pedidoDTO.agregarItemPedido(iPedido);
//		
//				iPedido2.setArticulo(BusinessDelegate.getInstance().findArticulo(2));
//				iPedido2.setCantidad(100);
//				pedidoDTO.agregarItemPedido(iPedido2);

				iPedido.setArticulo(ControladorDespacho.getInstancia().findArticulo(3));
				iPedido.setCantidad(100);
				pedidoDTO.agregarItemPedido(iPedido3);
				
				pedidoDTO.setTotal(100.0f);
				
				System.out.println("Cliente vuelta: " + clienteVuelta);
				System.out.println(pedidoDTO.toString());
				System.out.println(pedidoDTO.getCliente());
					
				ControladorDespacho.getInstancia().altaPedido(pedidoDTO);
			
				
			} else {
				System.out.println("Cliente Inexistente");
			}
		}

}

