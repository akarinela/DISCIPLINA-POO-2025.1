package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
		public static void main(String[] args) {

        double peso;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu peso (kg): ");
        peso = sc.nextDouble();

        double gramas = peso * 1000;

        System.out.println("Seu peso em gramas é, " + gramas);
    }
}
