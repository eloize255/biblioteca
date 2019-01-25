package farmacia.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import farmacia.daos.ClienteDAO;
import farmacia.daos.CompraDAO;
import farmacia.daos.ProdutoDAO;
import farmacia.models.Cliente;
import farmacia.models.Compra;
import farmacia.models.Produtos;

@Controller
public class CompraController {
	
	@RequestMapping("/compras/form")
	public ModelAndView cadastroCompra() {
		System.out.println("Chamou o cadastro de Compra");
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> listaCliente = clienteDAO.getLista();
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produtos> listaProdutos = produtoDAO.getLista();
		
		
		ModelAndView model = new ModelAndView("compras/form");
		model.addObject("clientes", listaCliente);
		model.addObject("produtos", listaProdutos);
		
		return model;
		
	}
	
	@RequestMapping("/compras/comprar")
	public String comprar(Compra compra) {
		System.out.println("Chamou o cadastro de Comprar");
		CompraDAO compraDAO = new CompraDAO();
		compraDAO.inserir(compra);
		return "redirect:listar";
	}
	
	@RequestMapping("/compras/listar")
	public ModelAndView listarCompras() {
		System.out.println("Chamou o lista de Compra");
		CompraDAO compraDAO = new CompraDAO();
		List<Compra> listaCompra = compraDAO.getLista();
		
		ModelAndView model = new ModelAndView("compras/lista");
		model.addObject("compras", listaCompra);
		
		return model;
		
	}
	
	@RequestMapping("/compras/remover")
	public String remover(Compra compra) {
		System.out.println("Chamou o método remover.");
		CompraDAO compraDAO = new CompraDAO();
		compraDAO.remover(compra);
		
		return "redirect:../compras/listar";
		
	}

}
