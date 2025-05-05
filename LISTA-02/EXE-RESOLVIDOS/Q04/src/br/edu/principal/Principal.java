package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double num1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        num3 = input.nextDouble();

        if (num1 < num2) {
            if (num2 < num3) {
                System.out.println("Ordem crescente: " + num1 + " - " + num2 + " - " + num3);
            } else if (num1 < num3) {
                System.out.println("Ordem crescente: " + num1 + " - " + num3 + " - " + num2);
            } else {
                System.out.println("Ordem crescente: " + num3 + " - " + num1 + " - " + num2);
            }
        } else {
            if (num1 < num3) {
                System.out.println("Ordem crescente: " + num2 + " - " + num1 + " - " + num3);
            } else if (num2 < num3) {
                System.out.println("Ordem crescente: " + num2 + " - " + num3 + " - " + num1);
            } else {
                System.out.println("Ordem crescente: " + num3 + " - " + num2 + " - " + num1);
            }
        }

    }
}
