package br.edu.principal;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        final int TAM = 10;
        Integer[] numeros = new Integer[TAM];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o número [" + i + "]: ");
            numeros[i] = sc.nextInt();
        }

     
        System.out.println("Vetor original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("Vetor em ordem decrescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

    }
}