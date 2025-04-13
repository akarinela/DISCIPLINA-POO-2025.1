package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito: ");
        double deposito = scanner.nextDouble();

        System.out.print("Digite a taxa de juros: ");
        double taxa = scanner.nextDouble();

        double rendimento = deposito * taxa / 100;
        double total = deposito + rendimento;

        System.out.printf("Rendimento:" + rendimento);
        System.out.printf("Total após rendimento:" + total);

    }
}