package controlador;

import dao.ArticuloDAO;
import dao.ClienteDAO;
import dto.ArticuloDTO;
import dto.ClienteDTO;

import dto.PedidoDTO;
import exceptions.ArticuloException;
import exceptions.ClienteException;
import exceptions.DAOException;
import exceptions.PedidoException;
import negocio.Pedido;


public class ControladorDespacho {

	private static ControladorDespacho instancia;
	
	public static ControladorDespacho getInstancia() {
		if(instancia == null)
			instancia = new ControladorDespacho();
		return instancia;
	}
	
	public ClienteDTO findCliente(int nroCliente) throws ClienteException {
		ClienteDTO cliente = new ClienteDTO();
		try {
			cliente = ClienteDAO.getInstancia().findCliente(nroCliente).toDTO();
		} catch (DAOException e) {
			throw new ClienteException("No se encontro el cliente");
		}
		
		return cliente;
	}

	public ArticuloDTO findArticulo(int nroArticulo) throws ArticuloException {
		ArticuloDTO articulo = new ArticuloDTO();
		try {

			articulo = ArticuloDAO.getInstancia().findArticulo(nroArticulo).toDTO();
			articulo = ArticuloDAO.getInstancia().findArticulo(nroArticulo).toDTO(); 
			articulo = ArticuloDAO.getInstancia().findArticulo(nroArticulo).toDTO();
		} catch (DAOException e) {
			throw new ArticuloException("No se encontro el articulo");
		}
		return articulo;
	}

	
	public void altaPedido(PedidoDTO pedidoDTO) throws ClienteException, PedidoException{
		//PedidoDAO dao = PedidoDAO.getInstancia();
		
		//Pedido pe = dao.toNegocio(pedido);
		//List<Articulo> articulosFaltantes = new ArrayList<Articulo>();
		try {
//			//Se verifica el limite de credito 
//			if(pe.controlarLimiteCredito() == EstadoPedido.Rechazado) {
//				return EstadoPedido.Rechazado;
//			}
//			//Se modifica el saldo del cliente
//			Cliente cli = pe.getCliente();
//			cli.setSaldo(cli.getSaldo() - pe.getTotalPedido());
//			ClienteDAO.getInstancia().guardarCliente(ClienteDAO.getInstancia().toEntity(cli));
//			//Se verifica la existencia de stock del pedido
//			if(articulosFaltantes.size() != 0) {
//				ControladorCompra.getInstancia().generarOrdenDeCompra(pe.controlarStockPedido());
//			}else {
//				pe.setEstadoPedido(EstadoPedido.Completado);
//			}
			//se comento para verificar si genera el pedido desde cliente.
			
			Pedido pedi = new Pedido();
			pedi.save();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
}