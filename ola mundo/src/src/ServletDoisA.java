package src;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requisicao")
public class ServletDoisA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		
		String metodo = requisicao.getMethod();
		String uri = requisicao.getRequestURI();
		String protocolo = requisicao.getProtocol();
		
		requisicao.setAttribute("cliMetodo", metodo);
		requisicao.setAttribute("cliUri", uri);
		requisicao.setAttribute("cliProtocolo", protocolo);
		
		RequestDispatcher dispatcher = requisicao.getRequestDispatcher("index.jsp");
		
		dispatcher.forward(requisicao, resposta);
	}
}
