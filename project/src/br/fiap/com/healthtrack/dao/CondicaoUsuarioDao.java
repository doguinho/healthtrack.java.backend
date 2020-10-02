package br.fiap.com.healthtrack.dao;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import br.fiap.com.healthtrack.*;

public class CondicaoUsuarioDao {
	
	List<CondicaoUsuario> historico;
	
	public CondicaoUsuarioDao() {
		this.historico = new ArrayList<CondicaoUsuario>();
	}
	
	public void addCondicao(CondicaoUsuario c) {
		this.historico.add(c);
	}
	
	public List<CondicaoUsuario> getAll() {
		
		/**
		 * retorna histórico das condições do usuário
		 * */
		
		Usuario usuario = new UsuarioDao().getById(1);
		int u = usuario.getId();
		
		//dia 1
		
		Date data = new GregorianCalendar(2020, 9, 1).getTime();		
		
		CondicaoUsuario condicao = new CondicaoUsuario(data,u);
		condicao.setPeso(90);
		this.addCondicao(condicao);
		
		//dia 2
		
		data = new GregorianCalendar(2020, 9, 2).getTime();		
		
		condicao = new CondicaoUsuario(data,u);
		condicao.setPeso(89.9);
		this.addCondicao(condicao);
		
		//dia 3

		data = new GregorianCalendar(2020, 9, 3).getTime();		
		
		condicao = new CondicaoUsuario(data,u);
		condicao.setPeso(89.8);
		this.addCondicao(condicao);

		//dia 4

		data = new GregorianCalendar(2020, 9, 4).getTime();		
		
		condicao = new CondicaoUsuario(data,u);
		condicao.setPeso(89.7);
		this.addCondicao(condicao);
		
		//dia 5

		data = new GregorianCalendar(2020, 9, 5).getTime();		
		
		condicao = new CondicaoUsuario(data,u);
		condicao.setPeso(89.6);
		this.addCondicao(condicao);
		
		//dia 6

		data = new GregorianCalendar(2020, 9, 6).getTime();		
		
		condicao = new CondicaoUsuario(data,u);
		condicao.setPeso(89.5);
		this.addCondicao(condicao);


		//dia 7

		data = new GregorianCalendar(2020, 9, 7).getTime();		
		
		condicao = new CondicaoUsuario(data,u);
		condicao.setPeso(89.4);
		this.addCondicao(condicao);

		
		//dia 8

		data = new GregorianCalendar(2020, 9, 8).getTime();		
		
		condicao = new CondicaoUsuario(data,u);
		condicao.setPeso(89.4);
		this.addCondicao(condicao);
		

		//dia 9

		data = new GregorianCalendar(2020, 9, 9).getTime();		
		
		condicao = new CondicaoUsuario(data,u);
		condicao.setPeso(89.3);
		this.addCondicao(condicao);
		
		//dia 10

		data = new GregorianCalendar(2020, 9, 10).getTime();		
		
		condicao = new CondicaoUsuario(data,u);
		condicao.setPeso(89.2);
		this.addCondicao(condicao);
		
		
		return this.historico;
	}
 
}
