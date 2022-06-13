package br.com.generation.dass.java.perguntas;

import java.util.Scanner;

public class PerguntasUtil {
	
	
	Scanner leia = new Scanner(System.in);
	
	public int esqueletoPerguntas(String pergunta, String opcoes) {
		int opcao = 0;
		while (opcao < 1 || opcao > 4) {
			System.out.println(pergunta);
			System.out.println(opcoes);
			opcao = leia.nextInt();
			
			

			switch (opcao) {
			case 1:

				opcao = 1;
				break;

			case 2:
				opcao = 2;
				break;

			case 3:
				opcao = 3;
				break;

			case 4:
				opcao = 4;
				break;

			default:
				System.out.println("Informe uma opção válida");
				opcao = 0;
				continue;
			}

		}

		return opcao;
	}

}
