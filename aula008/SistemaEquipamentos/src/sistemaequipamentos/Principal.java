
package sistemaequipamentos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SistemaEquipamentos sistema = new SistemaEquipamentos();
        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE EQUIPAMENTOS =====");
            System.out.println("1 - Cadastrar computador");
            System.out.println("2 - Cadastrar impressora");
            System.out.println("3 - Cadastrar projetor");
            System.out.println("4 - Buscar por codigo");
            System.out.println("5 - Remover por codigo");
            System.out.println("6 - Listar equipamentos");
            System.out.println("7 - Quantidade de equipamentos");
            System.out.println("0 - Sair");
            opcao = lerInteiro(entrada, "Opcao: ");

            switch (opcao) {
                case 1:
                case 2:
                case 3: {
                    int codigo = lerInteiro(entrada, "Codigo: ");
                    String descricao = lerTexto(entrada, "Descricao: ");
                    double valor = lerDouble(entrada, "Valor de aquisicao: ");

                    Equipamento equipamento;
                    if (opcao == 1) {
                        int memoria = lerInteiro(entrada, "Memoria RAM (GB): ");
                        String processador = lerTexto(entrada, "Processador: ");
                        equipamento = new Computador(
                                codigo, descricao, valor, memoria, processador);
                    } else if (opcao == 2) {
                        String tecnologia = lerTexto(entrada, "Tecnologia: ");
                        int paginas = lerInteiro(entrada, "Paginas por minuto: ");
                        equipamento = new Impressora(
                                codigo, descricao, valor, tecnologia, paginas);
                    } else {
                        String resolucao = lerTexto(entrada, "Resolucao: ");
                        int luminosidade = lerInteiro(entrada, "Luminosidade (lumens): ");
                        equipamento = new Projetor(
                                codigo, descricao, valor, resolucao, luminosidade);
                    }

                    if (sistema.cadastrar(equipamento)) {
                        System.out.println("Equipamento cadastrado com sucesso.");
                    } else {
                        System.out.println("Cadastro nao realizado. Verifique codigo, "
                                + "descricao, valor de aquisicao e duplicidade.");
                    }
                    break;
                }
                case 4: {
                    int codigo = lerInteiro(entrada, "Codigo para buscar: ");
                    Equipamento equipamento = sistema.buscar(codigo);
                    if (equipamento == null) {
                        System.out.println("Equipamento nao encontrado.");
                    } else {
                        System.out.println(equipamento.getDetalhes());
                    }
                    break;
                }
                case 5: {
                    int codigo = lerInteiro(entrada, "Codigo para remover: ");
                    if (sistema.remover(codigo)) {
                        System.out.println("Equipamento removido com sucesso.");
                    } else {
                        System.out.println("Equipamento nao encontrado.");
                    }
                    break;
                }
                case 6:
                    sistema.listar();
                    break;
                case 7:
                    System.out.println("Quantidade de equipamentos: " + sistema.quantidade());
                    break;
                case 0:
                    System.out.println("Encerrando sistema de equipamentos.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);

        entrada.close();
    }

    private static String lerTexto(Scanner entrada, String mensagem) {
        System.out.print(mensagem);
        return entrada.nextLine();
    }

    private static int lerInteiro(Scanner entrada, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Integer.parseInt(entrada.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero inteiro valido.");
            }
        }
    }

    private static double lerDouble(Scanner entrada, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                double valor = Double.parseDouble(
                        entrada.nextLine().trim().replace(',', '.'));
                if (Double.isFinite(valor)) {
                    return valor;
                }
            } catch (NumberFormatException e) {
                // O aviso abaixo tambem atende a entradas nao numericas.
            }
            System.out.println("Digite um valor numerico valido.");
        }
    }
}
