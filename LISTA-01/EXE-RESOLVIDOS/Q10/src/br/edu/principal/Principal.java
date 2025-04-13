package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = 3.14 * raio * raio;

        System.out.printf("A área do círculo é: ", + area);

    }
}