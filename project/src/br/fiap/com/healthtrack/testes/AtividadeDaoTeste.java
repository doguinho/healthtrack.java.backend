package br.fiap.com.healthtrack.testes;

import java.util.List;

import br.fiap.com.healthtrack.Atividade;
import br.fiap.com.healthtrack.dao.AtividadeDao;

public class AtividadeDaoTeste {
	
	public static void main(String[] args) {
		
		Atividade atividade = new Atividade("Pular amarelinha",2.0);
		AtividadeDao atividadeDao = new AtividadeDao();
		atividadeDao.cadastrar(atividade);
		
		listaAtividades();
		atualizarAtividade();
		apagarAtividade();
		
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
