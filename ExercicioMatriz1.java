package main;

import java.util.Scanner;

public class ExercicioMatriz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int somaPrincipal = 0,somaSecundaria = 0;
		int numeros[][] = new int[3][3];
		
		System.out.println("Informe 9 numeros para uma Matriz 3x3: \n");
		for (int l = 0; l < numeros.length; l++) {
			for (int c = 0; c < numeros.length; c++) {
			System.out.print("Informe o " + (l+1) + "º numero: ");
			numeros[l][c] = sc.nextInt();
			}
		}
		System.out.println("\nElementos da Diagonal Principal: ");
	
		for (int l = 0; l < numeros.length; l++) {		
				System.out.print(numeros[l][l] + " ");
				somaPrincipal += numeros[l][l];
		}

		System.out.println("\n\nElementos da Diagonal Secundaria: " );
		for (int l = 0; l < numeros.length; l++) {		
			System.out.print(numeros[l][2 - l] + " ");
			somaSecundaria += numeros[l][l];
	}
		
		System.out.println("\n\nSoma dos Elementos da Diagonal Principal: \n" + somaPrincipal);
		System.out.println("\nSoma dos Elementos da Diagonal Principal: \n" + somaSecundaria);

		sc.close();	
	}
}
