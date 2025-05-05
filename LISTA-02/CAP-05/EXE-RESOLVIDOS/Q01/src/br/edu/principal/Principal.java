package br.edu.principal;
import java.util.Scanner;

public class Principal {
    
		public static void main(String[] args) {
        double i, salario, novosalario, percentual;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        salario = 1000;
        percentual = 1.5/100;

        novosalario = salario + percentual * salario;
        for(i = 2007; i <= anoAtual; i++) {
            percentual = 2 * percentual;
            novosalario = novosalario + percentual * novosalario;
        }
        System.out.print("O novo salário em " + anoAtual + " é, R$ " + novosalario);
    }
}