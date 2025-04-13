package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {

        double salario, vendas;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu salário fixo: ");
        salario = sc.nextDouble();

        System.out.print("Digite o valor das vendas: ");
        vendas = sc.nextDouble();

        	double comissao = vendas * 4/100;
        double salarioFinal = salario + comissao;

        System.out.println("Comissão, R$ " + comissao);
        System.out.println("Salário final é, R$ " + salarioFinal);
    }
}
