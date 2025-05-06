package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int horaI, minI, horaF, minF, minutos;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial: ");
        horaI = sc.nextInt();
        System.out.print("Digite os minutos iniciais: ");
        minI = sc.nextInt();
        System.out.print("Digite a hora final: ");
        horaF = sc.nextInt();
        System.out.print("Digite os minutos finais: ");
        minF = sc.nextInt();

        minutos = calculo(horaI, minI, horaF, minF);
        System.out.println("Duração em minutos: " + minutos);
    } public static int calculo(int hI, int mI, int hF, int mF) {
        int totH, totM, total;
        if (mF < mI) {
            mF = mF + 60;
            hF = hF - 1;
        } if (hF < hI) {
            hF = hF + 24;
        }

        totM = mF - mI;
        totH = hF - hI;
        total = totH * 60 + totM;

        return total;
    }
}