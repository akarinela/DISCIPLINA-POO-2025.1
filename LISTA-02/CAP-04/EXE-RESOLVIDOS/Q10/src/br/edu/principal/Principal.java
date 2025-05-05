  package br.edu.principal;
  import java.time.LocalDate;
  import java.util.Scanner;

  public class Principal {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Digite a primeira data:");
          System.out.print("Dia: ");
          int dia1 = scanner.nextInt();
          System.out.print("Mês: ");
          int mes1 = scanner.nextInt();
          System.out.print("Ano: ");
          int ano1 = scanner.nextInt();

          System.out.println("Digite a segunda data:");
          System.out.print("Dia: ");
          int dia2 = scanner.nextInt();
          System.out.print("Mês: ");
          int mes2 = scanner.nextInt();
          System.out.print("Ano: ");
          int ano2 = scanner.nextInt();

          LocalDate data1 = LocalDate.of(ano1, mes1, dia1);
          LocalDate data2 = LocalDate.of(ano2, mes2, dia2);

          if (data1.isAfter(data2)) {
              System.out.println("A primeira data é cronologicamente maior: " + data1);
          } else if (data2.isAfter(data1)) {
              System.out.println("A segunda data é cronologicamente maior: " + data2);
          } else {
              System.out.println("As duas datas são iguais.");
          }

      }
  }