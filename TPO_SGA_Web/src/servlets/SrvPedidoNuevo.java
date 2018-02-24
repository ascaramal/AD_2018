package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessDelegate.BusinessDelegate;
import dto.PedidoDTO;
import exceptions.ClienteException;
import exceptions.PedidoException;
import exceptions.SistemaException;

/**
 * Servlet implementation class SrvPedidoNuevo
 */
@WebServlet("/SrvPedidoNuevo")
public class SrvPedidoNuevo extends HttpServlet {

	private static final long serialVersionUID = -7890417807536576769L;

	
	BusinessDelegate bd;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrvPedidoNuevo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String clienteString = request.getParameter("nroCliente");
		try {
			bd = BusinessDelegate.getInstance();
			List<PedidoDTO> pedidos = bd.getPedidosNuevos(Integer.valueOf(clienteString));
			request.setAttribute("pedidos", pedidos);	
		} catch (SistemaException | ClienteException | NumberFormatException | PedidoException e) {
			System.err.println(e);
		}
		dispatch(request, response);
	}

	protected void dispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("lstPedidosAgregados.jsp");
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
