package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.ArticuloDTO;
import dto.ClienteDTO;

public interface INegocio extends Remote {

	public List<ClienteDTO> getClientes() throws RemoteException;

	//public List<PedidoDTO> recuperarListaPedidos() throws RemoteException;
	public ArticuloDTO findArticulo(int nroArticulo) throws RemoteException;
	public ClienteDTO findCliente(int nroCLiente) throws RemoteException;
}
