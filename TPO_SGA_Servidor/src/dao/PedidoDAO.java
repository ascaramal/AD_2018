package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import entities.PedidoEntity;
import hbt.HibernateUtil;
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
	
	@SuppressWarnings("unchecked")
	public List<Pedido> recuperarListaPedidos() {
		try {
			List<Pedido> resultado = new ArrayList<Pedido>();
			Session s = sf.openSession();
			List<PedidoEntity> aux = (List<PedidoEntity>)s.createQuery("from PedidoEntity")
					.list();
			s.getTransaction().commit();
			s.close();
			for(PedidoEntity pedido : aux)
				resultado.add(this.toNegocio(pedido));
			return resultado;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Error PedidoDAO.recuperarListaPedidos");
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
	
	public Pedido toNegocio(PedidoEntity pedido) {
		Pedido res = new Pedido();
		res.setNroPedido(res.getNroPedido());
		res.setCliente(res.getCliente());
		res.setEstadoPedido(res.getEstadoPedido());
		res.setFechaGeneracion(res.getFechaGeneracion());
		res.setFechaDespacho(res.getFechaDespacho());
		res.setTotal(res.getTotal());
		
		for()
		
		return res;

	}
}
