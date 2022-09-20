package Capitulo004;

import java.util.Scanner;

// Figura 4.10: ClassAverage.java
// Resolvendo o problema da média da classe usando a repetição controlada por sentinela

public class ClassAverage {

	public static void main(String[] args) {
		
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 0;
		
		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();
		
		while(grade != -1) {
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		}
		
		if (gradeCounter != 0) {
			double average = (double) total / gradeCounter;
			
			System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
		} else {
			System.out.println("No grades were entered");
		}

	}

}
