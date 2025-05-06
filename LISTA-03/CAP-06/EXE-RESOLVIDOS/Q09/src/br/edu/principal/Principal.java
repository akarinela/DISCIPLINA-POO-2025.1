package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        final int TAM = 12;
        int[] numerosVoo = new int[TAM];
        String[] origens = new String[TAM];
        String[] destinos = new String[TAM];
        int[] lugaresDisponiveis = new int[TAM];

        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro dos voos:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Número do voo [" + (i + 1) + "]: ");
            numerosVoo[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Origem: ");
            origens[i] = sc.nextLine();

            System.out.print("Destino: ");
            destinos[i] = sc.nextLine();

            System.out.print("Lugares disponíveis: ");
            lugaresDisponiveis[i] = sc.nextInt();
        }

        int opcao;
        do {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1 - Consultar");
            System.out.println("2 - Efetuar reserva");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("--- CONSULTA ---");
                    System.out.println("1 - Por número do voo");
                    System.out.println("2 - Por origem");
                    System.out.println("3 - Por destino");
                    System.out.print("Escolha uma opção: ");
                    int tipoConsulta = sc.nextInt();
                    sc.nextLine();

                    switch (tipoConsulta) {
                        case 1:
                            System.out.print("Digite o número do voo: ");
                            int num = sc.nextInt();
                            boolean encontrado = false;
                            for (int i = 0; i < TAM; i++) {
                                if (numerosVoo[i] == num) {
                                    System.out.println("Voo " + numerosVoo[i] +
                                        " | Origem: " + origens[i] +
                                        " | Destino: " + destinos[i] +
                                        " | Lugares disponíveis: " + lugaresDisponiveis[i]);
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Voo inexistente.");
                            }
                            break;

                        case 2:
                            System.out.print("Digite a origem: ");
                            String origemConsulta = sc.nextLine();
                            boolean achouOrigem = false;
                            for (int i = 0; i < TAM; i++) {
                                if (origens[i].equalsIgnoreCase(origemConsulta)) {
                                    System.out.println("Voo " + numerosVoo[i] +
                                        " | Destino: " + destinos[i] +
                                        " | Lugares disponíveis: " + lugaresDisponiveis[i]);
                                    achouOrigem = true;
                                }
                            }
                            if (!achouOrigem) {
                                System.out.println("Nenhum voo encontrado com essa origem.");
                            }
                            break;

                        case 3:
                            System.out.print("Digite o destino: ");
                            String destinoConsulta = sc.nextLine();
                            boolean achouDestino = false;
                            for (int i = 0; i < TAM; i++) {
                                if (destinos[i].equalsIgnoreCase(destinoConsulta)) {
                                    System.out.println("Voo " + numerosVoo[i] +
                                        " | Origem: " + origens[i] +
                                        " | Lugares disponíveis: " + lugaresDisponiveis[i]);
                                    achouDestino = true;
                                }
                            }
                            if (!achouDestino) {
                                System.out.println("Nenhum voo encontrado com esse destino.");
                            }
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o número do voo desejado: ");
                    int vooReserva = sc.nextInt();
                    boolean reservado = false;

                    for (int i = 0; i < TAM; i++) {
                        if (numerosVoo[i] == vooReserva) {
                            if (lugaresDisponiveis[i] > 0) {
                                lugaresDisponiveis[i]--;
                                System.out.println("Reserva confirmada! Restam " + lugaresDisponiveis[i] + " lugares.");
                            } else {
                                System.out.println("Voo lotado.");
                            }
                            reservado = true;
                            break;
                        }
                    }

                    if (!reservado) {
                        System.out.println("Voo inexistente.");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

    }
}