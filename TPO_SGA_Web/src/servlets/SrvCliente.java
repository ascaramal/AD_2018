package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessDelegate.BusinessDelegate;
import dto.ClienteDTO;
import exceptions.ClienteException;
import exceptions.SistemaException;

/**
 * Servlet implementation class SrvCliente
 */

public class SrvCliente extends HttpServlet {
	
	private static final long serialVersionUID = 2796984951663757223L;
	
	BusinessDelegate bd;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			bd = BusinessDelegate.getInstance();
			List<ClienteDTO> clientes = bd.getClientes();
			request.setAttribute("clientes", clientes);	
		} catch (SistemaException | ClienteException e) {
			System.err.println(e);
		}
		dispatch(request, response);
	}

	protected void dispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("solicitarPedidoCliente.jsp");
		rd.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	
	}

}
