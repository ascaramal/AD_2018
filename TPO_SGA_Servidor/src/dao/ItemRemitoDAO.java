package dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import entities.ArticuloEntity;
import entities.ItemRemitoEntity;
import exceptions.DAOException;
import hbt.HibernateUtil;
import negocio.Articulo;
import negocio.ItemRemito;

public class ItemRemitoDAO {
	
	private static ItemRemitoDAO instancia;
	private static SessionFactory sf;
	
	private ItemRemitoDAO() {}

	public static ItemRemitoDAO getInstancia() {
		if(instancia == null) {
			instancia = new ItemRemitoDAO();
			sf = HibernateUtil.getSessionFactory();
		}
		return instancia;
	}
	
	
	public ItemRemito findItemRemito(int nroItemRemito) throws DAOException {
		ItemRemito ir = null;
		try {
			Session s = sf.openSession();
			s.beginTransaction();
			ItemRemitoEntity irE = (ItemRemitoEntity) s.createQuery("from ItemRemito ir where ir.nroItemRemito = :itemRemito")
					.setParameter("itemRemito", nroItemRemito).uniqueResult();
			s.getTransaction().commit();
			s.close();	
			ir = this.toNegocio(irE);
			return ir;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Error ItemRemitoDAO.findItemRemito");
		}
		return null;
	}

	private ItemRemito toNegocio(ItemRemitoEntity irE) {
		ItemRemito ir = new ItemRemito();
		ir.setCant(irE.getCant());
		ir.setArticulo(ArticuloDAO.getInstancia().toNegocio(irE.getArticulo()));
		ir.setNroItemRemito(irE.getNroItemRemito());
		
		return ir;
	}

}
