package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import businessDelegate.BusinessDelegate;
import dto.ClienteDTO;
import exceptions.ClienteException;
import exceptions.SistemaException;

/**
 * Servlet implementation class ControladorLogin
 */
@WebServlet("/ControladorLogin")
public class ControladorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BusinessDelegate bd;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		
		
		String clienteString = request.getParameter("nroCliente");
		ClienteDTO cliente = new ClienteDTO();
		
		//String nombre = request.getParameter("nombre");
		
		
		try {
			bd = BusinessDelegate.getInstance();
			cliente.setNroCliente(Integer.valueOf(clienteString));
			cliente=bd.findCliente(cliente.getNroCliente());
			if (cliente==null) {
				response.sendRedirect("index.jsp");
			} else if (cliente.getNroCliente() == 6) {
				response.sendRedirect("perfilAdmin.html");
			} else {
				response.sendRedirect("pedidoCliente.jsp");		
			}
			session.setAttribute("user", cliente);
		}
		catch (SistemaException | ClienteException e) {
			// If it fails redirect back with a message		
			session.setAttribute("error", "Error al iniciar sesión");	
			response.sendRedirect("/TPO_SGA_Web/index.jsp");
		}
		
	}

}
