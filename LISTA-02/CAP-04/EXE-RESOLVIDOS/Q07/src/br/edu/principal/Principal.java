package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int I;
        double A, B, C;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor para A: ");
        A = input.nextDouble();

        System.out.print("Digite um valor para B: ");
        B = input.nextDouble();

        System.out.print("Digite um valor para C: ");
        C = input.nextDouble();

        System.out.print("Digite um valor para I : ");
        I = input.nextInt();

        if (I == 1) {
            if (A < B) {
                if (A < C) {
                    if (B < C) {
                        System.out.println("A ordem crescente dos números é: " + A + " - " + B + " - " + C);
                    } else {
                        System.out.println("A ordem crescente dos números é: " + A + " - " + C + " - " + B);
                    }
                } else {
                    System.out.println("A ordem crescente dos números é: " + C + " - " + A + " - " + B);
                }
            } else {
                if (B < C) {
                    if (A < C) {
                        System.out.println("A ordem crescente dos números é: " + B + " - " + A + " - " + C);
                    } else {
                        System.out.println("A ordem crescente dos números é: " + B + " - " + C + " - " + A);
                    }
                } else {
                    System.out.println("A ordem crescente dos números é: " + C + " - " + B + " - " + A);
                }
            }
        } else if (I == 2) {
            if (A > B) {
                if (A > C) {
                    if (B > C) {
                        System.out.println("A ordem decrescente dos números é: " + A + " - " + B + " - " + C);
                    } else {
                        System.out.println("A ordem decrescente dos números é: " + A + " - " + C + " - " + B);
                    }
                } else {
                    System.out.println("A ordem decrescente dos números é: " + C + " - " + A + " - " + B);
                }
            } else {
                if (B > C) {
                    if (A > C) {
                        System.out.println("A ordem decrescente dos números é: " + B + " - " + A + " - " + C);
                    } else {
                        System.out.println("A ordem decrescente dos números é: " + B + " - " + C + " - " + A);
                    }
                } else {
                    System.out.println("A ordem decrescente dos números é: " + C + " - " + B + " - " + A);
                }
            }
        } else if (I == 3) {
            if (A > B) {
                if (A > C) {
                    System.out.println("A ordem desejada é: " + B + " - " + A + " - " + C);
                } else {
                    System.out.println("A ordem desejada é: " + B + " - " + C + " - " + A);
                }
            } else {
                if (B > C) {
                    System.out.println("A ordem desejada é: " + A + " - " + B + " - " + C);
                } else {
                    System.out.println("A ordem desejada é: " + A + " - " + C + " - " + B);
                }
            }
        } else {
            System.out.println("Valor de I inválido. Deve ser 1, 2 ou 3.");
        }

    }
}