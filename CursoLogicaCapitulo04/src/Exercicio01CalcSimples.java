import java.util.Scanner;

public class Exercicio01CalcSimples {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o número desejado:  ");
		Double numero1 = scanner.nextDouble();
		
		System.out.print("Digite a operação [1 = adição / 2 = subtração / 3 = multiplicação / 4 = divisão:   ");
		Integer operacao = scanner.nextInt();
		
		System.out.print("Digite o segundo número desejado:  ");
		Double numero2 = scanner.nextDouble();
		
		Double resultado = 0.0;
		
				
		if (operacao.equals(1)) {
			resultado = numero1 + numero2;
			
		} 
		
		if (operacao.equals(2)) {
			resultado = numero1 - numero2;
		}
		
		if (operacao.equals(3)) {
			resultado = numero1 * numero2;
		}
		
		if (operacao.equals(4)) {
			resultado = numero1 / numero2;
		}
		
		
		System.out.println("O resultado da sua operação é: " + resultado);
		
		scanner.close();
	}
}

