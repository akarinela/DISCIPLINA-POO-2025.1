package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        double n1, n2;
        int op;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Média entre os números");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números");
        System.out.println("4 - Divisão do primeiro pelo segundo");

        System.out.print("Digite a opção (1 a 4): ");
        op = sc.nextInt();

        if (op == 1) {
            double media = (n1 + n2) / 2;
            System.out.println("Média: " + media);
        } else if (op == 2) {
            if (n1 > n2) {
                System.out.println("Diferença: " + (n1 - n2));
            } else {
                System.out.println("Diferença: " + (n2 - n1));
            }
        } else if (op == 3) {
            double produto = n1 * n2;
            System.out.println("Produto: " + produto);
        } else if (op == 4) {
            if (n2 != 0) {
                double divisao = n1 / n2;
                System.out.println("Divisão: " + divisao);
            } else {
                System.out.println("Erro: divisão por zero!");
            }
        } else {
            System.out.println("Opção inválida!");
        }
    }
}