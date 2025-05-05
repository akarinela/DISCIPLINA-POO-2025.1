package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double cont, cod, numVei, numAcid;
        double maior = 0, cidMaior = 0, menor = 0, cidMenor = 0;
        double mediaVei, somaVei = 0;
        double mediaAcid, somaAcid = 0, contAcid = 0;

        Scanner sc = new Scanner(System.in);

        for (cont = 1; cont <= 5; cont++) {
            System.out.print("Digite o código da cidade: ");
            cod = sc.nextDouble();
            System.out.print("Digite o número de veículos: ");
            numVei = sc.nextDouble();
            System.out.print("Digite o número de acidentes: ");
            numAcid = sc.nextDouble();

            if (cont == 1) {
                maior = numAcid;
                cidMaior = cod;
                menor = numAcid;
                cidMenor = cod;
            } else {
                if (numAcid > maior) {
                    maior = numAcid;
                    cidMaior = cod;
                }
                if (numAcid < menor) {
                    menor = numAcid;
                    cidMenor = cod;
                }
            }

            somaVei = somaVei + numVei;

            if (numVei < 2000) {
                somaAcid = somaAcid + numAcid;
                contAcid = contAcid + 1;
            }

            System.out.println(" ");

        }

        System.out.println("Maior número de acidentes: " + maior + " (Cidade " + cidMaior + ")");
        System.out.println("Menor número de acidentes: " + menor + " (Cidade " + cidMenor + ")");

        mediaVei = somaVei / 5;
        System.out.println("Média de veículos nas 5 cidades: " + mediaVei);

        if (contAcid == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos");
        } else {
            mediaAcid = somaAcid / contAcid;
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + mediaAcid);
        }
    }
}