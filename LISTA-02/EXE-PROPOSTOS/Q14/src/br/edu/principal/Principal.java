package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " × " + i + " = " + resultado);
        }

    }
}