package or;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import controlador.ControladorTest;
import controlador.ControladorDespacho;
import dto.ArticuloDTO;
import dto.ClienteDTO;
import dto.PedidoDTO;
import exceptions.ArticuloException;
import exceptions.ClienteException;
import exceptions.DAOException;
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

	public ClienteDTO findCliente(int nroCliente) throws RemoteException, ClienteException {
		return ControladorDespacho.getInstancia().findCliente(nroCliente);
	}

	public ArticuloDTO findArticulo(int nroArticulo) throws RemoteException, ArticuloException {
		return ControladorDespacho.getInstancia().findArticulo(nroArticulo);
	}

	@Override
	public List<ClienteDTO> getClientes() throws RemoteException {
		return ControladorTest.getInstancia().getClientes();
	}

	public List<PedidoDTO> getPedidosNuevos(int nroCliente) throws RemoteException {
		return ControladorDespacho.getInstancia().getPedidosNuevos(nroCliente);
	}

	public void nuevoPedido(PedidoDTO pedidoDTO) throws RemoteException, PedidoException, DAOException {
		ControladorDespacho.getInstancia().altaPedido(pedidoDTO);
	}

	public PedidoDTO findPedido(int nroPedido) throws RemoteException, PedidoException {
		return ControladorDespacho.getInstancia().findPedido(nroPedido);
	}
	
	@Override
	public List<PedidoDTO> getPedidos() throws RemoteException {
		return ControladorTest.getInstancia().getPedidos();
	}

}
