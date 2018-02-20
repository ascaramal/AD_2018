package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.ClienteDTO;
import dto.PedidoDTO;

public interface INegocio extends Remote {

	public List<ClienteDTO> getClientes() throws RemoteException;

	//public List<PedidoDTO> recuperarListaPedidoAceptado() throws RemoteException;
}
