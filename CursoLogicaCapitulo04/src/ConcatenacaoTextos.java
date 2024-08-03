
public class ConcatenacaoTextos {

	public static void main(String[] args) {
		String inicio = "Esse ";
		String meio = "é um exemplo ";
		String fim = "de concatenação de textos.";
		String especial = "º exemplo ";
		Integer numeroExemplo = 1;
		
		System.out.println(inicio + meio + fim);
		
		System.out.println("Esse " + meio + "de concatenação de textos.");
		
		System.out.println("Esse é o " + numeroExemplo + especial + "de concatenação de textos.");
	}

} 
