package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[10];

        for (int i = 0; i < 5; i++) {
            v1[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            v2[i] = sc.nextInt();
        }

        ordenar(v1);
        ordenar(v2);

        for (int i = 0; i < 5; i++) {
            v3[i] = v1[i];
            v3[i + 5] = v2[i];
        }

        ordenar(v3);

        for (int i = 0; i < 10; i++) {
            System.out.print(v3[i] + " ");
        }
    }

    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int tmp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = tmp;
                }
            }
        }
    }
}
