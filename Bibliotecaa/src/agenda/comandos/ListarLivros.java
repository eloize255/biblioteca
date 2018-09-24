package agenda.comandos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agenda.daos.LivroDAO;
import agenda.models.Livro;

public class ListarLivros implements Comando {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		LivroDAO dao = new LivroDAO();
		List<Livro> livros = dao.getLista();
		
		request.setAttribute("livros", livros);
		
		return "lista.jsp";

}
}
