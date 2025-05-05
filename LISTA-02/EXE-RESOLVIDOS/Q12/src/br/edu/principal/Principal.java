
package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double n, e, i, j, fat;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        n = sc.nextInt();
        e = 1;

        for(i = 1; i <= n; i++) {
            fat = 1;
            for (j = 1; j <= i; j++) {
                fat = fat * j;
            }
            e = e + 1 / fat;
        }
        System.out.print("O valor de E: , " + e);
    }
}
