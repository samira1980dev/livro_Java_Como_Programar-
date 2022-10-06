package Capitulo004.Exercicios;

import java.util.Scanner;

public class Quilometragem {

	public static void main(String[] args) {

		int contador = 1;
		int km = 0;
		int lit = 0;

		while (contador <= 10) {
			Scanner input = new Scanner(System.in);

			System.out.print("Insira os km dirigidos: ");
			km = input.nextInt();

			System.out.print("Quantos litros gastou? ");
			lit = input.nextInt();
			
			Double calc = (double) km/lit;
			System.out.println(calc);
			
			input.close();
			
			contador++;

		}

	}

}
