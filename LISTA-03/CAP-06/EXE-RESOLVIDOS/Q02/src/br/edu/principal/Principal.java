package br.edu.principal;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        final int TAMANHO = 10;
        final double SALARIO_BASE = 545.00;
        final double COMISSAO = 0.05;

        double[] precos = new double[TAMANHO];
        int[] quantidades = new int[TAMANHO];
        double[] totais = new double[TAMANHO];
        double valorTotalVendas = 0;
        int indiceMaisVendido = 0;

        Scanner sc = new Scanner(System.in);

      
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o preço do objeto [" + i + "]: R$ ");
            precos[i] = sc.nextDouble();
            System.out.print("Digite a quantidade vendida do objeto [" + i + "]: ");
            quantidades[i] = sc.nextInt();

            totais[i] = precos[i] * quantidades[i];
            valorTotalVendas += totais[i];

            if (quantidades[i] > quantidades[indiceMaisVendido]) {
                indiceMaisVendido = i;
            }
        }

               System.out.println("RELATÓRIO DE VENDAS:");
        System.out.println("Objeto | Quantidade | Preço Unitário | Total");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.printf("  %2d    |    %4d     |     R$ %.2f    | R$ %.2f\n",
                    i, quantidades[i], precos[i], totais[i]);
        }

        double comissao = valorTotalVendas * COMISSAO;
        double salarioFinal = SALARIO_BASE + comissao;

        System.out.printf("\nValor total das vendas: R$"  + valorTotalVendas);
        System.out.printf("Comissão (5%%): R$" + comissao);
        System.out.printf("Salário final do vendedor: R$" + salarioFinal);

    }
}