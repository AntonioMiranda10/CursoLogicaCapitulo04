import java.util.Scanner;

public class Exercicio04Aposentadoria {
	
	static final Integer IDADE_MINIMA_PARA_SE_APOSENTAR = 55;
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite a idade do contribuinte: ");
		Integer idadeDoContribuinte = scanner.nextInt();
		
		System.out.print("Digite tempo de contribuição: ");
		Integer tempoDeContribuicao = scanner.nextInt();
		
		
		Boolean temIdadeParaSeAposentar = idadeDoContribuinte >= IDADE_MINIMA_PARA_SE_APOSENTAR;
		Boolean temTempoDeContribuicaoSuficiente = tempoDeContribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;
			
		
		Boolean podeSeAposentar = temIdadeParaSeAposentar && temTempoDeContribuicaoSuficiente;
		
		if (podeSeAposentar) {
			System.out.println("O contribuinte pode se aposentar.");
	} else {
		System.out.println("Contribuinte precisa esperar mais um pouco para se aposentar.");
	}

		scanner.close();
}
}