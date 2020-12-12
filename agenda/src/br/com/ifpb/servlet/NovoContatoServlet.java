package br.com.ifpb.servlet;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoContatoServlet
 */
@WebServlet("/novoContato")
public class NovoContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		Contato newContato = new Contato(name,phone);
		
		SimuladorBD banco = new SimuladorBD();
		banco.adiciona(newContato);
		response.sendRedirect("listarContatos");
		/*
		RequestDispatcher rd = request.getRequestDispatcher("/novoContatoSalvo.jsp");
		request.setAttribute("name", newContato.getName());
		rd.forward(request, response);
		*/
	}

}
