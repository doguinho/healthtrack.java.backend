package br.fiap.com.healthtrack.dao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.fiap.com.healthtrack.Atividade;
import br.fiap.com.healthtrack.CondicaoUsuario;
import br.fiap.com.healthtrack.Usuario;

public class Teste {

	public static void main(String[] args) {
		
		Usuario usuario = new UsuarioDao().getById(4);
		
		CondicaoUsuario c = new CondicaoUsuario(usuario);
		c.setPeso(60.0);
		c.setGorduraCorporal(12.0);
		
		CondicaoUsuarioDao condicaoDAO = new CondicaoUsuarioDao(usuario);				
		condicaoDAO.addCondicao(c , new Date());
		
		Atividade atividade = new Atividade("Pular amarelinha",2.0);
		AtividadeDao atividadeDao = new AtividadeDao();
		atividadeDao.cadastrar(atividade);
		
		listaPesos(usuario);		
		listaAtividades();
		atualizarAtividade();
		apagarAtividade();				
		
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
	
	public static void listaAtividades() {
		
		List<Atividade> atividades = new AtividadeDao().getAll();
				
		System.out.println("Lista Atividades: " + atividades.size());
		
		for (int i = 0; i < atividades.size(); i++) {			
			
			System.out.println(atividades.get(i).getNome());
		}
		
		
	}
	
	public static void apagarAtividade() {
		
		AtividadeDao atividadeDao = new AtividadeDao();		
		List<Atividade> atividades = atividadeDao.getAll();
		atividadeDao.apagar(atividades.get(0).getId());
				
	}
	
	public static void atualizarAtividade() {
		
		AtividadeDao atividadeDao = new AtividadeDao();		
		List<Atividade> atividades = atividadeDao.getAll();
		atividades.get(0).setNome("Crossfit");		
		atividadeDao.atualizar(atividades.get(0));		
		
	}

}
