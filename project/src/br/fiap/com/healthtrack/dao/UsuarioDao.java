package br.fiap.com.healthtrack.dao;

import br.fiap.com.healthtrack.Usuario;

public class UsuarioDao {
		
	
	Usuario getById(int id) {
		/**
		 * retorna usuário dado um id numérico
		 */
		Usuario usuario = new Usuario(id);
		usuario.setNome("João Gabriel");
		usuario.setNomeUsuario("joao");
		return usuario;
	}

}
