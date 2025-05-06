package br.edu.principal;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal{
    public static void main(String[] args) {
        final int TAM = 10;
        int[] X = new int[TAM];
        int[] Y = new int[TAM];
        ArrayList<Integer> uniao = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

       
        System.out.println("Digite os 10 elementos do vetor X:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("X[" + i + "]: ");
            X[i] = sc.nextInt();
            if (!uniao.contains(X[i])) {
                uniao.add(X[i]);
            }
        }

        System.out.println("Digite os 10 elementos do vetor Y:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Y[" + i + "]: ");
            Y[i] = sc.nextInt();
            if (!uniao.contains(Y[i])) {
                uniao.add(Y[i]);
            }
        }

        System.out.println("Vetor União (sem repetições):");
        for (int num : uniao) {
            System.out.print(num + " ");
        }

    }
}