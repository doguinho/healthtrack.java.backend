package br.fiap.com.healthtrack.dao;

import br.fiap.com.healthtrack.Usuario;
import br.fiap.com.jdbc.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class UsuarioDao {

	private Connection conexao;
	private PreparedStatement stmt = null;

	public UsuarioDao() {
	}

	public void cadastrar(Usuario usuario) {

		try {

			conexao = FiapDBManager.obterConexao();
			String sql = " INSERT INTO RM85401.T_USUARIO "
					+ "(NOME, SOBRENOME, EMAIL, DT_NASCIMENTO, SEXO, SENHA, FOTO, ALTURA) "
					+ "VALUES (?,?,?,?,?,?,?,?) ";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSobrenome());
			stmt.setString(3, usuario.getEmail());
			java.sql.Date dataNascimento = new java.sql.Date(usuario.getDataNascimento().getTime());
			stmt.setDate(4, dataNascimento);
			stmt.setString(5, String.valueOf(usuario.getSexo()));
			stmt.setString(6, usuario.getSenha());
			stmt.setBlob(7, usuario.getFoto());
			stmt.setDouble(8, usuario.getAltura());

			stmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println("Não foi possível conectar no Banco de Dados");
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

	public Usuario getById(int id) {
		/**
		 * retorna usuário dado um id numérico
		 */

		Usuario usuario = null;

		try {

			conexao = FiapDBManager.obterConexao();
			String sql = " SELECT * FROM RM85401.T_USUARIO "
					+ " LEFT JOIN T_PREFERENCIA_USUARIO "
					+ " ON T_USUARIO.ID_USUARIO = T_PREFERENCIA_USUARIO.ID_USUARIO "
					+ " WHERE T_USUARIO.ID_USUARIO = ? ";
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				
				usuario = new Usuario();
				usuario.setId(id);
				usuario.setNome(result.getString("NOME"));
				usuario.setSobrenome(result.getString("SOBRENOME"));
				usuario.setEmail(result.getString("EMAIL"));
				usuario.setDataNascimento(result.getDate("DT_NASCIMENTO"));
				usuario.setSexo(result.getString("SEXO").charAt(0));
				usuario.setSenha(result.getString("SENHA"));
				usuario.setFoto(result.getBlob("FOTO"));
				usuario.setAltura(result.getDouble("ALTURA"));
			}

		} catch (SQLException e) {
			System.err.println("Não foi possível conectar no Banco de Dados");
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return usuario;
	}
	
	public List<Usuario> getAll() {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			
			conexao = FiapDBManager.obterConexao();
			String sql = " SELECT * FROM RM85401.T_USUARIO ";
			stmt = conexao.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();
			
			while (result.next()) {
				
				Usuario usuario = new Usuario();
				usuario.setId(result.getInt("ID_USUARIO"));
				usuario.setNome(result.getString("NOME"));
				usuario.setSobrenome(result.getString("SOBRENOME"));
				usuario.setEmail(result.getString("EMAIL"));
				usuario.setDataNascimento(result.getDate("DT_NASCIMENTO"));
				usuario.setSexo(result.getString("SEXO").charAt(0));
				usuario.setSenha(result.getString("SENHA"));
				usuario.setFoto(result.getBlob("FOTO"));
				usuario.setAltura(result.getDouble("ALTURA"));
				
				usuarios.add(usuario);
				
			}
			
			
			
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar no Banco de Dados");
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return usuarios;
		
	}
	
	public void atualizar(Usuario usuario) {
		try {
			
			conexao = FiapDBManager.obterConexao();
			String sql = " UPDATE RM85401.T_USUARIO SET "
					+ " NOME = ?, SOBRENOME = ?, EMAIL = ?, DT_NASCIMENTO = ?, SEXO = ?, SENHA = ?, FOTO = ?, ALTURA = ? "
					+ " WHERE T_USUARIO.ID_USUARIO = ? ";
			
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSobrenome());
			stmt.setString(3, usuario.getEmail());
			java.sql.Date dataNascimento = new java.sql.Date(usuario.getDataNascimento().getTime());
			stmt.setDate(4, dataNascimento);
			stmt.setString(5, String.valueOf(usuario.getSexo()));
			stmt.setString(6, usuario.getSenha());
			stmt.setBlob(7, usuario.getFoto());
			stmt.setDouble(8, usuario.getAltura());
			stmt.setInt(9, usuario.getId());
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar no Banco de Dados");
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
			String sql = " DELETE FROM RM85401.T_USUARIO WHERE ID_USUARIO = ? ";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			
			stmt.executeUpdate();
			
			
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar no Banco de Dados");
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
