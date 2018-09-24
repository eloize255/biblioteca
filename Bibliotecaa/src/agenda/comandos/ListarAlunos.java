package agenda.comandos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agenda.daos.AlunoDAO;
import agenda.models.Aluno;

public class ListarAlunos implements Comando {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		AlunoDAO dao = new AlunoDAO();
		List<Aluno> alunos = dao.getLista();
		
		request.setAttribute("alunos", alunos);
		
		return "lista.jsp";

}
}

