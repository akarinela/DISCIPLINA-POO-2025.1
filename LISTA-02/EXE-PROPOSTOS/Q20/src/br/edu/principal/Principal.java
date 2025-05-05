package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaPares = 0;
        int somaPrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                somaPares += num;
            }

            if (ehPrimo(num)) {
                somaPrimos += num;
            }
        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números primos: " + somaPrimos);

        sc.close();
    }

    public static boolean ehPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
