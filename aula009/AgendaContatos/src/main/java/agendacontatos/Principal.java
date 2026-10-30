package agendacontatos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao;

        do {
            System.out.println("\n===== AGENDA DE CONTATOS =====");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Buscar por nome");
            System.out.println("3 - Listar contatos");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            try {
                opcao = Integer.parseInt(teclado.nextLine().strip());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = teclado.nextLine();
                    System.out.print("E-mail: ");
                    String email = teclado.nextLine();

                    Contato novoContato = new Contato(nome, email);
                    if (agenda.cadastrar(novoContato)) {
                        System.out.println("Contato cadastrado com sucesso!");
                    } else {
                        System.out.println("Cadastro recusado: nome/e-mail invalido"
                                + " ou e-mail ja cadastrado.");
                    }
                    break;

                case 2:
                    System.out.print("Nome a buscar: ");
                    String busca = teclado.nextLine();
                    Contato encontrado = agenda.buscarPorNome(busca);
                    if (encontrado == null) {
                        System.out.println("Nenhum contato encontrado.");
                    } else {
                        System.out.println("Contato encontrado:");
                        encontrado.exibir();
                    }
                    break;

                case 3:
                    agenda.listar();
                    break;

                case 0:
                    System.out.println("Encerrando a agenda...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);

        teclado.close();
    }
}
