package br.edu.principal;
import java.util.Scanner;


public class Principal {
  
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numeros = new int[9];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número na posição [" + i + "]: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros primos e suas posições:");
        for (int i = 0; i < numeros.length; i++) {
            if (ehPrimo(numeros[i])) {
                System.out.println("Posição [" + i + "] = " + numeros[i]);
            }
        }

        sc.close();
    }
}