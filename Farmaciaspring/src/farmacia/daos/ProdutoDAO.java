package farmacia.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.text.SimpleDateFormat;


import farmacia.daos.ConnectionFactory;
import farmacia.models.Produtos;

public class ProdutoDAO {
	
	private Connection connection;

	public ProdutoDAO() {
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir(Produtos produtos) {

		String sql = "insert into produtos (nome, dataValidade, preco, marca) values (?, ?, ?, ?);";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, produtos.getNome());
			stmt.setDate(2, new java.sql.Date(produtos.getDataValidade().getTimeInMillis()));
			stmt.setFloat(3, produtos.getPreco());
			stmt.setString(4, produtos.getMarca());
			


			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public List<Produtos> getLista() {
		List<Produtos> result = new ArrayList<>();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from produtos;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Produto
				Produtos produtos = new Produtos();
				produtos.setId(rs.getInt("id"));
				produtos.setNome(rs.getString("nome"));
				// montando a data atrav�s do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataValidade"));
				produtos.setDataValidade(data);
				
				produtos.setPreco(rs.getFloat("preco"));
				produtos.setMarca(rs.getString("marca"));
				

				// adicionando o objeto � lista
				result.add(produtos);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public boolean alterar(Produtos produtos) {
		String sql = "update produtos set nome=?, dataValidade=?, preco=?, marca=?, where id=?;";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produtos.getNome());
			stmt.setDate(2, new java.sql.Date(produtos.getDataValidade().getTimeInMillis()));
			stmt.setFloat(3, produtos.getPreco());
			stmt.setString(4, produtos.getMarca());
			stmt.setLong(5, produtos.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean remover(Produtos produtos) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from produtos where id=?;");
			stmt.setLong(1, produtos.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Produtos getById(int id) {
		Produtos result = null;

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from produtos where id = ?;");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				// criando o objeto Contato
				result = new Produtos();
				result.setId(rs.getInt("id"));
				result.setNome(rs.getString("nome"));
				
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataValidade"));
				result.setDataValidade(data);
				
				result.setPreco(rs.getFloat("preco"));
				result.setMarca(rs.getString("marca"));
				
	}
			
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}


}
