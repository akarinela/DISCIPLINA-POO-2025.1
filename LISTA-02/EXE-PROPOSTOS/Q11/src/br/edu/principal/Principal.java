package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int grupo = 1; grupo <= 5; grupo++) {
            int[] valores = new int[4];

            System.out.println("Grupo " + grupo + ":");
            for (int i = 0; i < 4; i++) {
                System.out.print("Digite o valor " + (i + 1) + ": ");
                valores[i] = sc.nextInt();
            }

            System.out.print("Ordem lida: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(valores[i] + " ");
            }

            int[] ordenado = new int[4];
            for (int i = 0; i < 4; i++) {
                ordenado[i] = valores[i];
            }

            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    if (ordenado[i] > ordenado[j]) {
                        int temp = ordenado[i];
                        ordenado[i] = ordenado[j];
                        ordenado[j] = temp;
                    }
                }
            }

            System.out.print("Crescente: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(ordenado[i] + " ");
            }

            System.out.print("Decrescente: ");
            for (int i = 3; i >= 0; i--) {
                System.out.print(ordenado[i] + " ");
            }

            System.out.println();
        }

    }
}
