package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import interfaces.*;
import or.ObjetoRemoto;


public class Server {
	INegocio objetoRemoto;

	// Constructor del servidor
	public Server() {
		iniciar();
	}

	public void iniciar() {
		try {
			LocateRegistry.createRegistry(1099);
			objetoRemoto = ObjetoRemoto.getInstance();
			Naming.rebind("//localhost/ObjetoRemoto", objetoRemoto);
			System.out.println("Servidor inicializado correctamente...");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
