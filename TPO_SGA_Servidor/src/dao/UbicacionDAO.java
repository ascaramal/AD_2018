package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import hbt.HibernateUtil;

public class UbicacionDAO {

	private static UbicacionDAO instance;

	private UbicacionDAO(){ }

	public static UbicacionDAO getInstace(){
		if(instance == null)
			instance = new UbicacionDAO();
		return instance;
	}

	
}