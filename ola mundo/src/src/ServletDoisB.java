package src;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cabecalhos")
public class ServletDoisB extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		
		String host = requisicao.getHeader("host");
		String ua = requisicao.getHeader("user-agent");
		String ae = requisicao.getHeader("accept-encoding");
		String al = requisicao.getHeader("accept-language");
		
		requisicao.setAttribute("cliHost", host);
		requisicao.setAttribute("cliUa", ua);
		requisicao.setAttribute("cliAe", ae);
		requisicao.setAttribute("cliAl", al);
		
		RequestDispatcher dispatcher = requisicao.getRequestDispatcher("index.jsp");
		
		dispatcher.forward(requisicao, resposta);
	}
	
}
