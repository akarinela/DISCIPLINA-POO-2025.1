package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
        double salario, aumento;
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário do funcionario: R$ ");
        salario = sc.nextDouble();
        
        if(salario < 500.00){
        	aumento = salario * 30/100;
        	double salarioNovo = salario + aumento;
        	System.out.print("O novo salário com o aumento de 30%: R$ " + salarioNovo);
        } else {
        	System.out.print("O funcionário não tem direito ao aumento.");
        }
    }
}