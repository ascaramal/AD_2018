package dao;

import org.hibernate.SessionFactory;

import entities.ItemRemitoEntity;
import entities.LoteEntity;
import entities.RemitoEntity;
import hbt.HibernateUtil;
import negocio.ItemRemito;
import negocio.Lote;
import negocio.Remito;

public class RemitoDAO {
	
	private static RemitoDAO instancia;
	private static SessionFactory sf;
	
	private RemitoDAO() {}

	public static RemitoDAO getInstancia() {
		if(instancia == null) {
			instancia = new RemitoDAO();
			sf = HibernateUtil.getSessionFactory();
		}
		return instancia;
	}
	
	private Remito toNegocio(RemitoEntity remE) {
		Remito remito = new Remito();
		
		remito.setCliente(ClienteDAO.getInstancia().toNegocio(remE.getCliente()));
		remito.setFecha(remE.getFecha());
		//remito.setItems(ItemRemitoDAO.getInstancia().toNegocio(remE.getItems()));
		
		if (remE.getItems() != null) {
			
			for(ItemRemitoEntity itemAux : remE.getItems()) {
				ItemRemito ir = new ItemRemito();
				ir.setArticulo(ArticuloDAO.getInstancia().toNegocio(itemAux.getArticulo()));
				ir.setCant(itemAux.getCant());
				ir.setNroItemRemito(itemAux.getNroItemRemito());
				remito.agregarItem(ir);
				
			}
		}
				/*
		ir.setCant(irE.getCant());
		ir.setArticulo(ArticuloDAO.getInstancia().toNegocio(irE.getArticulo()));
		ir.setNroItemRemito(irE.getNroItemRemito());*/
		
		return remito;
	}		
	
}