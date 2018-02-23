package dao;

import org.hibernate.SessionFactory;

import entities.UbicacionEntity;
import negocio.Ubicacion;

public class UbicacionDAO {

	private static UbicacionDAO instance;
	SessionFactory sf;
	
	private UbicacionDAO(){ }

	public static UbicacionDAO getInstace(){
		if(instance == null)
			instance = new UbicacionDAO();
		return instance;
	}

	public Ubicacion toNegocio(UbicacionEntity ubiE) {
		Ubicacion ubi = new Ubicacion();
		ubi.setNroUbicacion(ubiE.getNroUbicacion());
		ubi.setCodigoUbicacion(ubiE.getCodigoUbicacion());
		ubi.setCapacidadMax(ubiE.getCapacidadMax());
		ubi.setCantLibre(ubiE.getCantLibre());
		ubi.setLote(LoteDAO.getInstace().toNegocio(ubiE.getLote()));
		return ubi;
	}
	
}