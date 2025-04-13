package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: ");
        double salario = scanner.nextDouble();

        double imposto = salario * 0.10;

        double salReceber = salario + 50 - imposto;

        System.out.printf("Salário a receber:" + salReceber);

    }
}