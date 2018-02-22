package dao;

import org.hibernate.SessionFactory;

import entities.FacturaEntity;
import entities.ItemFacturaEntity;
import entities.OrdenDeCompraEntity;
import hbt.HibernateUtil;
import negocio.OrdenDeCompra;

public class OrdenDeCompraDAO {

	private static OrdenDeCompraDAO instancia;
	private static SessionFactory sf;
	
	private OrdenDeCompraDAO() {}

	public static OrdenDeCompraDAO getInstancia() {
		if(instancia == null) {
			instancia = new OrdenDeCompraDAO();
			sf = HibernateUtil.getSessionFactory();
		}
		return instancia;
	}
	
	private OrdenDeCompra toNegocio(OrdenDeCompraEntity odc) {
		OrdenDeCompra ordenDeCompra = new OrdenDeCompra();
		
		ordenDeCompra.setNroOrdenDeCompra(odc.getNroOrdenDeCompra());
		ordenDeCompra.setNroProveedor(odc.getNroProveedor());
		
		
//		if (facE.getItemsFactura() != null) {
//			
//			for(ItemFacturaEntity itemAux : facE.getItemsFactura()) {
//				ItemFactura ifa = new ItemFactura();
//				ifa.setArticulo(ArticuloDAO.getInstancia().toNegocio(itemAux.getArticulo()));
//				ifa.setCantidad(itemAux.getCantidad());
//				ifa.setNroItemFactura(itemAux.getNroItemFactura());
//				factura.agregarItemFactura(ifa);
//			}	
//		}
		
		return ordenDeCompra;
	}
	
}
