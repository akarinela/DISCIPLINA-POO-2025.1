package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        double nht, valor, salMin, salInicial, aux, salFinal;
        salMin = 450;
        char turno, categoria;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("- Funcionário " + cont);

            System.out.print("Digite o código: ");
            codigo = sc.nextInt();
            System.out.print("Digite o número de horas trabalhadas: ");
            nht = sc.nextDouble();

            System.out.print("Digite o turno (M - Matutino, V - Vespertino ou N - Noturno): ");
            turno = sc.next().charAt(0);

            while (!(turno == 'M' || turno == 'V' || turno == 'N' ||
                     turno == 'm' || turno == 'v' || turno == 'n')) {
                System.out.print("Turno inválido. Digite novamente (M, V ou N): ");
                turno = sc.next().charAt(0);
            }

            System.out.print("Digite a categoria (O - Operário ou G - Gerente): ");
            categoria = sc.next().charAt(0);

            while (!(categoria == 'G' || categoria == 'O' ||
                     categoria == 'g' || categoria == 'o')) {
                System.out.print("Categoria inválida. Digite novamente (G ou O): ");
                categoria = sc.next().charAt(0);
            }

            turno = Character.toUpperCase(turno);
            categoria = Character.toUpperCase(categoria);

            if (categoria == 'G') {
                if (turno == 'N') {
                    valor = salMin * 18 / 100;
                } else {
                    valor = salMin * 15 / 100;
                }
            } else {
                if (turno == 'N') {
                    valor = salMin * 13 / 100;
                } else {
                    valor = salMin * 10 / 100;
                }
            }

            salInicial = nht * valor;

            if (salInicial <= 300) {
                aux = salInicial * 20 / 100;
            } else if (salInicial < 600) {
                aux = salInicial * 15 / 100;
            } else {
                aux = salInicial * 5 / 100;
            }

            salFinal = salInicial + aux;

            System.out.println("Código: " + codigo);
            System.out.println("Horas trabalhadas: " + nht + "h");
            System.out.println("Valor da hora: R$ " + valor);
            System.out.println("Salário inicial: R$ " + salInicial);
            System.out.println("Auxílio: R$ " + aux);
            System.out.println("Salário final: R$ " + salFinal);
        }
        
    }
}