package br.com.generation.funcoessystemout;

public class FuncaoSystemOut {
	
	public static void main(String[] args) {
		
		//Scanner sc =new Scanner (System.in);
		
		System.out.println ("Insere uma linha, deixando o marcador"
				+ "posicionado na linha de baixo");
		
		System.out.print("Mantem o curso na mesma linha");
		
		System.out.print("\nJosé");
		System.out.print("Da Silva");
		
		double num1 = 10, num2 = 20;
		System.out.printf("\nSoma das variaveis num1 e num2: %.2f" ,(num1 + num2));  // " %f exibe float  ** "2f" exibe 2 casas decimais 
		
		int num3 = 10, num4 = 20;
		System.out.printf("\n Soma das variaveis num1 e num2: %2d %n " , (num3 + num4) );
		
		System.out.printf("\n n%s %s\n" , "Maarcela" , "Nogueira");
		
		/*
		 * %d --> inteiros
		 * %f --> floats
		 * %2f --> doubles
		 * %b --> boolean
		 * %c --> character 
		 * %s --> String (cadeia de Character)
		 */
	}

}
