package br.fiap.com.healthtrack.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.fiap.com.healthtrack.Atividade;
import br.fiap.com.jdbc.FiapDBManager;

public class AtividadeDao {

	private Connection conexao = null;
	private PreparedStatement stmt = null;

	public AtividadeDao() {
	}

	public void cadastrar(Atividade a) {

		try {

			conexao = FiapDBManager.obterConexao();

			String sql = " INSERT INTO RM85401.T_ATIVIDADES (NM_ATIVIDADE, CALORIAS_POR_MINUTO) VALUES (?,?) ";

			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, a.getNome());
			stmt.setDouble(2, a.getCaloriasPorMinuto());

			stmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println("N�o foi poss�vel conectar no Banco de Dados");
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Atividade getById(int id) {

		Atividade a = null;

		try {
			conexao = FiapDBManager.obterConexao();

			String sql = " SELECT * FROM RM85401.T_ATIVIDADES WHERE ID_ATIVIDADE = ? ";
			stmt = conexao.prepareStatement(sql);

			ResultSet result = stmt.executeQuery(sql);

			while (result.next()) {
				String nome = result.getString("NM_ATIVIDADE");
				double caloriasPorMinuto = result.getDouble("CALORIAS_POR_MINUTO");
				a = new Atividade(id, nome);
				a.setCaloriasPorMinuto(caloriasPorMinuto);
			}
		} catch (SQLException e) {
			System.err.println("N�o foi poss�vel conectar no Banco de Dados");
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return a;

	}

	public List<Atividade> getAll() {

		List<Atividade> atividades = new ArrayList<Atividade>();

		try {

			conexao = FiapDBManager.obterConexao();

			String sql = "SELECT * FROM RM85401.T_ATIVIDADES";
			stmt = conexao.prepareStatement(sql);

			ResultSet result = stmt.executeQuery(sql);

			while (result.next()) {

				int id = result.getInt("ID_ATIVIDADE");
				String nome = result.getString("NM_ATIVIDADE");
				double caloriasPorMinuto = result.getDouble("CALORIAS_POR_MINUTO");

				Atividade a = new Atividade(id, nome);
				a.setCaloriasPorMinuto(caloriasPorMinuto);

				atividades.add(a);

			}

		} catch (SQLException e) {
			System.err.println("N�o foi poss�vel conectar no Banco de Dados");
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return atividades;

	}
	
	public void atualizar(Atividade a) {
		
		try {
			
			conexao = FiapDBManager.obterConexao();
			
			String sql = " UPDATE RM85401.T_ATIVIDADES SET NM_ATIVIDADE = ?, CALORIAS_POR_MINUTO = ? WHERE ID_ATIVIDADE = ? ";
			stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, a.getNome());
			stmt.setDouble(2, a.getCaloriasPorMinuto());
			stmt.setInt(3, a.getId());
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("N�o foi poss�vel conectar no Banco de Dados");
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void apagar(int id) {
		
		try {
			
			conexao = FiapDBManager.obterConexao();
			
			String sql = " DELETE FROM RM85401.T_ATIVIDADES WHERE ID_ATIVIDADE = ? ";
			stmt = conexao.prepareStatement(sql);			
			stmt.setInt(1, id);
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("N�o foi poss�vel conectar no Banco de Dados");
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		
	}

}
