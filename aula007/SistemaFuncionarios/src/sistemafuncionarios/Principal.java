/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemafuncionarios;

/**
 *
 * @author taian
 */

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SistemaFuncionarios sistema = new SistemaFuncionarios();
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE FUNCIONARIOS ===");
            System.out.println("1 - Cadastrar gerente");
            System.out.println("2 - Cadastrar secretario");
            System.out.println("3 - Buscar funcionario");
            System.out.println("4 - Listar funcionarios");
            System.out.println("5 - Quantidade de funcionarios");
            System.out.println("6 - Total da folha de pagamento");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            opcao = entrada.nextInt();
            entrada.nextLine();


            switch (opcao) {
                case 1:
                    System.out.print("Codigo: ");
                    int codigo = Integer.parseInt(entrada.nextLine());
                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();
                    System.out.print("Salario base: ");
                    double salario = Double.parseDouble(entrada.nextLine());
                    System.out.print("Setor: ");
                    String setor = entrada.nextLine();
                    System.out.print("Numero de funcionarios gerenciados: ");
                    int quantidade = Integer.parseInt(entrada.nextLine());

                    Funcionario gerente = new Gerente(codigo, nome, salario, setor, quantidade);

                    if (sistema.cadastrarFuncionario(gerente)) {
                        System.out.println("Gerente cadastrado!");
                    } else {
                        System.out.println("Codigo ja cadastrado!");
                    }
                    break;

                case 2:
                    System.out.print("Codigo: ");
                    codigo = Integer.parseInt(entrada.nextLine());

                    System.out.print("Nome: ");
                    nome = entrada.nextLine();

                    System.out.print("Salario base: ");
                    salario = Double.parseDouble(entrada.nextLine());

                    System.out.print("Local de trabalho: ");
                    String local = entrada.nextLine();

                    System.out.print("Ramal: ");
                    String ramal = entrada.nextLine();

                    Funcionario secretario = new Secretario(
                            codigo, nome, salario, local, ramal);

                    if (sistema.cadastrarFuncionario(secretario)) {
                        System.out.println("Secretario cadastrado!");
                    } else {
                        System.out.println("Codigo ja cadastrado!");
                    }
                    break;

                case 3:
                    System.out.print("Codigo: ");
                    codigo = Integer.parseInt(entrada.nextLine());

                    Funcionario encontrado =
                            sistema.buscarFuncionario(codigo);

                    if (encontrado != null) {
                        encontrado.exibirDados();

                        if (encontrado instanceof Gerente) {
                            Gerente g = (Gerente) encontrado;
                            System.out.println("Setor: " + g.getSetor());
                            System.out.println("Funcionarios gerenciados: " + g.getNumeroFuncionariosGerenciados());
                        }

                        if (encontrado instanceof Secretario) {
                            Secretario s = (Secretario) encontrado;
                            System.out.println("Local: " + s.getLocalTrabalho());
                            System.out.println("Ramal: " + s.getRamal());
                        }
                    } else {
                        System.out.println("Funcionario nao encontrado.");
                    }
                    break;

                case 4:
                    sistema.listarFuncionarios();
                    break;

                case 5:
                    System.out.println("Quantidade: " + sistema.quantidadeFuncionarios());
                    break;

                case 6:
                    System.out.println("Total da folha: R$ " + sistema.calcularFolhaPagamento());
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        entrada.close();
    }
}
