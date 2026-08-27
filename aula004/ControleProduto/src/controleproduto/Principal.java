/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controleproduto;
import java.util.Scanner;

/**
 *
 * @author taian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto produto = null;
        int opcao;
        
        do {
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Repor");
            System.out.println("3 - Vender");
            System.out.println("4 - Consultar Estoque");
            System.out.println("5 - Consultar valor do estoque");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = teclado.nextInt();
            teclado.nextLine();
            
            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = teclado.nextLine();
                    System.out.print("Preco: R$ ");
                    double preco = teclado.nextDouble();
                    System.out.print("Estoque: ");
                    int estoque = teclado.nextInt();
                    produto = new Produto(nome, preco, estoque);
                }
                case 2 -> {
                    if (produto == null) {
                        System.out.println("Cadastre um produto primeiro.");
                    } else {
                        System.out.print("Quantidade para repor: ");
                        int quantidade = teclado.nextInt();
                        produto.reporEstoque(quantidade);
                        }
                    }
                
                case 3 -> {
                    if (produto == null) {
                        System.out.println("Cadastre um produto primeiro.");
                    } else {
                        System.out.print("Quantidade para vender: ");
                        int quantidade = teclado.nextInt();
                        produto.vender(quantidade);
                        }
                    }
                case 4 -> {
                    if (produto == null) {
                        System.out.println("Cadastre um produto primeiro.");
                    } else {
                        System.out.println("Estoque: " + produto.getEstoque());
                    }
                }
                case 5 -> {
                    if (produto == null) {
                        System.out.println("Cadastre um produto primeiro.");
                    } else {
                        System.out.println("Valor do estoque: " + produto.calcularValorEstoque());
                    }
                }
                case 0 -> System.out.println("Programa encerrado.");
                default -> System.out.println("Opcao invalida");
            }
            
                    
                    
        } while (opcao!= 0);
        
        teclado.close();
    }
    
}
