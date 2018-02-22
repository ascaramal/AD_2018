package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.ArticuloDTO;
import dto.ClienteDTO;
import dto.PedidoDTO;
import enumerations.EstadoPedido;
import exceptions.ArticuloException;
import exceptions.ClienteException;
import exceptions.PedidoException;

public interface INegocio extends Remote {

	public List<ClienteDTO> getClientes() throws RemoteException;

<<<<<<< HEAD
	//public List<PedidoDTO> recuperarListaPedidos() throws RemoteException;	
=======
	//public List<PedidoDTO> recuperarListaPedidos() throws RemoteException;
<<<<<<< HEAD
	public ArticuloDTO findArticulo(int nroArticulo) throws RemoteException;
	public ClienteDTO findCliente(int nroCLiente) throws RemoteException;
>>>>>>> branch 'master' of https://github.com/ascaramal/AD_2018.git
=======
	public ArticuloDTO findArticulo(int nroArticulo) throws RemoteException, ArticuloException;
	public ClienteDTO findCliente(int nroCLiente) throws RemoteException, ClienteException;
	public EstadoPedido nuevoPedido(PedidoDTO pedido) throws RemoteException, ClienteException, PedidoException;


>>>>>>> branch 'master' of https://github.com/ascaramal/AD_2018.git
}
