package agenda.comandos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agenda.daos.AlunoDAO;
import agenda.models.Aluno;

public class AdicionarAluno implements Comando {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		String matricula = request.getParameter("matricula");
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String dataEmTexto = request.getParameter("dataNascimento");
		
		Calendar dataFinal = null;
		try {
			Date dataProvisoria = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataFinal = Calendar.getInstance();
			dataFinal.setTime(dataProvisoria);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setEndereco(endereco);
		aluno.setDataNascimento(dataFinal);
		
		AlunoDAO dao = new AlunoDAO();
		dao.inserir(aluno);
		
		return "aluno-adicionado.jsp"; 
		
	}

}
