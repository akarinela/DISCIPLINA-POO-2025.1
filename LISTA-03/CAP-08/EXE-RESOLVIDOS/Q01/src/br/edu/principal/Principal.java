package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double n;
        int x;

 	Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = sc.nextDouble();

        x = verifica(n);

        if (x == 0) {
            System.out.println("Número positivo - 1");
        } else {
            System.out.println("Número negativo - 0");
        }
    } public static int verifica(double n) {
        int res;
        if (n >= 0) {
            res = 0;
        } else {
            res = 1;
        } return res;
    }
}