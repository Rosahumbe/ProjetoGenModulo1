package br.com.generation.dass.java.projeto;

import java.util.Scanner;

public class ProjetoGenJavaDassMain {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		
	Interface telaInicial = new Interface();
	telaInicial.saudacao();
	
		//dados do "paciente"
		System.out.println("Por favor, informe seu nome");
		nome = leia.nextLine();
		System.out.println("Olá, "+nome+ "! Por favor me informe sua idade");
		idade = leia.nextInt();
		

	}

}
