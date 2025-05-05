package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            System.out.println("Tabuada do " + num + ":");
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + " × " + i + " = " + (num * i));
            }
            System.out.println();
        }
    }
}