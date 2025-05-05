package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do Trabalho de Laboratório: ");
        double notaLab = input.nextDouble();

        System.out.print("Digite a nota da Avaliação Semestral: ");
        double notaSemestral = input.nextDouble();

        System.out.print("Digite a nota do Exame Final: ");
        double notaFinal = input.nextDouble();

        double media = (notaLab * 2 + notaSemestral * 3 + notaFinal * 5) / 10;

        char conceito;
        if (media >= 8.0) {
            conceito = 'A';
        } 
        
        else if (media >= 7.0) {
            conceito = 'B';
        } 
        
        else if (media >= 6.0) {
            conceito = 'C';
        } 
        
        else if (media >= 5.0) {
            conceito = 'D';
        } 
        
        else {
            conceito = 'E';
        }

        System.out.printf("Média ponderada: " + media);
        System.out.println("Conceito: " + conceito);
        
    }
}