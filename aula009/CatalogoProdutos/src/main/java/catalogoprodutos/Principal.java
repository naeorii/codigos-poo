package catalogoprodutos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();
        int opcao;

        do {
            System.out.println("\n===== CATALOGO DE PRODUTOS =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar por codigo");
            System.out.println("3 - Listar por categoria");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            try {
                opcao = Integer.parseInt(teclado.nextLine().strip());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Codigo (CATEGORIA-NUMERO): ");
                    String codigo = teclado.nextLine();
                    System.out.print("Descricao: ");
                    String descricao = teclado.nextLine();

                    Produto novoProduto = new Produto(codigo, descricao);
                    if (catalogo.cadastrar(novoProduto)) {
                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Cadastro recusado: codigo/descricao"
                                + " invalido ou codigo ja existente.");
                    }
                    break;

                case 2:
                    System.out.print("Codigo para buscar: ");
                    String codigoBusca = teclado.nextLine();
                    Produto encontrado = catalogo.buscar(codigoBusca);
                    if (encontrado == null) {
                        System.out.println("Produto nao encontrado.");
                    } else {
                        System.out.println("Produto encontrado:");
                        encontrado.exibir();
                    }
                    break;

                case 3:
                    System.out.print("Categoria ou prefixo: ");
                    String categoria = teclado.nextLine();
                    catalogo.listarCategoria(categoria);
                    break;

                case 0:
                    System.out.println("Encerrando o catalogo...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);

        teclado.close();
    }
}
