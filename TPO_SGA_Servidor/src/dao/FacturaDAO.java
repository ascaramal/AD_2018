package dao;

import org.hibernate.SessionFactory;

import entities.FacturaEntity;
import entities.ItemFacturaEntity;
import hbt.HibernateUtil;
import negocio.Factura;
import negocio.ItemFactura;

public class FacturaDAO {

	private static FacturaDAO instancia;
	private static SessionFactory sf;
	
	private FacturaDAO() {}

	public static FacturaDAO getInstancia() {
		if(instancia == null) {
			instancia = new FacturaDAO();
			sf = HibernateUtil.getSessionFactory();
		}
		return instancia;
	}
	
	private Factura toNegocio(FacturaEntity facE) {
		Factura factura = new Factura();
		
		factura.setCliente(ClienteDAO.getInstancia().toNegocio(facE.getCliente()));
		factura.setFechaEmision(facE.getFechaEmision());
		factura.setNumero(facE.getNumero());
		factura.setPrefijo(facE.getPrefijo());
		factura.setTotal(facE.getTotal());

		
		if (facE.getItemsFactura() != null) {
			
			for(ItemFacturaEntity itemAux : facE.getItemsFactura()) {
				ItemFactura ifa = new ItemFactura();
				ifa.setArticulo(ArticuloDAO.getInstancia().toNegocio(itemAux.getArticulo()));
				ifa.setCantidad(itemAux.getCantidad());
				ifa.setNroItemFactura(itemAux.getNroItemFactura());
				factura.agregarItemFactura(ifa);
			}	
		}
		return factura;
	}		
}