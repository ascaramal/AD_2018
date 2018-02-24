package dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import dto.ItemPedidoDTO;
import dto.PedidoDTO;
import entities.ArticuloEntity;
import entities.ClienteEntity;
import entities.ItemPedidoEntity;
import entities.PedidoEntity;
import exceptions.DAOException;
import exceptions.PedidoException;
import hbt.HibernateUtil;
import negocio.Articulo;
import negocio.Cliente;
import negocio.ItemPedido;
import negocio.Pedido;

public class PedidoDAO {

	private static PedidoDAO instancia;
	private static SessionFactory sf;
	
	private PedidoDAO() {}

	public static PedidoDAO getInstancia() { 
		if(instancia == null) {
			instancia = new PedidoDAO();
			sf = HibernateUtil.getSessionFactory();
		}
		return instancia;
	}
	
//	@SuppressWarnings("unchecked")
//	public List<Pedido> recuperarListaPedidos() {
//		try {
//			List<Pedido> resultado = new ArrayList<Pedido>();
//			Session s = sf.openSession();
//			List<PedidoEntity> aux = (List<PedidoEntity>)s.createQuery("from PedidoEntity")
//					.list();
//			s.getTransaction().commit();
//			s.close();
//			for(PedidoEntity pedido : aux)
//				resultado.add(this.toNegocio(pedido));
//			return resultado;
//		} catch (Exception e) {
//			System.out.println(e);
//			System.out.println("Error PedidoDAO.recuperarListaPedidos");
//		}
//		return null;
//	}

	@SuppressWarnings("unchecked")
	public List<PedidoEntity> recuperarListaPedidosCompletos() {
		try {
			Session session = sf.openSession();
			session.beginTransaction();
			List<PedidoEntity> Pedidos = session.createQuery("from PedidoEntity p where p.estadoPedido ='Completo' ")
					.list();
			session.getTransaction().commit();
			session.close();
			return Pedidos;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Error PedidoDAO.recuperarListaPedidosCompletos");
		}
		return null;
	}
	
//	public int altaPedido(PedidoEntity pedido) throws DAOException, PedidoException {
//		try {
//			Session s = sf.openSession();
//			s.beginTransaction();
//			int idGenerado = (int) s.save(pedido);
//			s.getTransaction().commit();
//			s.close();
//			return idGenerado;
//		} catch (Exception e) {
//			throw new PedidoException("Error al dar de alta PedidoDAO");
//		}
//	}

	public void altaPedido(Pedido pedido)  {

			Session session = sf.openSession();
			PedidoEntity res = new PedidoEntity();  
		
			res.setEstadoPedido(pedido.getEstadoPedido());
			res.setFechaGeneracion(pedido.getFechaGeneracion());
			res.setFechaDespacho(pedido.getFechaDespacho());
			res.setTotal(pedido.getTotal());
			

			
//			for(ItemPedido itemPedido : pedido.getItemsPedido()) {
//				ItemPedidoEntity itemPEntity = new ItemPedidoEntity();
//				itemPEntity.setCantidad(itemPedido.getCantidad());
//				res.getItemsPedido().add(itemPEntity);
//			}
			
			ItemPedidoEntity iPE = new ItemPedidoEntity();
			iPE.setCantidad(200);
			res.getItemsPedido().add(iPE);
			session.save(res);
			
			session.close();
		
	}
	
	public void altaPedidoConNegocio(Pedido pedido) throws DAOException {
		JOptionPane.showMessageDialog(null, pedido.getNroPedido());
		PedidoEntity pedidoE = new PedidoEntity();
		pedidoE = this.toEntity(pedido);
		try {
			Session s = sf.openSession();
			s.beginTransaction();
			s.save(pedidoE);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {
			throw new DAOException("Error PedidoDAO. AltaPedido");
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<PedidoEntity> recuperarListaPedidosCliente(long nrocliente) {
		try {
			Session session = sf.openSession();
			session.beginTransaction();
			List<PedidoEntity> Pedidos = session.createQuery("select p from PedidoEntity p join p.cliente c where c.nroCliente = :cliente ")
					.setParameter("cliente", nrocliente).list();
			session.getTransaction().commit();
			session.close();
			return Pedidos;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Error PedidoDAO.recuperarListaPedidosCliente");
		}
		return null;
	}
	
//	public Pedido toNegocio(PedidoEntity pedido) {
//		Pedido res = new Pedido();
//		res.setNroPedido(res.getNroPedido());
//		res.setCliente(res.getCliente());
//		res.setEstadoPedido(res.getEstadoPedido());
//		res.setFechaGeneracion(res.getFechaGeneracion());
//		res.setFechaDespacho(res.getFechaDespacho());
//		res.setTotal(res.getTotal());
//		
//		return res;
//	}

	public Pedido toNegocio(PedidoDTO pedidoDTO) {
		Pedido res = new Pedido();
		//res.setNroPedido(pedidoDTO.getNroPedido());
		Cliente cli = new Cliente();
		cli.setNroCliente(pedidoDTO.getCliente().getNroCliente());
		res.setCliente(cli);
		res.setEstadoPedido(pedidoDTO.getEstadoPedido());
		res.setFechaGeneracion(pedidoDTO.getFechaGeneracion());
		res.setFechaDespacho(pedidoDTO.getFechaDespacho());
		res.setTotal(pedidoDTO.getTotal());
		
//		List<ItemPedido> itemsList = new ArrayList<ItemPedido>();
//		if (pedidoDTO.getItemsPedido() != null) {
//			for(ItemPedidoDTO itemPAuxDTO : pedidoDTO.getItemsPedido()) {
//				ItemPedido item = new ItemPedido();
//				Articulo art = new Articulo();
//				art.setCodArticulo(itemPAuxDTO.getArticulo().getCodArticulo());
//				item.setArticulo(art);
//				item.setCantidad(itemPAuxDTO.getCantidad());
//				item.setNroItemPedido(itemPAuxDTO.getNroItemPedido());
//				itemsList.add(item);
//			}	
//		}
//		res.setItemsPedido(itemsList);
		return res;
	}

//	public PedidoEntity toEntity(Pedido pedido) {
//		PedidoEntity res = new PedidoEntity();
//		ClienteEntity cli = new ClienteEntity();
//		//res.setNroPedido(pedido.getNroPedido());
//		//res.setCliente(new ClienteEntity().setNroCliente(pedido.getCliente().getNroCliente()));
//		cli.setNroCliente(pedido.getCliente().getNroCliente());
//		res.setCliente(cli);
//		res.setEstadoPedido(pedido.getEstadoPedido());
//		res.setFechaGeneracion(pedido.getFechaGeneracion());
//		res.setFechaDespacho(pedido.getFechaDespacho());
//		res.setTotal(pedido.getTotal());
//	}
	
	
		public PedidoEntity toEntity(Pedido pedido) {
			PedidoEntity res = new PedidoEntity();
			res.setNroPedido(res.getNroPedido());
			res.setCliente(res.getCliente());
			res.setEstadoPedido(res.getEstadoPedido());
			res.setFechaGeneracion(res.getFechaGeneracion());
			res.setFechaDespacho(res.getFechaDespacho());
			res.setTotal(res.getTotal());
			
			return res;
		}
		
		
//		List<ItemPedidoEntity> itemList = new ArrayList<ItemPedidoEntity>();
//		if (pedido.getItemsPedido() != null) {
//			for(ItemPedido itemPAux : pedido.getItemsPedido()) {
//				ItemPedidoEntity item = new ItemPedidoEntity();
//				ArticuloEntity articuloE = new ArticuloEntity();
//				articuloE.setCodArticulo(itemPAux.getArticulo().getCodArticulo());
//				item.setArticulo(articuloE);
//				item.setCantidad(itemPAux.getCantidad());
//				item.setNroItemPedido(itemPAux.getNroItemPedido());
//				itemList.add(item);
//			}	
//		}
//		res.setItemsPedido(itemList);
//		return res;
//	}

	public void guardarPedido(Pedido pedido) {
		PedidoEntity pedidoE = new PedidoEntity(); 
		pedidoE = this.toEntity(pedido);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(pedidoE);
		session.getTransaction().commit();
		session.close();
	}

	//Listado de Pedidos Nuevos
	@SuppressWarnings("unchecked")
	public List<Pedido> getPedidosNuevos(int nroCliente) {
		try {
			List<Pedido> resultado = new ArrayList<Pedido>();
			Session s = sf.openSession();
			List<PedidoEntity> aux = (List<PedidoEntity>)s.createQuery("FROM PedidoEntity p join p.cliente c where c.nroCliente = :cliente and p.estadoPedido = 'Nuevo' ")
					.setParameter("cliente", nroCliente).list();
			s.close();
			for(PedidoEntity pedido : aux)
				resultado.add(this.toNegocio(pedido));
			return resultado;
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("Error PedidoDAO.recuperarListaPedidosNuevos");
		}
		return null;
	}

	private Pedido toNegocio(PedidoEntity pedido) {
		Pedido res = new Pedido();
		res.setNroPedido(pedido.getNroPedido());
		res.setFechaGeneracion(pedido.getFechaGeneracion());
		res.setFechaDespacho(pedido.getFechaDespacho());
		res.setTotal(pedido.getTotal());
		res.setEstadoPedido(pedido.getEstadoPedido());
		
		return res;
	}
	
	
}
