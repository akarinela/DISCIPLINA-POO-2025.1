package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base: ");
        double salario = scanner.nextDouble();
      
        double gratificacao = salario * 0.05;
        double imposto = salario * 0.07;

        double salReceber = salario + gratificacao - imposto;

        System.out.printf("Salário a receber:" + salReceber);

    }
}