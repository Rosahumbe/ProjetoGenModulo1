package br.com.generation.dass.java.perguntas;

import java.util.Scanner;

public class PerguntasEstresse {
	
	Scanner leia = new Scanner(System.in);
	

	public int questao15() {
		PerguntasUtil pergunta15 = new PerguntasUtil();
		return pergunta15.esqueletoPerguntas("Achei difícil me acalmar ", " 1- Não se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
	}
	
	public int questao16() {
	PerguntasUtil pergunta16 = new PerguntasUtil();
	return pergunta16.esqueletoPerguntas("Tive a tend�ncia de reagir de forma exagerada �s situações ", " 1- Não se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau consider�vel, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
	}

	public int questao17 () {
	PerguntasUtil pergunta17 = new PerguntasUtil();
	return pergunta17.esqueletoPerguntas("Senti que estava sempre nervoso ", " 1- Não se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
	}
	
	public int questao18() {
	PerguntasUtil pergunta18 = new PerguntasUtil();
	return pergunta18.esqueletoPerguntas("Senti-me agitado ", " 1- N�o se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
	}
	
	public int questao19() {
		PerguntasUtil pergunta19 = new PerguntasUtil();
		return pergunta19.esqueletoPerguntas("Achei difícil relaxar ", " 1- N�o se aplicou de maneira alguma \n "
					+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
					+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
	}
	
	public int questao20() {
		PerguntasUtil pergunta20 = new PerguntasUtil();
		return pergunta20.esqueletoPerguntas("Fui intolerante com as coisas que me impediam de continuar o que eu estava fazendo ", " 1- Não se aplicou de maneira alguma \n "
					+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
					+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
	}
	
	public int questao21() {
		PerguntasUtil pergunta21 = new PerguntasUtil();
		return pergunta21.esqueletoPerguntas("Senti que estava um pouco emotivo/sensível demais ", " 1- Não se aplicou de maneira alguma \n "
					+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
					+ "3- Aplicou-se em um grau considerável, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
	}
}
