package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.ArticuloDTO;
import dto.ClienteDTO;
import dto.PedidoDTO;
import exceptions.ArticuloException;
import exceptions.ClienteException;


public interface INegocio extends Remote {

	//public List<ClienteDTO> getClientes() throws RemoteException;

	public ArticuloDTO findArticulo(int nroArticulo) throws RemoteException, ArticuloException;
	public ClienteDTO findCliente(int nroCLiente) throws RemoteException, ClienteException;
	public void nuevoPedido(PedidoDTO pedidoDTO) throws RemoteException;
	public List<PedidoDTO> getPedidosNuevos(int nroCliente) throws RemoteException;

}
