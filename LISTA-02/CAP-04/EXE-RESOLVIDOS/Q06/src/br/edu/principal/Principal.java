package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
        int num, verificar;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = input.nextInt();

        verificar = num % 2;

        if (verificar == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

    }
}