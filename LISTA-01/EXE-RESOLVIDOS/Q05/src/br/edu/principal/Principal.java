package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        Double preco, novo_preco, desconto;
		
		System.out.println("Digite o preço do produto: ");
		 preco = sc.nextDouble();
		 
		 desconto = preco * 10/100;
		 System.out.println("Seu desconto será: " + desconto);
		 
		 novo_preco = preco - desconto;
		 
		 System.out.println("O novo preço será: " + novo_preco);
		
	}
}