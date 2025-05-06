package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int num;
        double s;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        num = sc.nextInt();

        s = sequencia(num);
        System.out.print("O resultado da sequência é: " + s);
    } public static double sequencia(int n) {
        int a, b;
        double f, seq = 1;
        for(a = 1; a <= n; a++){
            f = 1;
            for(b = 1; b <= a; b++){
                f = f * b;
            }
            seq = seq + 1 / f;
        } return seq;
    }
}