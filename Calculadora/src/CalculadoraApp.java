import java.util.Scanner;

public class CalculadoraApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double valorUm;
		Double valorDois;
		String operacao;
		
		System.out.println("Digite o valor um: ");
		valorUm = sc.nextDouble();
		
		System.out.println("Digite a operação( +, -, *, /: ");
		operacao = sc.next();
		
		System.out.println("Digite o valor dois: ");
		valorDois = sc.nextDouble();
	
	System.out.println("Resultado: " + respostaCalculo(valorUm, valorDois, operacao));

		sc.close();
	}
	public static Double respostaCalculo(Double valorUm, Double valorDois, String operacao){
		
		Double respostaCalculo = 0.0;
		
		switch (operacao) {
		case "+":
		respostaCalculo = valorUm + valorDois;
		break;
		
		case "-":
			respostaCalculo = valorUm - valorDois;
			break;
			
		case "*":
			respostaCalculo = valorUm * valorDois;
			break;
			
		case "/":
			respostaCalculo = valorUm / valorDois;
			break;
		
			
			default: System.out.println("Operação é inválida");
		}
		return respostaCalculo;
			}

		}

