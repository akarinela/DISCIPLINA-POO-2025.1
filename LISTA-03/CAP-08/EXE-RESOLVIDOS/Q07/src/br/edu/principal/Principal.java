package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double nota1, nota2, nota3, m;
        char letra;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        sc.nextLine();

        do {
            System.out.print("Digite a letra (A ou P): ");
            letra = sc.nextLine().charAt(0);
        } while (letra != 'A' && letra != 'a' && letra != 'P' && letra != 'p');

        m = calculoMedia(nota1, nota2, nota3, letra);
        if (letra == 'A' || letra == 'a') {
            System.out.println("Sua média aritmética é: " + m);
        } else {
            System.out.println("Sua média ponderada é: " + m);
        }
    } public static double calculoMedia(double n1, double n2, double n3, char l) {
        double media;
        if (l == 'A' || l == 'a') {
            media = (n1 + n2 + n3) / 3;
        } else {
            media = (n1 * 5 + n2 * 3 + n3 * 2) / 10;
        } return media;
    }
}