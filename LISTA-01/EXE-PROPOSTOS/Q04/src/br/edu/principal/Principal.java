package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
        Double nota1,nota2,media;
		
		System.out.println("Digite sua nota 1: ");
		 nota1 = sc.nextDouble();
		 
		 System.out.println("Digite sua nota 2: ");
		 nota2 = sc.nextDouble();
		 
		 media = ((nota1 * 2) + (nota2 * 3)) / 5;
		 
		 System.out.println("A divisão do primeiro numero pelo segundo é: " + media);
		
	}
}
