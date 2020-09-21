package br.fiap.com.healthtrack;

import java.util.Date;
import java.util.Scanner;
/**
 * Calculo do IMC
 * @author Grupo 8
 * @version 1.0
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o seu nome? = ");
		String nome = sc.next();
	
		System.out.print("Insira seu peso(Kg) Ex: 61,50 = ");	
		double peso = sc.nextDouble();
		
		System.out.print("Insira sua altura(m) Ex: 1,67 = ");
		double altura = sc.nextDouble();
		
		Usuario usuario = new Usuario(1);
		usuario.setNomeUsuario(nome);
		
		CondicaoUsuario condicao = new CondicaoUsuario(new Date(), usuario.getId());
		condicao.setAltura(altura);
		condicao.setPeso(peso);
/* Imprime o Resultado IMC em valor
 * 		
 */
		System.out.println("Resultado IMC = " + condicao.getIMC());
/*
 * Imprime a condição resultadoIMC
 * 
 */
		System.out.println(condicao.resultadoIMC());
		
		sc.close();

	}

}
