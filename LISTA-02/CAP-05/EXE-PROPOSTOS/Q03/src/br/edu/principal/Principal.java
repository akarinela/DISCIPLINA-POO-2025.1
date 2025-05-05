package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            if (idade <= 15) {
                faixa1++;
            } else if (idade <= 30) {
                faixa2++;
            } else if (idade <= 45) {
                faixa3++;
            } else if (idade <= 60) {
                faixa4++;
            } else {
                faixa5++;
            }
        }

        System.out.println("Quantidade por faixa etária:");
        System.out.println("1ª faixa (até 15): " + faixa1);
        System.out.println("2ª faixa (16 a 30): " + faixa2);
        System.out.println("3ª faixa (31 a 45): " + faixa3);
        System.out.println("4ª faixa (46 a 60): " + faixa4);
        System.out.println("5ª faixa (acima de 60): " + faixa5);

        double total = 8.0;
        double percFaixa1 = (faixa1 / total) * 100;
        double percFaixa5 = (faixa5 / total) * 100;

        System.out.println("Porcentagem na 1ª faixa: " + percFaixa1 + "%");
        System.out.println("Porcentagem na 5ª faixa: " + percFaixa5 + "%");

    }
}