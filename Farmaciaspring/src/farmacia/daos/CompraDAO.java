package farmacia.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import farmacia.daos.ClienteDAO;
import farmacia.daos.ConnectionFactory;
import farmacia.daos.ProdutoDAO;
import farmacia.models.Cliente;
import farmacia.models.Compra;
import farmacia.models.Produtos;

public class CompraDAO {
	

	private Connection connection;

	public CompraDAO() {
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir(Compra compra) {

		String query = "insert into compra (id_cliente, id_produto, data_compra) values (?, ?, ?);";

		try {
			PreparedStatement p = connection.prepareStatement(query);

			Calendar calendario = Calendar.getInstance();
			

			p.setInt(1, compra.getCliente().getId());
			p.setInt(2, compra.getProdutos().getId());
			p.setDate(3,  new java.sql.Date(calendario.getTimeInMillis()));

			p.execute();
			p.close();
			System.out.println("Salvo com sucesso");

		} catch (SQLException e) {
			e.printStackTrace();
			return true;
		}
		return false;
	}
	
	public List<Compra> getLista() {
		List<Compra> result = new ArrayList<>();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from compra;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Compra
				Compra compra = new Compra();
				compra.setId(rs.getInt("id"));
				compra.setCliente(new ClienteDAO().getById(rs.getInt("id_cliente")));
				compra.setProdutos(new ProdutoDAO().getById(rs.getInt("id_produto")));
				// montando a data atrav�s do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("data_compra"));
				compra.setData_compra(data);
				
				
				result.add(compra);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	public boolean remover(Compra compra) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from compra where id=?;");
			stmt.setLong(1, compra.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}


}
