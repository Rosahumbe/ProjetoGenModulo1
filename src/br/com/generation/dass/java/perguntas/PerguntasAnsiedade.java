package br.com.generation.dass.java.perguntas;

import java.util.Scanner;

public class PerguntasAnsiedade {

	/*
	 * Perguntas sobre Ansiedade:
	 */

	Scanner leia = new Scanner(System.in);

	

	public int questao1() {
		PerguntasUtil pergunta1 = new PerguntasUtil();
		return pergunta1.esqueletoPerguntas("Senti minha boca seca: ", " 1- Não se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
		
	}
	public int questao2() {
		PerguntasUtil pergunta2 = new PerguntasUtil();
		return pergunta2.esqueletoPerguntas("Tive dificuldade em respirar em alguns momentos (ex. respiração ofegante, falta de ar, sem ter feito nenhum esforço físico)", " 1- Não se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
		
	}
	public int questao3() {
		PerguntasUtil pergunta3 = new PerguntasUtil();
		return pergunta3.esqueletoPerguntas("Senti tremores (ex. nas mãos)", " 1- Não se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
		
	}
	public int questao4() {
		PerguntasUtil pergunta4 = new PerguntasUtil();
		return pergunta4.esqueletoPerguntas("Preocupei-me com situações em que eu pudesse entrar em pânico e parecesse ridículo(a)", " 1- Não se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
		
	}
	public int questao5() {
		PerguntasUtil pergunta5 = new PerguntasUtil();
		return pergunta5.esqueletoPerguntas("Senti que ia entrar em pânico", " 1- Não se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
		
	}
	public int questao6() {
		PerguntasUtil pergunta6 = new PerguntasUtil();
		return pergunta6.esqueletoPerguntas("Sabia que meu coração estava alterado mesmo não tendo feito nenhum esforço físico (ex. aumento da frequência cardíaca, disritmia cardíaca)", " 1- Não se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
		
	}
	public int questao7() {
		PerguntasUtil pergunta7 = new PerguntasUtil();
		return pergunta7.esqueletoPerguntas("Senti medo sem motivo", " 1- Não se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
		
	}

}




























