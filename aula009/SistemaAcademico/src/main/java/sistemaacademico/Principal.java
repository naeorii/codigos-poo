package sistemaacademico;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SistemaAcademico sistema = new SistemaAcademico();
        int opcao;

        do {
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Buscar por nome");
            System.out.println("3 - Listar alunos");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            try {
                opcao = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Matricula: ");
                    try {
                        int matricula = Integer.parseInt(teclado.nextLine());
                        System.out.print("Nome: ");
                        String nome = teclado.nextLine();
                        System.out.println(sistema.cadastrar(matricula, nome)
                                ? "Cadastrado." : "Cadastro recusado.");
                    } catch (NumberFormatException e) {
                        System.out.println("Matricula invalida.");
                    }
                    break;
                case 2:
                    System.out.print("Nome a buscar: ");
                    String buscaNome = teclado.nextLine();
                    Aluno aluno = sistema.buscarPorNome(buscaNome);
                    System.out.println(aluno == null ? "Nao encontrado."
                            : aluno.getMatricula() + " - " + aluno.getNome());
                    break;
                case 3:
                    System.out.println(sistema.listar());
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
        teclado.close();
    }
}
