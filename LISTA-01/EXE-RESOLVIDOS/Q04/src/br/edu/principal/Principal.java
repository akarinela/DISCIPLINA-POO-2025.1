package br.edu.principal;

import java.util.Scanner;

	public class Principal {
		public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);

		        int sal, novosal;

		       System.out.print("Digite o salário: ");
		        sal = scanner.nextInt();
		        
		      novosal = sal + sal * 25/100;
		
		        System.out.println("O seu novo salário é: " + novosal);

		    }
		}