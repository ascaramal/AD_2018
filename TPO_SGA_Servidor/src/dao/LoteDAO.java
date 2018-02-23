package dao;

import org.hibernate.SessionFactory;

import entities.LoteEntity;
import entities.UbicacionEntity;
import negocio.Lote;
import negocio.Ubicacion;

public class LoteDAO {

	private static LoteDAO instance;
	SessionFactory sf;
	
	private LoteDAO(){ }

	public static LoteDAO getInstace(){
		if(instance == null)
			instance = new LoteDAO();
		return instance;
	}

	public Lote toNegocio(LoteEntity lotE) {
		Lote lot = new Lote();
		lot.setCodLote(lotE.getCodLote());
		lot.setFechaVtoLote(lotE.getFechaVtoLote());
		lot.setArticulo(ArticuloDAO.getInstancia().toNegocio(lotE.getArticulo()));

		//LOTE NO CONOCE MOVIMIENTOS
		
		if (lotE.getUbicaciones() != null) {
			
			for(UbicacionEntity itemAux : lotE.getUbicaciones()) {
				Ubicacion ubic = new Ubicacion();
				ubic.setCantLibre(itemAux.getCantLibre());
				ubic.setCapacidadMax(itemAux.getCapacidadMax());
				ubic.setCodigoUbicacion(itemAux.getCodigoUbicacion());
				ubic.setNroUbicacion(itemAux.getNroUbicacion());
				ubic.setLote(LoteDAO.getInstace().toNegocio(itemAux.getLote()));
				lot.agregarUbicaciones(ubic);
			}	
		}
		
		return lot;
	}
	
}
