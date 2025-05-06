package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        final int TAM = 10;
        int[] vetor1 = new int[TAM];
        int[] vetor2 = new int[TAM];
        int[] intercalado = new int[TAM * 2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("vetor1[" + i + "]: ");
            vetor1[i] = sc.nextInt();
        }

     
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("vetor2[" + i + "]: ");
            vetor2[i] = sc.nextInt();
        }

        for (int i = 0, j = 0; i < TAM; i++) {
            intercalado[j++] = vetor1[i];
            intercalado[j++] = vetor2[i];
        }


        System.out.println("\nVetor intercalado:");
        for (int i = 0; i < intercalado.length; i++) {
            System.out.print(intercalado[i] + " ");
        }

    }
}