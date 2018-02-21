package controlador;

import java.util.ArrayList;
import java.util.List;

import dao.ClienteDAO;
import dao.PedidoDAO;
import dto.ClienteDTO;
import dto.PedidoDTO;
import negocio.Cliente;
import negocio.Pedido;

public class ControladorTest {

	private static ControladorTest instancia;

	private ControladorTest() {
		
	}
	
	public static ControladorTest getInstancia(){
		if(instancia == null)
			instancia = new ControladorTest();
		return instancia;
	}
	
	public List<ClienteDTO> getClientes() {
		List<ClienteDTO> resultado = new ArrayList<ClienteDTO>();
		List<Cliente> clientes = ClienteDAO.getInstancia().getClientes();
		for(Cliente cliente : clientes) 
			resultado.add(cliente.toDTO());
		return resultado;
	}
	
	/*public List<PedidoDTO> recuperarListaPedidosAceptado() {
		List<PedidoDTO> resultado = new ArrayList<PedidoDTO>();
		List<Pedido> pedidos = PedidoDAO.getInstancia().recuperarListaPedidos();
		for(Pedido pedido : pedidos)
			resultado.add(pedido.toDTO());
		return resultado;
	}*/
}
