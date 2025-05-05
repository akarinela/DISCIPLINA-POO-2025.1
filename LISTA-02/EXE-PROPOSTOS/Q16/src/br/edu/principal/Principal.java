package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalVista = 0;
        double totalPrazo = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Transação " + i + " - Código (V para à vista, P para a prazo): ");
            char codigo = sc.next().toUpperCase().charAt(0);

            while (codigo != 'V' && codigo != 'P') {
                System.out.print("Código inválido. Digite V ou P: ");
                codigo = sc.next().toUpperCase().charAt(0);
            }

            System.out.print("Valor da transação: ");
            double valor = sc.nextDouble();

            if (codigo == 'V') {
                totalVista += valor;
            } else {
                totalPrazo += valor;
            }
        }

        double totalGeral = totalVista + totalPrazo;
        double primeiraPrestacaoPrazo = totalPrazo / 3;

        System.out.println("\nValor total das compras à vista: " + totalVista);
        System.out.println("Valor total das compras a prazo: " + totalPrazo);
        System.out.println("Valor total das compras: " + totalGeral);
        System.out.println("Valor da 1ª prestação das compras a prazo: " + primeiraPrestacaoPrazo);

    }
}
