package br.com.pacote.perguntas;

import java.util.Scanner;

public class PerguntasAnsiedade {

	/*
	 * 2.Senti minha boca seca Não se aplicou de maneira alguma Aplicou-se em algum
	 * grau, ou por pouco de tempo Aplicou-se em um grau considerável, ou por uma
	 * boa parte do tempo Aplicou-se muito, ou na maioria do tempo
	 */

	Scanner leia = new Scanner(System.in);

	public int questao1() {
		int opcao = 0;
		while (opcao < 1 || opcao > 4) {
			System.out.println("Senti minha boca seca");
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
				System.out.println("Por favor, informe uma opção válida");
				opcao = 0;
				continue;

			}

		}
		return opcao;
	}

	public int questao2() {
		PerguntasUtil pergunta1 = new PerguntasUtil();
		return pergunta1.esqueletoPerguntas("Tive dificuldade em respirar em alguns momentos ", " 1- Não se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
		
	}

}




























