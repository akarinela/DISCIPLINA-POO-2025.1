package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        double preco = 5.0;
        double maiorLucro = 0;
        double melhorPreco = 0;
        int melhorQtd = 0;

        System.out.println("Preço   Ingressos   Lucro");

        while (preco >= 1.0) {
            int qtd = 120 + (int)((5.0 - preco) / 0.5) * 26;
            double lucro = (preco * qtd) - 200;

            System.out.println(preco + "     " + qtd + "      " + lucro);

            if (lucro > maiorLucro) {
                maiorLucro = lucro;
                melhorPreco = preco;
                melhorQtd = qtd;
            }

            preco -= 0.5;
        }

        System.out.println("\nMaior lucro: " + maiorLucro);
        System.out.println("Melhor preço: " + melhorPreco);
        System.out.println("Ingressos vendidos: " + melhorQtd);
    }
}