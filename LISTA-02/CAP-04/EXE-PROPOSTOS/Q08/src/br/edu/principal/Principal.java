package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
        double salario, aumento;
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário do funcionario: R$ ");
        salario = sc.nextDouble();
        
        if(salario <= 300.00){
        	aumento = salario * 35/100;
        	double salarioNovo = salario + aumento;
        	System.out.print("O novo salário com o aumento de 35%: R$ " + salarioNovo);
        } else if(salario > 300.00) {
        	aumento = salario * 15/100;
        	double salarioNovo = salario + aumento;
        	System.out.print("O novo salário com o aumento de 15%: R$ " + salarioNovo);
        }
    }
}