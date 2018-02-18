package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.ClienteDTO;

public interface INegocio extends Remote {

	public List<ClienteDTO> getClientes() throws RemoteException;
}
