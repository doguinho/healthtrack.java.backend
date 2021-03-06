package br.fiap.com.healthtrack.testes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.fiap.com.healthtrack.Atividade;
import br.fiap.com.healthtrack.CondicaoUsuario;
import br.fiap.com.healthtrack.Usuario;
import br.fiap.com.healthtrack.dao.CondicaoUsuarioDao;
import br.fiap.com.healthtrack.dao.UsuarioDao;

public class Teste {

	public static void main(String[] args) {
		
		Usuario usuario = new UsuarioDao().getById(4);
		
		CondicaoUsuario c = new CondicaoUsuario(usuario);
		c.setPeso(60.0);
		c.setGorduraCorporal(12.0);
		
		CondicaoUsuarioDao condicaoDAO = new CondicaoUsuarioDao(usuario);				
		condicaoDAO.addCondicao(c , new Date());		
		
		listaPesos(usuario);						
		
	}
	
	private static void listaPesos(Usuario usuario) {
		
		
		List<CondicaoUsuario> historico = new CondicaoUsuarioDao(usuario).getAll();
		
		
		System.out.println("Histórico de peso:");
		
		for (int i = 0; i < historico.size(); i++) {
			
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			String data = df.format(historico.get(i).getData());
			
			System.out.print(data);
			System.out.print(" ");
			System.out.println(historico.get(i).getPeso() + " Kg");
			

		}
		
		
	}
	


}
