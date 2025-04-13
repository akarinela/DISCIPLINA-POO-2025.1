package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        double desconto = preco * 0.10;

        double novoPreco = preco - desconto;

        System.out.printf("Novo preço do produto com desconto de 10%%:" + novoPreco);

    }
}
