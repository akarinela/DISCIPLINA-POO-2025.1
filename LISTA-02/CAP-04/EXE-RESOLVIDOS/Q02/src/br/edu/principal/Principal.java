package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media, notaExame;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota:");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média aritmética: " + media);

        if (media >= 0) {
            if (media < 3) {
                System.out.println("Reprovado");
            }
        }

        if (media >= 3) {
            if (media < 7) {
                System.out.println("Exame");
                notaExame = 12 - media;
                System.out.println("Deve tirar nota " + notaExame + " para ser aprovado.");
            }
        }

        if (media >= 7) {
            if (media <= 10) {
                System.out.println("Aprovado");
            }
        }

    }
}