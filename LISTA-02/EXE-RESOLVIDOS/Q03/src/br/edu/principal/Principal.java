package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
        double num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        }

        if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        }

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        }

    }
}
