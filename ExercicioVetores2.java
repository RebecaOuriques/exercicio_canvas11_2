package main;

import java.util.Scanner;

public class ExercicioVetores2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double media = 0, soma = 0;
		int numeros[] = new int[10]; 
		int vetorPares[] = new int[10]; int vetorImpares[] = new int[10];

		System.out.println("Informe uma sequencia de 10 numeros: \n");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º: ");
			numeros[i] = sc.nextInt();

			if (numeros[i] % 2 == 0) {
				vetorPares[i] = numeros[i];
			}  if (i % 2 !=0) {
				vetorImpares[i] = numeros[i];
			}
			soma += numeros[i];
			media = soma / 10;
		}
		System.out.println("\nElementos nos índices ímpares:");
		for (int i = 0; i < 10; i++) {
			if (vetorImpares[i] != 0) {
				System.out.print(vetorImpares[i] + " | ");
			}
		}
		System.out.println("\n\nElementos pares:");
		for (int i = 0; i < 10; i++) {
			if (vetorPares[i] != 0) {
				System.out.print(vetorPares[i] + " | ");
			}
		}
		System.out.printf("\nSoma: %.0f", soma);
		System.out.printf("\nMédia: %.2f", media);
		sc.close();
	}

}
