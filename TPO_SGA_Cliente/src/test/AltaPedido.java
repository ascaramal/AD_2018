package test;

import businessDelegate.BusinessDelegate;
import dto.ArticuloDTO;
import dto.ClienteDTO;
import dto.ItemPedidoDTO;
import dto.PedidoDTO;
import exceptions.ArticuloException;
import exceptions.ClienteException;
import exceptions.DAOException;
import exceptions.PedidoException;
import exceptions.SistemaException;

public class AltaPedido {

	public static void main(String[] args) {

			try {
				generarPedido();
			} catch (PedidoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();  
			} catch (ClienteException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ArticuloException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			} 
	}
	
	public static void generarPedido() throws PedidoException, ClienteException, ArticuloException, DAOException {
		ClienteDTO cliente = new ClienteDTO();
		cliente.setNroCliente(2);
		ClienteDTO clienteVuelta = new ClienteDTO();
		try {
			clienteVuelta = BusinessDelegate.getInstance().findCliente(cliente.getNroCliente());
			//System.out.println(clienteVuelta.toString());
		} catch (ClienteException e1) {
			e1.printStackTrace();
		} catch (SistemaException e1) {
			e1.printStackTrace();
		}

		if (clienteVuelta != null) {
			PedidoDTO pedidoDTO = new PedidoDTO();
			ItemPedidoDTO iPedido1 = new ItemPedidoDTO();
			ItemPedidoDTO iPedido2 = new ItemPedidoDTO();
			ItemPedidoDTO iPedido3 = new ItemPedidoDTO();

			pedidoDTO.setCliente(clienteVuelta);

			try {
				iPedido1.setArticulo(BusinessDelegate.getInstance().findArticulo(1));
				iPedido1.setCantidad(100);
				pedidoDTO.agregarItemPedido(iPedido1);
			} catch (ArticuloException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SistemaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				iPedido2.setArticulo(BusinessDelegate.getInstance().findArticulo(2));
				iPedido2.setCantidad(100);
				pedidoDTO.agregarItemPedido(iPedido2);
			} catch (ArticuloException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SistemaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				iPedido3.setArticulo(BusinessDelegate.getInstance().findArticulo(3));
				iPedido3.setCantidad(100);
				pedidoDTO.agregarItemPedido(iPedido3);
			} catch (ArticuloException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SistemaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			

			pedidoDTO.setTotal(100.0f); 

			//System.out.println(pedidoDTO.toString());
			try {
				BusinessDelegate.getInstance().nuevoPedido(pedidoDTO);
			} catch (SistemaException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Cliente Inexistente");
		}
	}

}
