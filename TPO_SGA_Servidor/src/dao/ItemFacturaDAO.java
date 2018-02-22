package dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import entities.ItemFacturaEntity;
import exceptions.DAOException;
import hbt.HibernateUtil;
import negocio.ItemFactura;

public class ItemFacturaDAO {

	private static ItemFacturaDAO instancia;
	private static SessionFactory sf;
	
	private ItemFacturaDAO() {}

	public static ItemFacturaDAO getInstancia() {
		if(instancia == null) {
			instancia = new ItemFacturaDAO();
			sf = HibernateUtil.getSessionFactory();
		}
		return instancia;
	}
	
	
	public ItemFactura findItemFactura(int nroItemFactura) throws DAOException {
		
		ItemFactura ifa = null;
		try {
			Session s = sf.openSession();
			s.beginTransaction();
			ItemFacturaEntity ifE = (ItemFacturaEntity) s.createQuery("from ItemFactura ifa where ifa.nroItemFactura = :itemFactura")
					.setParameter("itemFactura", nroItemFactura).uniqueResult();
			s.getTransaction().commit();
			s.close();	
			ifa = this.toNegocio(ifE);
			return ifa;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Error ItemFacturaDAO.findItemFactura");
		}
		return null;
	}

	private ItemFactura toNegocio(ItemFacturaEntity ifE) {
		ItemFactura ifa = new ItemFactura();
		ifa.setNroItemFactura(ifE.getNroItemFactura());
		ifa.setCantidad(ifE.getCantidad());
		ifa.setPrecio(ifE.getPrecio());
		//Tengo que pasarle un Objeteh
		ifa.setArticulo(ArticuloDAO.getInstancia().toNegocio(ifE.getArticulo()));
			
		return ifa;
	}
	
}
