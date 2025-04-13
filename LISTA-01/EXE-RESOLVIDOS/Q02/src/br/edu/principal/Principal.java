package br.edu.principal;

import java.util.Scanner;

	public class Principal {
		public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);

		       
		        int n1, n2, n3, n4, media;

		       
		        System.out.print("Digite o primeiro número: ");
		        n1 = scanner.nextInt();
		        
		        System.out.print("Digite o segundo número: ");
		        n2 = scanner.nextInt();
		        
		        System.out.print("Digite o terceiro número: ");
		        n3 = scanner.nextInt();
		        
		          
		        media = (n1 + n2 + n3) / 3;
		        
		        System.out.println("A sua media: " + media);

		    }
		}