package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import entities.ClienteEntity;
import exceptions.DAOException;
import hbt.HibernateUtil;
import negocio.Cliente;


public class ClienteDAO {

	private static ClienteDAO instancia;
	private static SessionFactory sf;
	
	private ClienteDAO() {}

	public static ClienteDAO getInstancia() {
		if(instancia == null) {
			instancia = new ClienteDAO();
			sf = HibernateUtil.getSessionFactory();
		}
		return instancia;
	}
	
	//Listado de Clientes
	@SuppressWarnings("unchecked")
	public List<Cliente> getClientes() {
		List<Cliente> resultado = new ArrayList<Cliente>();
		Session s = sf.openSession();
		List<ClienteEntity> aux = (List<ClienteEntity>)s.createQuery("FROM ClienteEntity").list();
		sf.close();
		for(ClienteEntity cliente : aux)
			resultado.add(this.toNegocio(cliente));
		return resultado;
	}
	
	//Buscar cliente por nroCliente
	public Cliente recuperarCliente(Cliente cliente) throws DAOException {
		try {
			Session session = sf.openSession();
			session.beginTransaction();
			ClienteEntity clienteE = (ClienteEntity) session
					.createQuery("from ClienteEntity c where c.nroCliente = :nroCliente ")
					.setParameter("nroCliente", cliente.getNroCliente()).uniqueResult();
			session.getTransaction().commit();
			session.close();
				
		} catch (Exception e) {
			System.out.println("Error ClienteDAO.recuperarCliente");
		}
		return null;
	}
	
	
	public Cliente toNegocio(ClienteEntity cliente) {
		Cliente res = new Cliente();
		res.setNroCliente(cliente.getNroCliente());
		res.setRazonSocial(cliente.getRazonSocial()); 
		res.setDireccion(cliente.getDireccion());
		res.setLocalidad(cliente.getLocalidad());
		res.setCodPostal(cliente.getCodPostal()); 
		res.setTelefono(cliente.getTelefono());
		res.setCuit(cliente.getCuit());
		res.setCondIVA(cliente.getCondIVA());
		res.setNroCtaCte(cliente.getNroCtaCte().toNegocio());
		
		return res;
	}

}
