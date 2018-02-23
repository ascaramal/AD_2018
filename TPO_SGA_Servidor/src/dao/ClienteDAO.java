package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import entities.ClienteEntity;
import exceptions.ClienteException;
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
		try {
			List<Cliente> resultado = new ArrayList<Cliente>();
			Session s = sf.openSession();
			List<ClienteEntity> aux = (List<ClienteEntity>)s.createQuery("FROM ClienteEntity").list();
			s.close();
			for(ClienteEntity cliente : aux)
				resultado.add(this.toNegocio(cliente));
			return resultado;
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("Error PedidoDAO.recuperarListaPedidosAceptado");
		}
		return null;
	}

    public Cliente buscarPorCodigo(int codigo) {
        
        Cliente cl = null;
        
        Session session = null;
        
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            ClienteEntity ClienteEntity = (ClienteEntity) session.load(ClienteEntity.class, codigo);
                
            cl = new Cliente();
            cl.setNroCliente(ClienteEntity.getNroCliente());
    		cl.setRazonSocial(ClienteEntity.getRazonSocial()); 
    		cl.setDireccion(ClienteEntity.getDireccion());
    		cl.setLocalidad(ClienteEntity.getLocalidad());
    		cl.setCodPostal(ClienteEntity.getCodPostal()); 
    		cl.setTelefono(ClienteEntity.getTelefono());
    		cl.setCuit(ClienteEntity.getCuit());
    		cl.setCondIVA(ClienteEntity.getCondIVA());
    		cl.setLimiteDeCredito(ClienteEntity.getLimiteDeCredito());
    		cl.setSaldo(ClienteEntity.getSaldo());
        }
        
        //Exception o HibernateException???
        catch(Exception e) {
        	System.out.println("Error ClienteDAO.recuperarClientePorCodigo");
            
        } finally {
            if(session != null && session.isOpen()) {
                session.close();
            }
        }
        //Devuelvo el Cliente encontrado con ese Nro de Cliente.
        return cl;        
    }

	public Cliente findCliente(int nroCliente) throws DAOException, ClienteException {
		Cliente cli = null;
		try {
			Session s = sf.openSession();
			s.beginTransaction();
			ClienteEntity clienteE = (ClienteEntity) s.createQuery("from ClienteEntity c where c.nroCliente = :nroCliente ")
					.setParameter("nroCliente", nroCliente).uniqueResult();
			s.getTransaction().commit();
			s.close();	
			if(clienteE != null) { 
				cli = this.toNegocio(clienteE);
				return cli;
			}
		} catch (Exception e) {
			System.out.println("Error ClienteDAO.findCliente");
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
		res.setLimiteDeCredito(cliente.getLimiteDeCredito());
		res.setSaldo(cliente.getSaldo());
		
		return res;
	}

	public ClienteEntity toEntity(Cliente cliente) {
		ClienteEntity res = new ClienteEntity();
		res.setNroCliente(cliente.getNroCliente());
		res.setRazonSocial(cliente.getRazonSocial()); 
		res.setDireccion(cliente.getDireccion());
		res.setLocalidad(cliente.getLocalidad());
		res.setCodPostal(cliente.getCodPostal()); 
		res.setTelefono(cliente.getTelefono());
		res.setCuit(cliente.getCuit());
		res.setCondIVA(cliente.getCondIVA());
		res.setLimiteDeCredito(cliente.getLimiteDeCredito());
		res.setSaldo(cliente.getSaldo());
		
		return res;
	}

	public void guardarCliente(ClienteEntity cliente) throws ClienteException{
		try {
			Session session=sf.openSession();
			session.beginTransaction();
			session.save(cliente);
			session.getTransaction().commit();
			session.close();
			}
		catch(Exception e){
				throw new ClienteException ("Error al Grabar");
		}
	}
}
