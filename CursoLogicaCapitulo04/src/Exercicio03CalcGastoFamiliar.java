import java.util.Scanner;

public class Exercicio03CalcGastoFamiliar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		Double total = 0.0;
		
//		System.out.print("Digite o valor da Conta de Luz: ");
//		Double contaLuz = scanner.nextDouble();
//		
//		System.out.print("Digite o valor da Conta de Água: ");
//		Double contaAgua = scanner.nextDouble();
//		
//		System.out.print("Digite o valor da Conta de Telefone: ");
//		Double contaTelefone = scanner.nextDouble();
//		
//		System.out.print("Digite o valor da Escola do Filho: ");
//		Double escolaFilho = scanner.nextDouble();
//		
//		System.out.print("Digite o valor da Fatura do Cartão: ");
//		Double faturaCartao = scanner.nextDouble();
//		
//		System.out.print("Digite o valor do gasto com Supermercado: ");
//		Double gastoSMercado = scanner.nextDouble();
//		
//		Double gastoFamiliarMensal = contaLuz += contaAgua += contaTelefone += escolaFilho += faturaCartao += gastoSMercado ; 
//		
//		System.out.println("Gasto familiar mensal é de: R$ " + gastoFamiliarMensal);
		
		
		System.out.print("Digite o valor da Conta de Luz: ");
		total += scanner.nextDouble();
		
		System.out.print("Digite o valor da Conta de Água: ");
		total += scanner.nextDouble();
		
		System.out.print("Digite o valor da Conta de Telefone: ");
		total += scanner.nextDouble();
		
		System.out.print("Digite o valor da Escola do Filho: ");
		total += scanner.nextDouble();
		
		System.out.print("Digite o valor da Fatura do Cartão: ");
		total += scanner.nextDouble();
		
		System.out.print("Digite o valor do gasto com Supermercado: ");
		total += scanner.nextDouble();
		
		System.out.println("Gasto familiar mensal é de: R$ " + total);
		
		scanner.close();
	}
}
