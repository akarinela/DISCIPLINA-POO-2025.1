package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double n1,n2,sub;
		
		System.out.println("Digite um número: ");
		 n1 = sc.nextDouble();
		 
		 System.out.println("Digite outro número: ");
		 n2 = sc.nextDouble();
		 
		 sub = n1 - n2;
		 
		 System.out.println("A subtração do primeiro numero pelo segundo é: " + sub);
		
	}
}