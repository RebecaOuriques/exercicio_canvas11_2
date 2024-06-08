package main;

import java.util.Scanner;

public class ExercicioVetores1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero, posicao = -1;

		System.out.print("Informe um numero: ");
		numero = sc.nextInt();
				
		for (int indice = 0; indice < numeros.length; indice++) {
			if (numero == numeros[indice]) {
				posicao = indice;
				System.out.println("O numero " + numero + " esta na posicao: " + posicao);
				break;
			} 	
		}
		
		if(posicao <= -1) {
			System.out.println("O numero " + numero + " nao foi encontrado!");
		}
			
		sc.close();
	}

}
