package sistemahoteleirohashmap;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SistemaHoteleiro hotel = new SistemaHoteleiro();
        int opcao;

        do {
            System.out.println("\n===== SISTEMA HOTELEIRO =====");
            System.out.println("1 - Cadastrar quarto");
            System.out.println("2 - Buscar quarto");
            System.out.println("3 - Remover quarto");
            System.out.println("4 - Listar todos os quartos");
            System.out.println("5 - Listar quartos ocupados");
            System.out.println("6 - Listar quartos disponiveis");
            System.out.println("7 - Realizar check-in");
            System.out.println("8 - Realizar check-out");
            System.out.println("9 - Consultar quantidade de quartos");
            System.out.println("0 - Sair");
            opcao = lerInteiro(teclado, "Opcao: ");

            switch (opcao) {
                case 1: {
                    System.out.println("1 - Simples");
                    System.out.println("2 - Luxo");
                    System.out.println("3 - SuperLuxo");
                    int categoria = lerInteiro(teclado, "Categoria: ");
                    if (categoria < 1 || categoria > 3) {
                        System.out.println("Categoria invalida.");
                        break;
                    }

                    int numero = lerInteiro(teclado, "Numero do quarto: ");
                    if (numero <= 0) {
                        System.out.println("Numero deve ser positivo.");
                        break;
                    }
                    if (hotel.buscar(numero) != null) {
                        System.out.println("Ja existe quarto com esse numero.");
                        break;
                    }
                    double valorBase = lerDoublePositivo(teclado, "Valor-base da diaria: R$ ");
                    Quarto quarto;

                    if (categoria == 1) {
                        boolean ventilador = lerSimNao(teclado, "Possui ventilador? (S/N): ");
                        boolean tv = lerSimNao(teclado, "Possui TV? (S/N): ");
                        quarto = new Simples(numero, valorBase, ventilador, tv);
                    } else if (categoria == 2) {
                        boolean arCondicionado = lerSimNao(teclado, "Possui ar-condicionado? (S/N): ");
                        boolean banheira = lerSimNao(teclado, "Possui banheira? (S/N): ");
                        quarto = new Luxo(numero, valorBase, arCondicionado, banheira);
                    } else {
                        boolean hidromassagem = lerSimNao(teclado, "Possui hidromassagem? (S/N): ");
                        boolean vista = lerSimNao(teclado, "Possui vista panoramica? (S/N): ");
                        quarto = new SuperLuxo(numero, valorBase, hidromassagem, vista);
                    }

                    if (hotel.cadastrar(quarto)) {
                        System.out.println("Quarto cadastrado com sucesso!");
                    } else {
                        System.out.println("Nao foi possivel cadastrar o quarto.");
                    }
                    break;
                }
                case 2: {
                    int numero = lerInteiro(teclado, "Numero para busca: ");
                    Quarto quarto = hotel.buscar(numero);
                    System.out.println(quarto == null ? "Quarto nao encontrado." : quarto.getDetalhes());
                    break;
                }
                case 3: {
                    int numero = lerInteiro(teclado, "Numero para remocao: ");
                    Quarto quarto = hotel.buscar(numero);
                    if (quarto == null) {
                        System.out.println("Quarto nao encontrado.");
                    } else if (quarto.isOcupado()) {
                        System.out.println("Nao e permitido remover um quarto ocupado.");
                    } else if (hotel.remover(numero)) {
                        System.out.println("Quarto removido com sucesso!");
                    }
                    break;
                }
                case 4: {
                    exibirQuartos(hotel.listarTodos(), "TODOS OS QUARTOS");
                    break;
                }
                case 5: {
                    exibirQuartos(hotel.listarOcupados(), "QUARTOS OCUPADOS");
                    break;
                }
                case 6: {
                    exibirQuartos(hotel.listarDisponiveis(), "QUARTOS DISPONIVEIS");
                    break;
                }
                case 7: {
                    int numero = lerInteiro(teclado, "Numero para check-in: ");
                    if (hotel.checkIn(numero)) {
                        System.out.println("Check-in realizado com sucesso!");
                    } else {
                        System.out.println("Quarto inexistente ou ja ocupado.");
                    }
                    break;
                }
                case 8: {
                    int numero = lerInteiro(teclado, "Numero para check-out: ");
                    int diarias = lerInteiro(teclado, "Quantidade de diarias: ");
                    double total = hotel.checkOut(numero, diarias);
                    if (total < 0) {
                        System.out.println("Check-out nao realizado: confira o quarto e a quantidade de diarias.");
                    } else {
                        System.out.printf(Locale.forLanguageTag("pt-BR"),
                                "Check-out realizado! Total da hospedagem: R$ %.2f%n", total);
                    }
                    break;
                }
                case 9: {
                    System.out.println("Total de quartos: " + hotel.totalQuartos());
                    System.out.println("Quartos ocupados: " + hotel.contarOcupados());
                    System.out.println("Quartos disponiveis: " + hotel.contarDisponiveis());
                    break;
                }
                case 0: {
                    System.out.println("Encerrando sistema...");
                    break;
                }
                default: {
                    System.out.println("Opcao inexistente.");
                }
            }
        } while (opcao != 0);

        teclado.close();
    }

    private static void exibirQuartos(ArrayList<Quarto> quartos, String titulo) {
        System.out.println("\n===== " + titulo + " =====");
        if (quartos.isEmpty()) {
            System.out.println("Nenhum quarto encontrado.");
        } else {
            for (Quarto quarto : quartos) {
                System.out.println(quarto.getDetalhes());
            }
        }
    }

    private static int lerInteiro(Scanner teclado, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = teclado.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido. Digite um numero inteiro.");
            }
        }
    }

    private static double lerDoublePositivo(Scanner teclado, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = teclado.nextLine().trim().replace(',', '.');
            try {
                double valor = Double.parseDouble(entrada);
                if (Double.isFinite(valor) && valor > 0) {
                    return valor;
                }
            } catch (NumberFormatException e) {
                // Nova tentativa de leitura.
            }
            System.out.println("Valor invalido. Informe um valor maior que zero.");
        }
    }

    private static boolean lerSimNao(Scanner teclado, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String resposta = teclado.nextLine().trim();
            if (resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("SIM")) {
                return true;
            }
            if (resposta.equalsIgnoreCase("N") || resposta.equalsIgnoreCase("NAO")
                    || resposta.equalsIgnoreCase("NÃO")) {
                return false;
            }
            System.out.println("Resposta invalida. Digite S ou N.");
        }
    }
}
