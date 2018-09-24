package agenda.comandos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agenda.daos.LivroDAO;
import agenda.models.Livro;

public class AdicionarLivro implements Comando {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String editora = request.getParameter("editora");
		String dataEmTexto = request.getParameter("anoPublicacao");
		
		
		
		Calendar dataFinal = null;
		try {
			Date dataProvisoria = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataFinal = Calendar.getInstance();
			dataFinal.setTime(dataProvisoria);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Livro livro = new Livro();
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setEditora(editora);
		livro.setAnoPublicacao(dataFinal);
		livro.setAnoEdicao(dataFinal);
		
		
		LivroDAO dao = new LivroDAO();
		dao.inserir(livro);
		
		return "livro-adicionado.jsp";
		
	}

	

}
