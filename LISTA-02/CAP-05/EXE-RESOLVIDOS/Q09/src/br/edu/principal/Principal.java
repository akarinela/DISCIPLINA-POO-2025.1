package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
    public static void main(String[] args) {
        double nota1, nota2, media, mediaClasse, totalClasse;
        int cont, totalAprov, totalExm, totalReprov;

        Scanner sc = new Scanner(System.in);
        totalClasse = 0;
        totalReprov = 0;
        totalExm = 0;
        totalAprov = 0;

        for(cont = 1; cont <= 6; cont++) {
            System.out.println("Aluno " + cont);
            System.out.print("Digite a primeira nota: ");
            nota1 = sc.nextDouble();
            if(nota1 < 0 || nota1 > 10){
                System.out.print("Nota Inválida. 0 á 10!");
                return;
            }

            System.out.print("Digite a segunda nota: ");
            nota2 = sc.nextDouble();
            if(nota2 < 0 || nota2 > 10){
                System.out.print("Nota Inválida. 0 á 10!");
                return;
            }

            media = (nota1 + nota2) / 2;
            System.out.print("A média do Aluno #" + cont + ", é: " + media);
            if(media <= 3){
                totalReprov++;
                System.out.println(" - Reprovado!");
            } else if(media > 3 && media < 7){
                totalExm++;
                System.out.println(" - Exame!");
            } else if(media >= 7){
                totalAprov++;
                System.out.println(" - Aprovado!");
            }
            totalClasse = totalClasse + media;
        }
        System.out.println("O total de alunos Reprovados: " + totalReprov);
        System.out.println("O total de alunos em Exame: " + totalExm);
        System.out.println("O total de alunos Aprovados: " + totalAprov);

        mediaClasse = totalClasse / 6;
        System.out.print("A média da classe, é: " + mediaClasse);

    }
}