package br.edu.principal;

import java.util.Scanner;

	public class Principal {
		public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);

		        int nota1, nota2, nota3, peso1, peso2, peso3, media;

		        System.out.print("Digite a primeira nota: ");
		        nota1 = scanner.nextInt();
		        
		        System.out.print("Digite a segunda nota: ");
		        nota2 = scanner.nextInt();
		        
		        System.out.print("Digite  terceira nota: ");
		        nota3 = scanner.nextInt();
		
		        System.out.print("Digite o primeiro peso: ");
		        peso1 = scanner.nextInt();
		        
		        System.out.print("Digite o segundo peso: ");
		        peso2 = scanner.nextInt();
		        
		        System.out.print("Digite o terceiro peso: ");
		        peso3 = scanner.nextInt();
		
		       media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
		        
		
		        System.out.println("Media ponderada é: " + media);

		    }
		}