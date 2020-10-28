package br.fiap.com.healthtrack.dao;

import br.fiap.com.healthtrack.Usuario;
import br.fiap.com.jdbc.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {
	
	private Connection conexao;
	private PreparedStatement stmt = null;
		
	
	Usuario getById(int id) {
		/**
		 * retorna usuário dado um id numérico
		 */
		
		Usuario usuario = null;
			
		try {
			
			conexao = FiapDBManager.obterConexao();		
			String sql = " SELECT * FROM RM85401.T_USUARIO WHERE ID_USUARIO = ? ";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();
			
			if (result.next()) {
				String nome = result.getString("NOME");
				String sobrenome = result.getString("SOBRENOME");
				usuario = new Usuario(id);
				usuario.setNome(nome + " " + sobrenome);				
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

}

