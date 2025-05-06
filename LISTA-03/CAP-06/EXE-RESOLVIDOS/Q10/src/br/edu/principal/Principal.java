package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double cf = sc.nextDouble();

        double pd = 0;
        double pi = 0;
        
        if (cf <= 12000.00) {
            pd = 5;
            pi = 0;
        } else if (cf <= 25000.00) {
            pd = 10;
            pi = 15;
        } else {
            pd = 15;
            pi = 20;
        }

        double vd = cf * (pd / 100);
        double vi = cf * (pi / 100);

        double pc = cf + vd + vi;

        System.out.println("Custo de fábrica: R$ " + cf);
        System.out.println("Porcentagem do distribuidor: " + pd + "%");
        System.out.println("Porcentagem dos impostos: " + pi + "%");
        System.out.println("Preço ao consumidor: R$ " + pc);
    }
}