package farmacia.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import farmacia.daos.ConnectionFactory;
import farmacia.models.Cliente;

public class ClienteDAO {
	
	private Connection connection;

	public ClienteDAO() {
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir(Cliente cliente) {

		String sql = "insert into cliente (nome, cpf, idade, endereco, email) values (?, ?, ?, ?, ?);";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setInt(3, cliente.getIdade());
			
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getEmail());


			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public List<Cliente> getLista() {
		List<Cliente> result = new ArrayList<>();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from cliente;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Cliente
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				
				// montando a data atrav�s do Calendar
				Calendar data = Calendar.getInstance();
				cliente.setIdade(rs.getInt("idade"));
			
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setEmail(rs.getString("email"));
				

				// adicionando o objeto � lista
				result.add(cliente);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public boolean alterar(Cliente cliente) {
		String sql = "update cliente set nome=?, cpf=?, idade=?, endereco=?, email=? where id=?;";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setInt(3, cliente.getIdade());
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getEmail());
			stmt.setLong(6, cliente.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean remover(Cliente cliente) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from cliente where id=?;");
			stmt.setLong(1, cliente.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Cliente getById(int id) {
		Cliente result = null;

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from cliente where id = ?;");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				// criando o objeto Contato
				result = new Cliente();
				result.setId(rs.getInt("id"));
				result.setNome(rs.getString("nome"));
				result.setCpf(rs.getString("cpf"));
				
				// montando a data atrav�s do Calendar
				Calendar data = Calendar.getInstance();
				result.setIdade(rs.getInt("idade"));
				
				result.setEndereco(rs.getString("endereco"));
				result.setEmail(rs.getString("email"));

				
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}


}



