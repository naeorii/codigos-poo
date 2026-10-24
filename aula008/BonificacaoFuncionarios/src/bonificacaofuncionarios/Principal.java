/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bonificacaofuncionarios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SistemaFuncionarios sistema = new SistemaFuncionarios();
        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE FUNCIONARIOS =====");
            System.out.println("1 - Cadastrar administrativo");
            System.out.println("2 - Cadastrar gerente");
            System.out.println("3 - Cadastrar secretario");
            System.out.println("4 - Buscar por codigo");
            System.out.println("5 - Remover por codigo");
            System.out.println("6 - Listar funcionarios");
            System.out.println("7 - Quantidade de funcionarios");
            System.out.println("0 - Sair");
            opcao = lerInteiro(entrada, "Opcao: ");

            switch (opcao) {
                case 1:
                case 2:
                case 3: {
                    int codigo = lerInteiro(entrada, "Codigo: ");
                    String nome = lerTexto(entrada, "Nome: ");
                    double salario = lerDouble(entrada, "Salario-base: ");

                    Funcionario funcionario;
                    if (opcao == 1) {
                        funcionario = new Administrativo(codigo, nome, salario);
                    } else if (opcao == 2) {
                        String setor = lerTexto(entrada, "Setor: ");
                        int numero = lerInteiro(entrada,
                                "Numero de funcionarios gerenciados: ");
                        funcionario = new Gerente(codigo, nome, salario, setor, numero);
                    } else {
                        String local = lerTexto(entrada, "Local de trabalho: ");
                        String ramal = lerTexto(entrada, "Ramal: ");
                        funcionario = new Secretario(codigo, nome, salario, local, ramal);
                    }

                    if (sistema.cadastrar(funcionario)) {
                        System.out.println("Funcionario cadastrado com sucesso.");
                    } else {
                        System.out.println("Cadastro nao realizado. Verifique codigo, nome, "
                                + "salario-base e duplicidade.");
                    }
                    break;
                }
                case 4: {
                    int codigo = lerInteiro(entrada, "Codigo para buscar: ");
                    sistema.exibir(sistema.buscar(codigo));
                    break;
                }
                case 5: {
                    int codigo = lerInteiro(entrada, "Codigo para remover: ");
                    if (sistema.remover(codigo)) {
                        System.out.println("Funcionario removido com sucesso.");
                    } else {
                        System.out.println("Funcionario nao encontrado.");
                    }
                    break;
                }
                case 6:
                    sistema.listar();
                    break;
                case 7:
                    System.out.println("Quantidade de funcionarios: " + sistema.quantidade());
                    break;
                case 0:
                    System.out.println("Encerrando sistema de funcionarios.");
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

