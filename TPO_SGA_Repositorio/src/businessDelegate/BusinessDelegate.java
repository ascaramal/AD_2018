package businessDelegate;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import dto.ArticuloDTO;
import dto.ClienteDTO;
import dto.PedidoDTO;
import exceptions.ArticuloException;
import exceptions.ClienteException;
import exceptions.DAOException;
import exceptions.PedidoException;
import exceptions.SistemaException;
import interfaces.INegocio;

public class BusinessDelegate {

	private static BusinessDelegate instancia;
	private INegocio negocioRemoto;

	private BusinessDelegate() throws SistemaException {
		conectar();
	}

	public static BusinessDelegate getInstance() throws SistemaException {
		if (instancia == null)
			instancia = new BusinessDelegate();
		return instancia;
	}

	private void conectar() throws SistemaException {
		negocioRemoto = null;
		try {
			negocioRemoto = (INegocio) Naming.lookup("//localhost/ObjetoRemoto");
		} catch (MalformedURLException e) {
			throw new SistemaException("Servidor no encontrado");
		} catch (RemoteException e) {
			throw new SistemaException("Problemas en la red");
		} catch (NotBoundException e) {
			throw new SistemaException("Recurso no encontrado");
		}
	}

	// public List<ClienteDTO> getClientes() throws SistemaException,
	// ClienteException {
	// List<ClienteDTO> lst = null;
	// try {
	// lst = negocioRemoto.getClientes();
	// } catch(RemoteException e) {
	// throw new ClienteException("No se pudo listar clientes");
	// }
	// return lst;
	// }

	public ClienteDTO findCliente(int nroCliente) throws ClienteException {
		try {
			ClienteDTO cli = negocioRemoto.findCliente(nroCliente);
			return cli;
		} catch (RemoteException e) {
			throw new ClienteException("No se pudo encontrar el cliente");
		}
	}

	public ArticuloDTO findArticulo(int nroArticulo) throws ArticuloException {
		try {
			ArticuloDTO art = negocioRemoto.findArticulo(nroArticulo);
			return art;
		} catch (RemoteException e) {
			throw new ArticuloException("No se pudo encontrar el articulo");
		}
	}

	public void nuevoPedido(PedidoDTO pedido)
			throws SistemaException, PedidoException, ClienteException, ArticuloException, DAOException {
		try {
			negocioRemoto.nuevoPedido(pedido);
		} catch (RemoteException e) {
			throw new SistemaException("Error de Acceso al servidor");
		}
	}

	public List<PedidoDTO> getPedidosNuevos(int nroCliente) throws ClienteException, PedidoException {
		List<PedidoDTO> lst = null;
		try { 
			lst = negocioRemoto.getPedidosNuevos(nroCliente);
		} catch (RemoteException e) {
			throw new PedidoException("No hay pedidos nuevos");
		} 
		return lst;
	}  

	public PedidoDTO findPedido(int nroPedido) throws PedidoException {
		try { 
			PedidoDTO ped = negocioRemoto.findPedido(nroPedido);
			return ped;
		} catch (RemoteException e) {
			throw new PedidoException("No se pudo encontrar el pedido");
		}
		 
	}
 
	public List<PedidoDTO> getPedidos() throws SistemaException, PedidoException {
		List<PedidoDTO> lst = null;
		try {
			lst = negocioRemoto.getPedidos();
		} catch (RemoteException e) {
			throw new PedidoException("No se pudo listar pedidos");
		}
		return lst;
	} 

	/*
	 * public List<PedidoDTO> recuperarListaPedidos() throws SistemaException,
	 * PedidoException { List<PedidoDTO> lst = null; try { lst =
	 * negocioRemoto.recuperarListaPedidos(); } catch(RemoteException e) { throw new
	 * PedidoException("No se puede listar los pedidos aceptados"); } return lst; }
	 */

}
