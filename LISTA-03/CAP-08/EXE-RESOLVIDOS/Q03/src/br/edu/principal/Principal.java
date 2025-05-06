package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int a, b, c, result;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Digite o número para A: ");
            a = sc.nextInt();
        } while(a > 1);

        System.out.print("Digite o número para B: ");
        b = sc.nextInt();
        System.out.print("Digite o número para C: ");
        c = sc.nextInt();

        result = divisores(a, b, c);
        System.out.print("Soma dos inteiros = " + result);

    } public static int divisores(int a, int b, int c) {
        int i, s = 0, r;
        for(i = b; i <= c; i++){
            r = i % a;
            if(r == 0){
                s = s + i;
            }
        } return s;
    }
}