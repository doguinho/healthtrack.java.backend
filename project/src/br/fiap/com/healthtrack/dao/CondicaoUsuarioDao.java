package br.fiap.com.healthtrack.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
//import java.util.GregorianCalendar;
import java.util.List;

import br.fiap.com.healthtrack.*;
import br.fiap.com.jdbc.FiapDBManager;

public class CondicaoUsuarioDao {
	
	private Connection conexao = null;
	private PreparedStatement stmt = null;	
	
	Usuario usuario;
	
	public CondicaoUsuarioDao(Usuario usuario) { 
		this.usuario = usuario;
	}
	
	public void addCondicao(CondicaoUsuario c, Date data) {
		
		try {
			
			conexao = FiapDBManager.obterConexao();
			
			String sql = " INSERT INTO RM85401.T_CONDICAO_USUARIO (ID_USUARIO, DATA, PESO, GORDURA_CORPORAL) VALUES (?,?,?,?) ";
			
			stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, this.usuario.getId());
			java.sql.Date dataRegistro = new java.sql.Date(data.getTime());
			stmt.setDate(2, dataRegistro);
			stmt.setDouble(3, c.getPeso());
			stmt.setDouble(4, c.getGorduraCorporal());
						
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
	
	public List<CondicaoUsuario> getAll() {
		
		/**
		 * retorna histórico das condições do usuário
		 * */
		
		List<CondicaoUsuario> historico = new ArrayList<CondicaoUsuario>();
		
		try {
			
			conexao = FiapDBManager.obterConexao();
			
			String sql = " SELECT * FROM RM85401.T_CONDICAO_USUARIO WHERE ID_USUARIO = ? ";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, this.usuario.getId());
			
			ResultSet result = stmt.executeQuery();
			
			while (result.next()) {
				
				Date data = result.getDate("DATA");
				double peso = result.getDouble("PESO");
				double gorduraCorporal = result.getDouble("GORDURA_CORPORAL");
				
//				Date data = new GregorianCalendar(2020, 9, 1).getTime();		
				
				CondicaoUsuario condicao = new CondicaoUsuario(this.usuario);
				condicao.setPeso(peso);
				condicao.setGorduraCorporal(gorduraCorporal);
				condicao.setData(data);
				
				historico.add(condicao);														
				
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
						
		
		return historico;
	}
 
}
