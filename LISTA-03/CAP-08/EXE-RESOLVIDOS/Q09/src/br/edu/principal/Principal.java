package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        maiorMenor();
    } public static void maiorMenor() {
        int i, n = 0, maior = 0, menor = 0;

        Scanner sc = new Scanner(System.in);
        for(i = 1; i <= 5; i++){
            System.out.print("Digite o " + i + "° número: ");
            n = sc.nextInt();
            if(i == 1){
                maior = n;
                menor = n;
            } else {
                if(n > maior){
                    maior = n;
                } if(n < menor){
                    menor = n;
                }
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
    }
}