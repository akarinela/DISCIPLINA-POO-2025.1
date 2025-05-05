package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int numTermos, i, j, expoente, fim, den = 1;
        double x, fat, pot, s = 0;
        int denominador = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de termos: ");
        numTermos = sc.nextInt();
        System.out.print("Digite o valor de x: ");
        x = sc.nextDouble();

        for (i = 1; i <= numTermos; i++) {
            fim = denominador;
            fat = 1;
            for (j = 1; j <= fim; j++) {
                fat = fat * j;
            }

            expoente = i + 1;

            pot = 1;
            for (j = 1; j <= expoente; j++) {
                pot = pot * x;
            } if (expoente % 2 == 0) {
                s = s - (pot / fat);
            } else {
                s = s + (pot / fat);
            }

            if (denominador == 4) {
                den = -1;
            } if (denominador == 1) {
                den = 1;
            }

            if (den == 1) {
                denominador++;
            } else {
                denominador--;
            }
        }
        System.out.print("O valor da série S é: " + s);
    }
}