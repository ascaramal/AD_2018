package dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import entities.ArticuloEntity;
import entities.LoteEntity;
import exceptions.DAOException;
import hbt.HibernateUtil;
import negocio.Articulo;
import negocio.Cliente;
import negocio.Lote;

public class ArticuloDAO {

	private static ArticuloDAO instancia;
	private static SessionFactory sf;
	
	private ArticuloDAO() {}

	public static ArticuloDAO getInstancia() {		
		if(instancia == null) {
			instancia = new ArticuloDAO();
			sf = HibernateUtil.getSessionFactory();
		}
		return instancia;
	}

	public Articulo findArticulo(int nroArticulo) throws DAOException {
		Articulo art = null;
		try {
			Session s = sf.openSession();
			s.beginTransaction();
			ArticuloEntity articuloE = (ArticuloEntity) s.createQuery("from ArticuloEntity a where a.codArticulo = :nroArticulo")
					.setParameter("nroArticulo", nroArticulo).uniqueResult();
			s.getTransaction().commit();
			s.close();	
			art = this.toNegocio(articuloE);
			return art;
		} catch (Exception e) {
			System.out.println(e);
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
		
		if (articulo.getLotes() != null) {
			for(LoteEntity loteAux : articulo.getLotes()) {
				Lote lote = new Lote();
				lote.setCodLote(loteAux.getCodLote());
				lote.setMovimiento(lote.getMovimiento());
				//lote.
			}	
		}
		return res;
	}
		
	public Articulo toNegocio(ArticuloEntity articulo) {
		Articulo res = new Articulo();
		res.setCodArticulo(articulo.getCodArticulo());
		res.setPrecio(articulo.getPrecio());
		res.setCantReal(articulo.getCantReal());
		res.setCantFuturoDisponible(articulo.getCantFuturoDisponible());
		res.setCantReservada(articulo.getCantReservada());
	
		return res;
	}

	public Cliente findCliente(Integer nroArticulo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
