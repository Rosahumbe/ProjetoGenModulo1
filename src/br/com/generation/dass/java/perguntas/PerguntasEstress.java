package br.com.generation.dass.java.perguntas;

import java.util.Scanner;

public class PerguntasEstress {
	
	Scanner leia = new Scanner(System.in);

	public int questao1() {
		PerguntasUtil pergunta1 = new PerguntasUtil();
		return pergunta1.esqueletoPerguntas("Achei difícil me acalmar ", " 1- Não se aplicou de maneira alguma \n "
				+ "2- Aplicou-se em algum grau, ou por pouco de tempo \n "
				+ "3- Aplicou-se em um grau considerÃ¡vel, ou por uma boa parte do tempo \n 4- Aplicou-se muito, ou na maioria do tempo");
	
	}

}
