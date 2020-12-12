package br.com.ifpb.servlet;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaContatoServlet
 */
@WebServlet("/listarContatos")
public class ListaContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaContatoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SimuladorBD banco = new SimuladorBD();
		List<Contato> lista = banco.getContatos();
		
		RequestDispatcher rd =request.getRequestDispatcher("/listaContatoView.jsp");
		request.setAttribute("lista", lista);
		rd.forward(request, response);
	
	}
}
