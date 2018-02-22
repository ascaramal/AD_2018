package dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import entities.ItemOrdenDeCompraEntity;
import exceptions.DAOException;
import hbt.HibernateUtil;
import negocio.ItemOrdenDeCompra;

public class ItemOrdenDeCompraDAO {

	private static ItemOrdenDeCompraDAO instancia;
	private static SessionFactory sf;
	
	private ItemOrdenDeCompraDAO() {}

	public static ItemOrdenDeCompraDAO getInstancia() {
		if(instancia == null) {
			instancia = new ItemOrdenDeCompraDAO();
			sf = HibernateUtil.getSessionFactory();
		}
		return instancia;
	}
	
	
	public ItemOrdenDeCompra findItemOrdenDeCompra(int nroItemOrdenDeCompra) throws DAOException {
		ItemOrdenDeCompra ioc = null;
		try {
			Session s = sf.openSession();
			s.beginTransaction();
			ItemOrdenDeCompraEntity iocE = (ItemOrdenDeCompraEntity) s.createQuery("from ItemOrdenDeCompra ioc where ioc.nroItemOrdenDeCompra = :itemOrdenDeCompra")
					.setParameter("itemOrdenDeCompra", nroItemOrdenDeCompra).uniqueResult();
			s.getTransaction().commit();
			s.close();	
			ioc = this.toNegocio(iocE);
			return ioc;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Error ItemOrdenDeCompraDAO.findItemOrdenDeCompra");
		}
		return null;
	}

	private ItemOrdenDeCompra toNegocio(ItemOrdenDeCompraEntity iocE) {
		ItemOrdenDeCompra ioc = new ItemOrdenDeCompra();
		ioc.setCantidad(iocE.getCantidad());
		ioc.setArticulo(ArticuloDAO.getInstancia().toNegocio(iocE.getArticulo()));
		ioc.setNroItemOrdenDeCompra(iocE.getNroItemOrdenDeCompra());
		
		return ioc;
	}
	
}
