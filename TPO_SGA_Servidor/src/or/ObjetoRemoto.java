package or;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import controlador.ControladorTest;
import controlador.ControladorDespacho;
import dto.ArticuloDTO;
import dto.ClienteDTO;
import dto.PedidoDTO;
import enumerations.EstadoPedido;
import exceptions.ArticuloException;
import exceptions.ClienteException;
import exceptions.PedidoException;
import interfaces.INegocio;
import or.ObjetoRemoto;

public class ObjetoRemoto extends UnicastRemoteObject implements INegocio {
	
	private static final long serialVersionUID = 1L;

	private static ObjetoRemoto instancia;
	
	public ObjetoRemoto() throws RemoteException {
		super();
	}
	
	public static ObjetoRemoto getInstance() {
		if (instancia == null) {
			try {
				instancia = new ObjetoRemoto();
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
		return instancia;
	}
	
	
	public ClienteDTO findCliente(int nroCliente) throws RemoteException {
		return ControladorDespacho.getInstancia().findCliente(nroCliente);
	}

	@Override
	public List<ClienteDTO> getClientes() throws RemoteException {
		return ControladorTest.getInstancia().getClientes();
	}

	public ArticuloDTO findArticulo(int nroArticulo) throws RemoteException, ArticuloException {
		return ControladorDespacho.getInstancia().findArticulo(nroArticulo);
	}

	public EstadoPedido nuevoPedido(PedidoDTO pedido) throws RemoteException, ClienteException, PedidoException {
		return ControladorDespacho.getInstancia().altaPedido(pedido);
	}

}
