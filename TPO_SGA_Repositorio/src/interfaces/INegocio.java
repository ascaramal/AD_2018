package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.ArticuloDTO;
import dto.ClienteDTO;
import dto.PedidoDTO;
import exceptions.ArticuloException;
import exceptions.ClienteException;
import exceptions.DAOException;
import exceptions.PedidoException;
import negocio.Pedido;


public interface INegocio extends Remote {

	public List<ClienteDTO> getClientes() throws RemoteException;
	public ArticuloDTO findArticulo(int nroArticulo) throws RemoteException, ArticuloException;
	public ClienteDTO findCliente(int nroCLiente) throws RemoteException, ClienteException;
	public void nuevoPedido(PedidoDTO pedidoDTO) throws RemoteException, ClienteException, ArticuloException, PedidoException, DAOException;
	public List<PedidoDTO> getPedidosNuevos(int nroCliente) throws RemoteException;
	public PedidoDTO findPedido(int nroPedido) throws RemoteException, PedidoException;
	public List<PedidoDTO> getPedidos() throws RemoteException;

}
