package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {
        int contTime, contJog, idade;
        double peso, altura, qtde, mediaIdade, mediaAltura, porc, tot80;

        qtde = 0;
        tot80 = 0;
        mediaAltura = 0;

        Scanner sc = new Scanner(System.in);

        for (contTime = 1; contTime <= 5; contTime++) {
            mediaIdade = 0;
            for (contJog = 1; contJog <= 11; contJog++) {
                System.out.println(" Time " + contTime + " - Jogador " + contJog);
                System.out.print("Digite a idade: ");
                idade = sc.nextInt();
                System.out.print("Digite o peso: ");
                peso = sc.nextDouble();
                System.out.print("Digite a altura: ");
                altura = sc.nextDouble();

                if (idade < 18) {
                    qtde++;
                    mediaAltura = mediaAltura + altura;
                }

                mediaIdade = mediaIdade + idade;

                if (peso > 80) {
                    tot80++;
                }
            }
            mediaIdade = mediaIdade / 11;
            System.out.println("Média de idade do time " + contTime + ": " + mediaIdade);
        }

        System.out.println("Quantidade de jogadores com menos de 18 anos: " + qtde);

        if (qtde > 0) {
            mediaAltura = mediaAltura / qtde;
        } else {
            mediaAltura = 0;
        }
        System.out.println("Média da altura dos jogadores com menos de 18 anos: " + mediaAltura);
        porc = tot80 * 100 / 55;
        System.out.println("Porcentagem de jogadores com mais de 80kg: " + porc + "%");
    }
}