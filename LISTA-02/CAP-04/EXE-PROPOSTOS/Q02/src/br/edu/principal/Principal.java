package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 double nota1, nota2;

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o primeira nota: ");
	        nota1 = sc.nextDouble();
	        
	        if(nota1 < 0 || nota1 > 10){
	        	System.out.println("Nota Inválida!");
	        	return;
	        } 
	        
	        System.out.print("Digite o segunda nota: ");
	        nota2 = sc.nextDouble();
	        
	        if(nota2 < 0 || nota2 > 10){
	        	System.out.println("Nota Inválida!");
	        	return;
	        } 

	        double media = (nota1 + nota2) / 2; 
	        System.out.println("Sua média é, " + media);
	        
	        if(media >= 0 & media < 3){
	        	System.out.println("Reprovado!");
	        } else if(media >= 3 & media < 7){
	        	System.out.println("Exame!");
	        } else if(media >= 7 & media <= 10){
	        	System.out.println("Aprovado!");
	        }  
	    }
	}