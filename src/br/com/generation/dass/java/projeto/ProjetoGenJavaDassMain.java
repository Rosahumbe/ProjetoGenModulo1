package br.com.generation.dass.java.projeto;


import br.com.pacote.perguntas.PerguntasAnsiedade;

public class ProjetoGenJavaDassMain {

	public static void main(String[] args) {
		
		
	
		int soma = 0;
		
	Interface telaInicial = new Interface();
	telaInicial.saudacao();
	
	PerguntasAnsiedade perguntasAnsiedade = new PerguntasAnsiedade();
	
	soma += perguntasAnsiedade.questao1();
	
	soma += perguntasAnsiedade.questao2();
	
	System.out.println(soma);
	

		

	}

}
