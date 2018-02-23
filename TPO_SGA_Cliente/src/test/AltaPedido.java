package test;

import businessDelegate.BusinessDelegate;
import dto.ClienteDTO;
import dto.ItemPedidoDTO;
import dto.PedidoDTO;
import enumerations.EstadoPedido;
import exceptions.ArticuloException;
import exceptions.ClienteException;
import exceptions.PedidoException;
import exceptions.SistemaException;

public class AltaPedido {

	public static void main(String[] args){
		try {
			generarPedido();
		} catch (SistemaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArticuloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PedidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void generarPedido() throws SistemaException, ArticuloException, PedidoException, ClienteException {
		ClienteDTO cliente = new ClienteDTO();
		cliente.setNroCliente(2);
		ClienteDTO clienteVuelta = new ClienteDTO();
		clienteVuelta = BusinessDelegate.getInstance().findCliente(cliente.getNroCliente());

		if (clienteVuelta != null) {
			PedidoDTO pedidoDTO = new PedidoDTO();
			ItemPedidoDTO iPedido = new ItemPedidoDTO();
			ItemPedidoDTO iPedido2 = new ItemPedidoDTO();
			ItemPedidoDTO iPedido3 = new ItemPedidoDTO();


			pedidoDTO.setCliente(clienteVuelta);
			
			iPedido.setArticulo(BusinessDelegate.getInstance().findArticulo(1));
			iPedido.setCantidad(100);
			pedidoDTO.agregarItemPedido(iPedido);
	
			iPedido2.setArticulo(BusinessDelegate.getInstance().findArticulo(2));
			iPedido2.setCantidad(100);
			pedidoDTO.agregarItemPedido(iPedido2);

			iPedido.setArticulo(BusinessDelegate.getInstance().findArticulo(3));
			iPedido.setCantidad(100);
			pedidoDTO.agregarItemPedido(iPedido3);

			
			System.out.println("Cliente vuelta: " + clienteVuelta);
			System.out.println(pedidoDTO.toString());
			System.out.println(pedidoDTO.getCliente());
			EstadoPedido mensaje = BusinessDelegate.getInstance().nuevoPedido(pedidoDTO);
			System.out.println(mensaje);
		} else {
			System.out.println("Cliente Inexistente");
		}
	}

}
