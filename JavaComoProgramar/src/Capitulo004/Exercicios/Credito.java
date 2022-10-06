package Capitulo004.Exercicios;

import java.util.Scanner;

public class Credito {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual eh o numero da sua conta? ");
		int conta = input.nextInt();
		
		System.out.println("Qual era o saldo no inicio do mes? ");
		int saldo1 = input.nextInt();
		
		System.out.println("Quanto gastou com os itens no mes? ");
		int gastos = input.nextInt();
		
		System.out.println("Quanto ganhou de credito? ");
		int credito = input.nextInt();
		
		System.out.println("Qual eh o seu credito total? ");
		int creditoT = input.nextInt();
		
		int novoSaldo = saldo1 - gastos + credito;
		
		System.out.println();
		System.out.println("Operacao para o cliente de conta " + conta + ".");
		if (novoSaldo < creditoT ) {
			System.out.println("Limite de credito excedido!");
		} else {
			System.out.println("Voce ainda possui " + novoSaldo + " em sua conta.");
		}

	}

}
