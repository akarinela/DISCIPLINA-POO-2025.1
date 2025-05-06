package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        final int TAM = 8;
        int[] numeros = new int[TAM];
        int[] positivos = new int[TAM];
        int[] negativos = new int[TAM];
        int contPos = 0, contNeg = 0;

        Scanner sc = new Scanner(System.in);

 
        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o número [" + i + "]: ");
            numeros[i] = sc.nextInt();

           
            if (numeros[i] >= 0) {
                positivos[contPos++] = numeros[i];
            } else {
                negativos[contNeg++] = numeros[i];
            }
        }

        
        System.out.println("Vetor de números positivos:");
        for (int i = 0; i < contPos; i++) {
            System.out.print(positivos[i] + " ");
        }

        System.out.println("Vetor de números negativos:");
        for (int i = 0; i < contNeg; i++) {
            System.out.print(negativos[i] + " ");
        }

    }
}