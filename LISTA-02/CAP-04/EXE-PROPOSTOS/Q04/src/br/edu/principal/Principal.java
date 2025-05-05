package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double n1, n2, n3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        n3 = sc.nextDouble();

        if (n1 == n2 || n2 == n3) {
            System.out.println("Todos os números são iguais: " + n1);
        } else if (n1 >= n2 || n1 >= n3) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 >= n1 || n2 >= n3) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("O maior número é: " + n3);
        }
    }
}