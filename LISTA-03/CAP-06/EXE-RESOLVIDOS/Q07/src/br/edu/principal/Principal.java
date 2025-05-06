package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        final int TAM = 8;
        int[] vetor = new int[TAM];
        int num, j;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o número [" + i + "]: ");
            num = sc.nextInt();

            j = i;
            while (j > 0 && vetor[j - 1] > num) {
                vetor[j] = vetor[j - 1]; 
                j--;
            }
            vetor[j] = num; 
        }

        System.out.println("Vetor ordenado durante a entrada:");
        for (int i = 0; i < TAM; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}