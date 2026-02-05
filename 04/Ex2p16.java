
/*	2.16
		(Comparando inteiros)
			Escreva um aplicativo que solicite ao usuário inserir dois
			números-inteiros. Obtenha dele estes números e exiba o 
			maior númeroseguido pelas palavras "is larger". Se os números 
			forem iguais, imprima a mensagem "These numbers are equal".
*/

import java.util.Scanner;

public class Ex2p16{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o valor do PRIMEIRO número: ");
		numero1 = sc.nextInt();
		
		System.out.println("Digite o valor do SEGUNDO número: ");
		numero2 = sc.nextInt();
		
		
		if(numero1 == numero2){
			System.out.println("These numbers are equal");
		} else if(numero1 > numero2){
			System.out.printf("%d is larger %n", numero1);
		} else{
			System.out.printf("%d is larger %n", numero2);
		}
		
	}
}