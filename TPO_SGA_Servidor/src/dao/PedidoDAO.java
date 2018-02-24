package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import dto.ItemPedidoDTO;
import dto.PedidoDTO;
import entities.ArticuloEntity;
import entities.ClienteEntity;
import entities.ItemPedidoEntity;
import entities.PedidoEntity;
import exceptions.ArticuloException;
import exceptions.DAOException;
import exceptions.PedidoException;
import hbt.HibernateUtil;
import negocio.Articulo;
import negocio.Cliente;
import negocio.ItemPedido;
import negocio.Pedido;
import test.$missing$;

public class PedidoDAO {

	private static PedidoDAO instancia;
	private static SessionFactory sf;
	
	private PedidoDAO() {
		sf = HibernateUtil.getSessionFactory();
	}

	public static PedidoDAO getInstancia() { 
		if(instancia == null) {
			instancia = new PedidoDAO();
		}
		return instancia;
	}
	
	public PedidoEntity findPedidoEntity(int nroPedido) throws DAOException, PedidoException {
		PedidoEntity ped= null;
		try {
			Session s = sf.openSession();
			s.beginTransaction();
			PedidoEntity pedidoE = (PedidoEntity) s.createQuery("from PedidoEntity p where p.nroPedido = :nroPedido")
					.setParameter("nroPedido",  nroPedido).uniqueResult();
			s.getTransaction().commit();
			s.close();
			return pedidoE;
		} catch (Exception e) {
			System.out.println("Error PedidoDAO.findPedido");
		}
		return null;
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
	public List<PedidoEntity> recuperarListaPedidos() {
		try {
			Session session = sf.openSession();
			session.beginTransaction();
			List<PedidoEntity> Pedidos = session.createQuery("from PedidoEntity p")
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

//	public void altaPedido(Pedido pedido) throws PedidoException  {
//		//Session session = null;
//		
//		try {
//			Session session = sf.openSession();
//			PedidoEntity pedE = new PedidoEntity();  
//			pedE.setCliente((ClienteEntity) session.load(ClienteEntity.class, pedido.getCliente().getNroCliente()));
//			System.out.println(pedE.getCliente().getRazonSocial());
//			pedE.setEstadoPedido(pedido.getEstadoPedido());
//			pedE.setFechaDespacho(pedido.getFechaDespacho());
//			pedE.setFechaGeneracion(pedido.getFechaGeneracion());
//			pedE.setTotal(pedido.getTotal());
//			
//			for (ItemPedido ip : pedido.getItemsPedido()) {
//				ItemPedidoEntity ipE = new ItemPedidoEntity();
//				ipE.setArticulo((ArticuloEntity) session.load(ArticuloEntity.class, ip.getArticulo().getCodArticulo()));
//				ipE.setCantidad(ip.getCantidad());
//				pedE.getItemsPedido().add(ipE);
//			}
//			//System.out.println(pedE.toString());
//			session.save(pedE);
//			session.getTransaction().commit();
////			session.persist(pedE);
////			session.flush();
//			session.close();
//			
//			ItemPedidoEntity iPE = new ItemPedidoEntity();
//			iPE.setCantidad(200);
//			res.getItemsPedido().add(iPE);
//			session.save(res);
//			
//		} catch (Exception e) {
//			throw new PedidoException("Error al generar pedido.");
//		}
//	}
		
//		res.setEstadoPedido(pedido.getEstadoPedido());
//		res.setFechaGeneracion(pedido.getFechaGeneracion());
//		res.setFechaDespacho(pedido.getFechaDespacho());
//		res.setTotal(pedido.getTotal());
			

			
//			for(ItemPedido itemPedido : pedido.getItemsPedido()) {
//				ItemPedidoEntity itemPEntity = new ItemPedidoEntity();
//				itemPEntity.setCantidad(itemPedido.getCantidad());
//				res.getItemsPedido().add(itemPEntity);
//			}
			

	
	public void altaPedido(Pedido pedido) throws DAOException {
		//JOptionPane.showMessageDialog(null, pedido.getNroPedido());
		PedidoEntity pedidoE = new PedidoEntity();
		//System.out.println(pedido.toString());
		pedidoE = this.toEntity(pedido);
		
		try {
			Session s = sf.openSession();
			s.beginTransaction();
			s.save(pedidoE);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			throw new DAOException("Error PedidoDAO. AltaPedido");
		}
	}
	
	public PedidoEntity toEntity(Pedido pedido) {
		PedidoEntity res = new PedidoEntity();
		res.setNroPedido(pedido.getNroPedido());
		ClienteEntity cli = new ClienteEntity();
		res.setCliente(cli);
		cli.setNroCliente(pedido.getCliente().getNroCliente());
		res.setEstadoPedido(pedido.getEstadoPedido());
		res.setFechaGeneracion(pedido.getFechaGeneracion());
		res.setFechaDespacho(pedido.getFechaDespacho());
		res.setTotal(pedido.getTotal());
		
		for(ItemPedido itemPAux : pedido.getItemsPedido()) {
			ItemPedidoEntity item = new ItemPedidoEntity();
			ArticuloEntity art = new ArticuloEntity();
//			System.out.println("Prueba desde Controlador negocio: " + itemPAuxDTO.getArticulo().toString());
			art.setCodArticulo(itemPAux.getArticulo().getCodArticulo());
			item.setArticulo(art);
			item.setCantidad(itemPAux.getCantidad());
			item.setNroItemPedido(itemPAux.getNroItemPedido());
			res.getItemsPedido().add(item);
		}
		return res;
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
		res.setNroPedido(pedidoDTO.getNroPedido());
		Cliente cli = new Cliente();
		res.setCliente(cli);
		cli.setNroCliente(pedidoDTO.getCliente().getNroCliente());
		res.setEstadoPedido(pedidoDTO.getEstadoPedido());
		res.setFechaGeneracion(pedidoDTO.getFechaGeneracion());
		res.setFechaDespacho(pedidoDTO.getFechaDespacho());
		res.setTotal(pedidoDTO.getTotal());
		
		for(ItemPedidoDTO itemPAuxDTO : pedidoDTO.getItemsPedido()) {
			ItemPedido item = new ItemPedido();
			Articulo art = new Articulo();
//			System.out.println("Prueba desde Controlador negocio: " + itemPAuxDTO.getArticulo().toString());
			art.setCodArticulo(itemPAuxDTO.getArticulo().getCodArticulo());
			item.setArticulo(art);
			item.setCantidad(itemPAuxDTO.getCantidad());
			item.setNroItemPedido(itemPAuxDTO.getNroItemPedido());
			res.getItemsPedido().add(item);
		}
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
	
	
//		public PedidoEntity toEntity(Pedido pedido) {
//			PedidoEntity res = new PedidoEntity();
//			res.setNroPedido(res.getNroPedido());
//			res.setEstadoPedido(res.getEstadoPedido());
//			res.setFechaGeneracion(res.getFechaGeneracion());
//			res.setFechaDespacho(res.getFechaDespacho());
//			res.setTotal(res.getTotal());
//			
//			if (ControladorDespacho.getInstancia().)
//			
//			return res;
//		}
		
		
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

//	public void guardarPedido(Pedido pedido) {
//		PedidoEntity pedidoE = new PedidoEntity(); 
//		pedidoE = this.toEntity(pedido);
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//		session.save(pedidoE);
//		session.getTransaction().commit();
//		session.close();
//	}

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
		
		if(pedido.getCliente() != null) {
			res.setCliente(pedido.getCliente().toNegocio());
		}
		
		return res;
	}

	public Pedido findPedido(int nroPedido) throws DAOException, PedidoException {
		Pedido ped = null;
		try {
			Session s = sf.openSession();
			s.beginTransaction();
			PedidoEntity pedidoE = (PedidoEntity) s.createQuery("from PedidoEntity p where p.nroPedido = :nroPedido")
					.setParameter("nroPedido",  nroPedido).uniqueResult();
			s.getTransaction().commit();
			s.close();
			if(pedidoE != null) {
				ped = this.toNegocio(pedidoE);
				return ped;
			}
		} catch (Exception e) {
			System.out.println("Error PedidoDAO.findPedido");
		}
		return null;
	}

	public void actualizarEstadoPedido(Pedido pedido) throws DAOException {
		PedidoEntity pedidoE = new PedidoEntity();
		//System.out.println(pedido.toString());
		pedidoE = this.toEntity(pedido);
		
		try {
			Session s = sf.openSession();
			s.beginTransaction();
			s.update(pedidoE);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			throw new DAOException("Error PedidoDAO. AltaPedido");
		}
	}

	
	@SuppressWarnings("unchecked")
	public List<PedidoEntity> getPedidosEntity() {
		try {
			Session s = sf.openSession();
			List<PedidoEntity> aux = (List<PedidoEntity>)s.createQuery("FROM PedidoEntity").list();
			s.close();
				
			return aux;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Error PedidoDAO.getPedidos()");
		}
		return null;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Pedido> getPedidos() {
		try {
			List<Pedido> res = new ArrayList<Pedido>();
			Session s = sf.openSession();
			List<PedidoEntity> aux = (List<PedidoEntity>)s.createQuery("FROM PedidoEntity").list();
			s.close();
			for(PedidoEntity pedido : aux) {
				System.out.println(pedido.getCliente().getNroCliente());
				res.add(this.toNegocio(pedido));
			}
				
			return res;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Error PedidoDAO.getPedidos()");
		}
		return null;
	}

	
	/*	//Listado de Clientes
	@SuppressWarnings("unchecked")
	public List<Cliente> getClientes() {
		try {
			List<Cliente> resultado = new ArrayList<Cliente>();
			Session s = sf.openSession();
			List<ClienteEntity> aux = (List<ClienteEntity>)s.createQuery("FROM ClienteEntity").list();
			s.close();
			for(ClienteEntity cliente : aux)
				resultado.add(this.toNegocio(cliente));
			return resultado;
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("Error PedidoDAO.recuperarListaPedidosAceptado");
		}
		return null;
	}*/
}
