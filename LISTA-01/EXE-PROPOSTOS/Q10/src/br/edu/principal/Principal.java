package br.edu.principal;

import java.util.Scanner;
		
public class Principal {
	
	public static void main(String[] args) {

        double lado;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o lado do quadrado: ");
        lado = sc.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é, " + area);
    }
}
