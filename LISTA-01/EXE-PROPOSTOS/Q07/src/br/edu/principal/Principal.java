package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
  public static void main(String[] args) {
	  
	  	double peso;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        peso = sc.nextDouble();

        double pesoEngordar = peso + (peso * 15/100);
        double pesoEmagrecer = peso - (peso * 20/100);

        System.out.println("Seu peso será " + pesoEngordar + " se você engordar 15%");
        System.out.println("Seu peso será " + pesoEmagrecer + " se você emagrecer 20%");
		
		}
}
