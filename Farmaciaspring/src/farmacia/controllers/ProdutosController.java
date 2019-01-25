package farmacia.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import farmacia.daos.ProdutoDAO;
import farmacia.models.Produtos;


@Controller
public class ProdutosController {
	
	@RequestMapping("/produtos/form")
	public String Form() {
		System.out.println("chamou meu método");
		return "produtos/form";
	}
	
	@PostMapping("/produtos")
	public String adicionar(Produtos produtos) {
		System.out.println("Chamou o método de adicionar");
		System.out.println(produtos);
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.inserir(produtos);
		return "redirect:produtos/form";
		}
	
	@GetMapping("/produtos")
	public ModelAndView listar() {
		System.out.println("Chamou método de listagem");
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produtos> lista = produtoDAO.getLista();
		ModelAndView model = new ModelAndView("produtos/lista");
		model.addObject("produtos", lista);
		return model;
		
	}
	
	@RequestMapping("/produtos/remover")
	public String remover(Produtos produtos) {
		System.out.println("Chamou o método remover.");
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.remover(produtos);
		
		return "redirect:../produtos";
		
	}


}
