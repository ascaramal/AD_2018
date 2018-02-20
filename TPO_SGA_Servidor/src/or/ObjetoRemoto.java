package or;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import controlador.ControladorTest;
import controlador.ControladorDespacho;
import dto.ClienteDTO;
import dto.PedidoDTO;
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
	
	public ClienteDTO recuperarCliente(Integer nroCliente) throws RemoteException {
		return ControladorDespacho.getInstancia().recuperarCliente(nroCliente);
	}

	@Override
	public List<ClienteDTO> getClientes() throws RemoteException {
		return ControladorTest.getInstancia().getClientes();
	}

	@Override
	public List<PedidoDTO> recuperarListaPedidos() throws RemoteException {
		return ControladorTest.getInstancia().recuperarListaPedidosAceptado();
	}
}
