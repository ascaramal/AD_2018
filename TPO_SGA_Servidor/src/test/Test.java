package test;

import java.util.List;

import controlador.ControladorDespacho;
import controlador.ControladorTest;
import dao.PedidoDAO;
import dto.ClienteDTO;
import dto.PedidoDTO;
import entities.ItemPedidoEntity;
import entities.PedidoEntity;
import exceptions.DAOException;
import exceptions.PedidoException;


public class Test {

	public static void main(String[] args) throws PedidoException {
		
//		List<ClienteDTO> clientes = ControladorTest.getInstancia().getClientes();
//		for(ClienteDTO cliente : clientes)
//			System.out.println(cliente.toString());

//		List<PedidoEntity> pedidos = PedidoDAO.getInstancia().getPedidosEntity();
//		for(PedidoEntity pedido : pedidos)
//			System.out.println(pedido.getCliente().getRazonSocial());
			
//			for(ItemPedidoEntity item : pedido.getItemsPedido())
//				System.out.println(item.getNroItemPedido());
//		
//		PedidoEntity ped;
//		try {
//			ped = PedidoDAO.getInstancia().findPedidoEntity(9);
//			System.out.println(ped.getCliente().getRazonSocial());
//		} catch (DAOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (PedidoException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		PedidoDTO ped;
		ped = ControladorDespacho.getInstancia().findPedido(9);
		ped.getCliente().setSaldo(80000.0f);
//		ClienteDTO cli = ped.getCliente();
//		cli.setSaldo(80000.0f);
		PedidoDAO.getInstancia().actualizarEstadoPedido(ped);
		System.out.println(ped.getCliente().getSaldo());
	}

}
