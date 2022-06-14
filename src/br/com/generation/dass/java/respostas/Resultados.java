package br.com.generation.dass.java.respostas;

public class Resultados {
	
	ContabilizaResultados contabilizaResultas = new ContabilizaResultados();

	public void resultadoAnsiedade(int somaAnsiedade) {
		System.out.println(" ==================================================================== ");
		System.out.println(" Este é o resultado do teste: \n");
		if (somaAnsiedade >= 1 && somaAnsiedade <= 7) {
			System.out.println(" Dimensão de Ansiedade - Normal\n"
					+ " Sua pontuação sobre a dimensão de ansiedade demonstra que você não está ansioso(a).");
		} else if (somaAnsiedade > 7 && somaAnsiedade <= 14) {
			System.out.println(" Dimensão de Ansiedade - Leve\n"
					+ " Sua pontuação sobre a dimensão ansiosa não está elevada, entretanto, esteja atento à essa dimensão, fale com seu médico a respeito.");
		} else if (somaAnsiedade > 14 && somaAnsiedade <= 21) {
			System.out.println(" Dimensão de Ansiedade - Grave\n"
					+ " Sua pontuação na escala de ansiedade está elevada. É importante falar com o seu médico a fim de traçar uma conduta.");
		} else {
			System.out.println(" Dimensão de Ansiedade - Severa\n"
					+ " Sua pontuação na escala de ansiedade está elevada. É importante falar com o seu médico a fim de traçar uma conduta.");
		}
		System.out.println("");
	}

	
	
	public void resultadoEstresse(int somaEstresse) {
		if (somaEstresse >= 1 && somaEstresse <= 9) {
			System.out.println(" Dimensão de Estresse - Normal\n"
					+ "	Seu nível de estresse está baixo. Face aos fatores estressantes do cotidiano, você se adapta bem.");
		} else if (somaEstresse > 9 && somaEstresse <= 19) {
			System.out.println(" Dimensão de Estresse - Leve\n"
					+ " Seu nível de estresse está ligeiramente elevado. Entretanto, você não se encontra em níveis que colocam em risco sua saúde.");
		} else {
			System.out.println(" Dimensão de Estresse - Grave\n"
					+ " Os resultados demonstram um nível elevado de estresse. Você deve estar se sentindo exaurido pelos fatores estressantes do cotidiano. A tensão emocional produzida pelo acúmulo de fatores estressantes, o colocam sob risco de apresentar sintomas em um ou vários campos: relacional, intelectual, físico ou psíquico.");
		}
		System.out.println("");
	}
	
	
	
	public void resultadoDepressao(int somaDepressao) {
		if (somaDepressao >= 1 && somaDepressao <= 7) {
			System.out.println(" Dimensão de Depressão - Nível Normal\n"
					+ "	Sua pontuação sobre a dimensão de depressão demonstra que você não está depressivo(a).");
		} else if (somaDepressao > 7 && somaDepressao <= 14) {
			System.out.println(" Dimensão de Depressão - Moderado\n"
					+ " Sua pontuação na escala de depressão está elevada. É importante falar com o seu médico a fim de traçar uma conduta.");
		} else if (somaDepressao > 14 && somaDepressao <= 21) {
			System.out.println(" Dimensão de Depressão - Grave\n"
					+ " Sua pontuação na escala de depressão está elevada. É importante falar com o seu médico a fim de traçar uma conduta.");
		} else {
			System.out.println(" Dimensão de Depressão - Severa\n"
					+ " Sua pontuação na escala de depressão está elevada. É importante falar com o seu médico a fim de traçar uma conduta.");
		}
		System.out.println("");
	}
}
