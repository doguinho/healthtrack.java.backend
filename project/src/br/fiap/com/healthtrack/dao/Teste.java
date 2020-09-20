package br.fiap.com.healthtrack.dao;
import java.text.SimpleDateFormat;
import java.util.List;
import br.fiap.com.healthtrack.CondicaoUsuario;

public class Teste {

	public static void main(String[] args) {

		List<CondicaoUsuario> historico = new CondicaoUsuarioDao().getAll();
		
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
