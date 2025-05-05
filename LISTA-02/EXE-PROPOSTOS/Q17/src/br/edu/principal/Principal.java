package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contMais50 = 0;
        int contAltura10a20 = 0;
        double somaAlturas = 0;
        int contPesoMenor40 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura (em metros): ");
            double altura = sc.nextDouble();

            System.out.print("Peso (em kg): ");
            double peso = sc.nextDouble();

            if (idade > 50) {
                contMais50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                contAltura10a20++;
            }

            if (peso < 40) {
                contPesoMenor40++;
            }

            System.out.println();
        }

        double mediaAlturas = 0;
        if (contAltura10a20 > 0) {
            mediaAlturas = somaAlturas / contAltura10a20;
        }

        double porcentagemPesoMenor40 = (contPesoMenor40 / 5.0) * 100;

        System.out.println("Quantidade de pessoas com mais de 50 anos: " + contMais50);
        System.out.println("Média das alturas (entre 10 e 20 anos): " + mediaAlturas);
        System.out.println("Porcentagem com peso inferior a 40kg: " + porcentagemPesoMenor40 + "%");

    }
}