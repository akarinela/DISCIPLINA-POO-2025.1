package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contIdadePeso = 0;
        int contAlturaBaixa = 0;
        int somaIdadesBaixa = 0;
        int contOlhosAzuis = 0;
        int contRuivosNaoAzuis = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();

            System.out.print("Altura (m): ");
            double altura = sc.nextDouble();

            System.out.print("Cor dos olhos (A - azul, P - preto, V - verde, C - castanho): ");
            char olhos = sc.next().toUpperCase().charAt(0);

            System.out.print("Cor do cabelo (P - preto, C - castanho, L - louro, R - ruivo): ");
            char cabelo = sc.next().toUpperCase().charAt(0);

            if (idade > 50 && peso < 60) {
                contIdadePeso++;
            }

            if (altura < 1.5) {
                somaIdadesBaixa += idade;
                contAlturaBaixa++;
            }

            if (olhos == 'A') {
                contOlhosAzuis++;
            }

            if (cabelo == 'R' && olhos != 'A') {
                contRuivosNaoAzuis++;
            }

            System.out.println();
        }

        double mediaIdadesBaixa = contAlturaBaixa > 0 ? (double) somaIdadesBaixa / contAlturaBaixa : 0;
        double porcentagemOlhosAzuis = (contOlhosAzuis / 6.0) * 100;

        System.out.println("Quantidade com idade > 50 e peso < 60kg: " + contIdadePeso);
        System.out.println("Média das idades com altura < 1,50m: " + mediaIdadesBaixa);
        System.out.println("Porcentagem com olhos azuis: " + porcentagemOlhosAzuis + "%");
        System.out.println("Quantidade de ruivos sem olhos azuis: " + contRuivosNaoAzuis);

    }
}