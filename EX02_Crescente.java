package br.com.generation.condicionais;
import java.util.Scanner;


public class EX02_Crescente {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int n1, n2, n3;
		int maiorNum = 0;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		n3 = entrada.nextInt();

		if (n1 > maiorNum) {
			maiorNum = n1;		
		}
		if (n2 > maiorNum) {
			maiorNum = n2;	
		}
		if (n3 > maiorNum) {
			maiorNum = n3;	
		}
				
		System.out.println("O maior numero digitado é: " + maiorNum);
		
	}

}
