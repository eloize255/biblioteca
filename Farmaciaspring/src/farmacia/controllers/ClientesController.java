package farmacia.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import farmacia.daos.ClienteDAO;
import farmacia.models.Cliente;

@Controller
public class ClientesController {
	
	@RequestMapping("/clientes/form")
	public String Form() {
		System.out.println("chamou meu m�todo");
		return "clientes/form";
	}
	
	@PostMapping("/clientes")
	public String adicionar(Cliente cliente) {
		System.out.println("Chamou o m�todo de adicionar");
		System.out.println(cliente);
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.inserir(cliente);
		return "redirect:clientes/form";
		}
	
	@GetMapping("/clientes")
	public ModelAndView listar() {
		System.out.println("Chamou m�todo de listagem");
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> lista = clienteDAO.getLista();
		ModelAndView model = new ModelAndView("clientes/lista");
		model.addObject("clientes", lista);
		return model;
		
	}
	
	@RequestMapping("/clientes/remover")
	public String remover(Cliente cliente) {
		System.out.println("Chamou o m�todo remover.");
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.remover(cliente);
		
		return "redirect:../clientes";
		
	}
	
	@RequestMapping("/clientes/selecionar")
	public ModelAndView selecionar(Cliente cliente) {
		ClienteDAO clienteDAO = new ClienteDAO();
		cliente = clienteDAO.getById(cliente.getId());
		
		ModelAndView model = new ModelAndView("clientes/form-alterar");
		model.addObject("cliente", cliente);
		return model;
		
	}
	
	@PostMapping("/clientes/alterar")
	public String alterar(Cliente cliente) {
		System.out.println("Chamou o m�todo alterar");
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.alterar(cliente);
		return "redirect:../clientes";
		
	}

}
