package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
    	double saldoMedio;
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o saldo médio do cliente: R$ ");
        saldoMedio = sc.nextDouble();

        double credito = 0;

        if (saldoMedio > 400.00) {
            credito = saldoMedio * 30/100;
        } else if (saldoMedio >= 300.00) {
            credito = saldoMedio * 25/100;
        } else if (saldoMedio >= 200.00) {
            credito = saldoMedio * 20/100;
        } else {
            credito = saldoMedio * 10/100;
        }

        System.out.println("Saldo médio: R$ " + saldoMedio);
        System.out.println("Valor do crédito especial: R$ " + credito);
    }
}