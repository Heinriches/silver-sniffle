
//	2.15
//		(Aritmética)
//			Escreva um aplicativo que solicite ao usuário inserir
//			dois números-inteiros, obtenha de leia estes números e imprima o valor
//			de sua soma, produto, diferença, e quociente.

import java.util.Scanner;


public class Ex2p15{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2, soma, produto, diferenca, quociente;
		
		System.out.println("Digite o valor do PRIMEIRO número: ");
		numero1 = sc.nextInt();
		
		System.out.println("Digite o valor do SEGUNDO número: ");
		numero2 = sc.nextInt();
		
		soma = (numero1 + numero2);
		produto = (numero1 * numero2);
		diferenca = (numero1 - numero2);
		quociente = (numero1 / numero2);
		
		System.out.printf("SOMA = %d %n", soma);
		System.out.printf("PRODUTO = %d %n", produto);
		System.out.printf("DIFERENÇA = %d %n", diferenca);
		System.out.printf("QUOCIENTE = %d %n", quociente);
				
	}
}