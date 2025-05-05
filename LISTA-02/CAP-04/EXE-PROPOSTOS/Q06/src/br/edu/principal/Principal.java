package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, result1, result2;
        int op;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.println("Escolha uma das opções:");
        System.out.println("1 - O primeiro número elevado ao segundo número.");
        System.out.println("2 - Raiz quadrada de cada um dos números.");
        System.out.println("3 - Raiz cúbica de cada um dos números.");
        System.out.print("Digite a opção (1, 2 ou 3): ");
        op = sc.nextInt();

        if (op == 1) {
            result1 = 1;
            if (n2 < 0 || n2 != (int) n2) {
                System.out.println("Erro: Este programa só suporta expoentes inteiros e positivos.");
            } else {
                for (int i = 0; i < n2; i++) {
                    result1 *= n1;
                }
                System.out.println(n1 + " elevado a " + n2 + " = " + result1);
            }

        } else if (op == 2) {
            if (n1 < 0 || n2 < 0) {
                System.out.println("Erro: Não é possível calcular raiz quadrada de número negativo.");
            } else {
                result1 = n1 / 2;
                result2 = n2 / 2;

                for (int i = 0; i < 10; i++) {
                    result1 = (result1 + n1 / result1) / 2;
                    result2 = (result2 + n2 / result2) / 2;
                }

                System.out.println("Raiz quadrada de " + n1 + " = " + result1);
                System.out.println("Raiz quadrada de " + n2 + " = " + result2);
            }

        } else if (op == 3) {
            result1 = n1 / 3;
            result2 = n2 / 3;

            for (int i = 0; i < 10; i++) {
                result1 = (2 * result1 + n1 / (result1 * result1)) / 3;
                result2 = (2 * result2 + n2 / (result2 * result2)) / 3;
            }

            System.out.println("Raiz cúbica de " + n1 + " = " + result1);
            System.out.println("Raiz cúbica de " + n2 + " = " + result2);

        } else {
            System.out.println("Opção inválida!");
        }
    }
}