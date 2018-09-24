package agenda.models;

import java.util.Calendar;

public class Livro {
	
	private Long id;
	private String titulo;
	private String autor;
	private String editora;
	private Calendar anoPublicacao;
	private Calendar anoEdicao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Calendar getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(Calendar anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public Calendar getAnoEdicao() {
		return anoEdicao;
	}
	public void setAnoEdicao(Calendar anoEdicao) {
		this.anoEdicao = anoEdicao;
	}
	
	


}
