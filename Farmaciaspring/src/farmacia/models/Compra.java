package farmacia.models;

import java.util.Calendar;

import farmacia.models.Cliente;
import farmacia.models.Produtos;

public class Compra {
	
	private int id;
	private Cliente cliente;
	private Produtos produtos;
	Calendar data_compra;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produtos getProdutos() {
		return produtos;
	}
	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}
	public Calendar getData_compra() {
		return data_compra;
	}
	public void setData_compra(Calendar data_compra) {
		this.data_compra = data_compra;
	}
	
	

}
