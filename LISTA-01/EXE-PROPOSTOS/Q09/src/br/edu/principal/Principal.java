package br.edu.principal;

import java.util.Scanner;
		
public class Principal {
	
		public static void main(String[] args) {

        double baseMaior, baseMenor, altura;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base maior do trapézio: ");
        baseMaior = sc.nextDouble();
			
        System.out.print("Digite a base menor do trapézio: ");
        baseMenor = sc.nextDouble();
			
        System.out.print("Digite a altura do trapézio: ");
        altura = sc.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A área do trapézio é, " + area);

    }
}