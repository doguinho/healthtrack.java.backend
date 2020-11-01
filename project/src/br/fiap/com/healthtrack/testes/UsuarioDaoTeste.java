package br.fiap.com.healthtrack.testes;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import br.fiap.com.healthtrack.Usuario;
import br.fiap.com.healthtrack.dao.UsuarioDao;

public class UsuarioDaoTeste {

	public static void main(String[] args) {
		
		novoUsuario();
		Usuario u = listar();
		atualizar(u);
		apagar(u);
	}
	
	public static void novoUsuario() {
		Usuario usuario = new Usuario();
		usuario.setAltura(1.85);
		Date dataNascimento = new GregorianCalendar(1982, 8, 1).getTime();		
		usuario.setDataNascimento(dataNascimento);
		usuario.setEmail("email@email.com");
		usuario.setFoto(null);
		usuario.setNome("Paulo");
		usuario.setSobrenome("Macartinei");		
		usuario.setSenha("e10adc3949ba59abbe56e057f20f883e");
		
		UsuarioDao dao = new UsuarioDao();
		dao.cadastrar(usuario);		
	}
	
	public static Usuario listar() {		
		UsuarioDao dao = new UsuarioDao();
		List<Usuario> usuarios = dao.getAll();
		System.out.println("Registros: " + usuarios.size());
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}		
		return dao.getById(usuarios.get(0).getId());
	}
	
	public static void atualizar(Usuario u) {
		UsuarioDao dao = new UsuarioDao();
		u.setNome("Joaquim");
		dao.atualizar(u);
	}
	
	public static void apagar(Usuario u) {
		UsuarioDao dao = new UsuarioDao();
		dao.apagar(u.getId());
	}
	
}
