package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double n1, n2;
        int s;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        s = somar(n1, n2);
        System.out.print("Soma = " + s);

    } public static int somar(double n1, double n2) {
        int i, s = 0;
        for (i = (int)(n1 + 1); i <= n2 - 1; i++) {
            s = s + i;
        } return  s;
    }
}