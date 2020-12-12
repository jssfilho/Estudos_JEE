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
 * Servlet implementation class ExcluirContatoServlet
 */
@WebServlet("/excluirContato")
public class ExcluirContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		SimuladorBD banco = new SimuladorBD();
		String name = request.getParameter("name");
		banco.deleta(name);
		List<Contato> lista = banco.getContatos();
		RequestDispatcher rd =request.getRequestDispatcher("/excluirContato.jsp");
		request.setAttribute("lista", lista);
		rd.forward(request, response);
	}	
	
}
