package br.com.generation.dass.java.projeto;

import java.util.Scanner;

public class ProjetoGenJavaDassMain {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.println("====================================================================");
		System.out.println("|                                                                  |");
		System.out.println("|   Seja bem-vindo ao Java Dass21                   (ɔ◔‿◔)ɔ ♥      |");
		System.out.println("|                                                                  |");
		System.out.println("|   Este protótipo foi criado com o propósito de auxiliar pessoas  |");
		System.out.println("|   a identificar sintomas relacionados a depressão, ansiedade e   |");
		System.out.println("|   estress e foi baseado no no DASS21 (Depression, Anxiety and    |");
		System.out.println("|   and Stress Scale)                                              |");
		System.out.println("|                                                                  |");
		System.out.println("|                    ::::::::: ATENÇÃO :::::::::                   |"); 
		System.out.println("|                                                                  |");
		System.out.println("|   O resultado da avaliação não indica um diagnóstico conclusivo. |");
		System.out.println("|  Para determinar qualquer diagnóstico potencial discuta seu      |");
		System.out.println("|  resultado com um psicólogo ou um médico psiquiatra.             |");
		System.out.println("====================================================================");
		
		//dados do "paciente"
		System.out.println("Por favor, informe seu nome");
		nome = leia.nextLine();
		System.out.println("Olá, "+nome+ "! Por favor me informe sua idade");
		idade = leia.nextInt();
		

	}

}
