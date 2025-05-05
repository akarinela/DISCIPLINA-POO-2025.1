package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double n1, n2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();
        
       if(n1 < n2){
    	   System.out.println("O número " + n1 + " é menor que o número " + n2);
       } else if(n1 > n2){
    	   System.out.println("O número " + n2 + " é menor que o número " + n1);
       } else if(n1 == n2){
    	   System.out.println("Números iguais, o menor número é, " + n2);
       }
    }

	}
