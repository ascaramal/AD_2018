package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import entities.PedidoEntity;
import hbt.HibernateUtil;

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
	public List<PedidoEntity> recuperarListaPedidosAceptado() {
		try {
			Session session = sf.openSession();
			session.beginTransaction();
			List<PedidoEntity> Pedidos = session.createQuery("from PedidoEntity p where p.estadoPedido ='Aceptado' ")
					.list();
			session.getTransaction().commit();
			session.close();
			return Pedidos;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Error PedidoDAO.recuperarListaPedidosAceptado");
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
}
