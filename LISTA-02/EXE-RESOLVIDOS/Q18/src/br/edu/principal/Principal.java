package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int n1, n2, n3, numTermos, i;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de termos: ");
        numTermos = sc.nextInt();

        n1 = 2;
        n2 = 7;
        n3 = 3;

        System.out.print(n1 + " - ");
        System.out.print(n2 + " - ");
        System.out.print(n3);

        i = 4;
        while (i <= numTermos){
            n1 = n1 * 2;
            System.out.print(" - " + n1);
            i++;

            if(i <= numTermos){
                n2 = n2 * 3;
                System.out.print(" - " + n2);
                i++;

            } if(i <= numTermos){
                n3 = n3 * 4;
                System.out.print(" - " + n3);
                i++;
            }
        }
    }
}