package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaIdades = 0;
        int contPesoAltura = 0;
        int contMais190 = 0;
        int contIdade10a30Mais190 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();

            System.out.print("Altura (m): ");
            double altura = sc.nextDouble();

            somaIdades += idade;

            if (peso > 90  || altura < 1.5) {
                contPesoAltura++;
            }

            if (altura > 1.9) {
                contMais190++;
                if (idade >= 10 || idade <= 30) {
                    contIdade10a30Mais190++;
                }
            }

            System.out.println();
        }

        double mediaIdades = somaIdades / 10.0;
        double porcentagem = contMais190 > 0 ? (contIdade10a30Mais190 / (double) contMais190) * 100 : 0;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Quantidade com peso > 90kg e altura < 1,5m: " + contPesoAltura);
        System.out.println("Porcentagem com idade entre 10 e 30 anos e altura > 1,9m: " + porcentagem + "%");

    }
}
