package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
double nota1, nota2, nota3, nota4, media;
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Digite sua primeira nota: ");
    	nota1 = sc.nextDouble();
    	if(nota1 < 0 || nota1 > 10){
    		System.out.println("Nota Inválida!");
    		return;
    	}
    	
    	System.out.print("Digite sua segunda nota: ");
    	nota2 = sc.nextDouble();
    	if(nota2 < 0 || nota2 > 10){
    		System.out.println("Nota Inválida!");
    		return;
    	}
    	
    	System.out.print("Digite sua terceira nota: ");
    	nota3 = sc.nextDouble();
    	if(nota3 < 0 || nota3 > 10){
    		System.out.println("Nota Inválida!");
    		return;
    	}
    	
    	System.out.print("Digite sua quarta nota: ");
    	nota4 = sc.nextDouble();
    	if(nota4 < 0 || nota4 > 10){
    		System.out.println("Nota Inválida!");
    		return;
    	}
    	
    	media = (nota1 + nota2 + nota3 + nota4) / 4;
    	
    	System.out.println("Sua média é, " + media);
    	if(media >= 7){
    		System.out.println("Aprovado.");
    	} else {
    		System.out.println("Reprovado.");
    	}

	}

}