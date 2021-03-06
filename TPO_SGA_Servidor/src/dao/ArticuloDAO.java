package dao;

import org.hibernate.SessionFactory;

import org.hibernate.classic.Session;

import entities.ArticuloEntity;
import exceptions.ArticuloException;
import exceptions.DAOException;
import hbt.HibernateUtil;
import negocio.Articulo;


public class ArticuloDAO {

	private static ArticuloDAO instancia;
	private static SessionFactory sf;
	
	private ArticuloDAO() {
		sf = HibernateUtil.getSessionFactory();
	}

	public static ArticuloDAO getInstancia() {		
		if(instancia == null) {
			instancia = new ArticuloDAO();
		}
		return instancia;
	}

	public Articulo findArticulo(int nroArticulo) throws DAOException, ArticuloException {
		Articulo art = null;
		try {
			Session s = sf.openSession();
			s.beginTransaction();
			ArticuloEntity articuloE = (ArticuloEntity) s.createQuery("from ArticuloEntity a where a.codArticulo = :nroArticulo")
					.setParameter("nroArticulo", nroArticulo).uniqueResult();
			s.getTransaction().commit();
			s.close();	
			if(articuloE != null) { 
				art = this.toNegocio(articuloE);
				return art;
			} 
		} catch (Exception e) {
			System.out.println("Error ArticuloDAO.findArticulo");
		}
		
		return null;
	}

	public Articulo toNegocio2(ArticuloEntity articulo) {
		Articulo res = new Articulo();
		res.setCodArticulo(articulo.getCodArticulo());
		res.setCodigoBarras(articulo.getCodigoBarras());
		res.setMarca(articulo.getMarca());
		res.setDescripcion(articulo.getDescripcion());
		res.setPresentacion(articulo.getPresentacion());
		res.setTamano(articulo.getTamano());
		res.setUnidad(articulo.getUnidad());
		res.setCantAComprar(articulo.getCantAComprar());
		res.setTipo(articulo.getTipo());
		res.setPrecio(articulo.getPrecio());
		res.setCantReal(articulo.getCantReal());
		res.setCantFuturoDisponible(articulo.getCantFuturoDisponible());
		res.setCantReservada(articulo.getCantReservada());

//	
//		if (articulo.getLotes() !=null){
//		
//			for(LoteEntity loteAux : articulo.getLotes()) {
//				Lote lote = new Lote();
//				lote.setCodLote(loteAux.getCodLote());
//				lote.setFechaVtoLote(loteAux.getFechaVtoLote());
//				
//				for (UbicacionEntity ubiAux : lote.getUbicaciones()) {
//					Ubicacion ubicacion = new Ubicacion();
//					ubicacion.setCantOcupada(ubiAux.getCantOcupada());
//					ubicacion.set
//				}
//
//			}
//		}
//		if (articulo.getLotes() != null) {
//			for(LoteEntity loteAux : articulo.getLotes()) {
//				Lote lote = new Lote();
//				lote.setCodLote(loteAux.getCodLote());
//				lote.setMovimiento(lote.getMovimiento());
//				//lote
//			}
//		}
		return res;
	}
		
	public Articulo toNegocio(ArticuloEntity articulo) {
		Articulo res = new Articulo();
		res.setCodArticulo(articulo.getCodArticulo());
		res.setDescripcion(articulo.getDescripcion());
		res.setPrecio(articulo.getPrecio());
		res.setCantReal(articulo.getCantReal());
		res.setCantFuturoDisponible(articulo.getCantFuturoDisponible());
		res.setCantReservada(articulo.getCantReservada());
	
		return res;
	}

	public ArticuloEntity toEntity(Articulo articulo) {
		ArticuloEntity res = new ArticuloEntity();
		res.setCodArticulo(articulo.getCodArticulo());
		res.setDescripcion(articulo.getDescripcion());
		res.setPrecio(articulo.getPrecio());
		res.setCantReal(articulo.getCantReal());
		res.setCantFuturoDisponible(articulo.getCantFuturoDisponible());
		res.setCantReservada(articulo.getCantReservada());
	
		return res;
	}	
}
