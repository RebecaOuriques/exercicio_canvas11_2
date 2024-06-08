package main;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double soma = 0;
		double vetorNotas[][] = new double[10][4];
		double vetorMedia[] = new double[10];
		String vetorNomes[] = new String[10];
		System.out.print("Informe o nome e as notas de 10 alunes de acordo com os 4 bimestres.\n");

		for (int l = 0; l < vetorNotas.length; l++) {
			System.out.printf("\nInforme o nome da %dº pessoa estudante: ", (l + 1));
			vetorNomes[l] = sc.next();
			System.out.println("Informe as notas de " + vetorNomes[l] + ": ");
			for (int c = 0; c < 4; c++) {
				vetorNotas[l][c] = sc.nextDouble();
			}
		}

		for (int l = 0; l < vetorNotas.length; l++) {
			for (int c = 0; c < 4; c++) {
				soma += vetorNotas[l][c];
			}
			vetorMedia[l] = (soma) / 4;
			soma = 0;
		}
		System.out.println("\nSeguem as médias dos estudantes: \n");
		for (int l = 0; l < vetorMedia.length; l++) {
			System.out.print(vetorNomes[l]);
			System.out.printf(": %.1f \n", vetorMedia[l]);
		}

		sc.close();
	}
}
