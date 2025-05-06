package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Digite um número: ");
            n = sc.nextInt();
        } while(n >= 1 && n <= 9);

        multiplicacao(n);
    } public static void multiplicacao(int n) {
        int i , j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}