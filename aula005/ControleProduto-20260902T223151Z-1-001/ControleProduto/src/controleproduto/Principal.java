/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controleproduto;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto();
        int opcao;
        do {
            System.out.println("====Controle de Estoque====");
            System.out.printf("Preco: R$ %.2f%n", produto.getPreco());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("============================");
            System.out.println("1 - Alterar preco");
            System.out.println("2 - Repor");
            System.out.println("3 - Vender");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                   System.out.println("Novo preco: ");
                   if (produto.alterarPreco(teclado.nextDouble())) {
                       System.out.println("Preco alterado.");
                   } else {
                       System.out.println("Preco ivalido");
                   }
                   break;
                case 2:
                    System.out.println("Quantidade reposta: ");
                    if (produto.reporEstoque(teclado.nextInt())) {
                        System.out.println("Estoque reposto");
                    } else {
                        System.out.println("Quantidade invalida");
                    }
                    break;
                case 3:
                    System.out.println("Quantidade vendida: ");
                    if (produto.vender(teclado.nextInt())) {
                        System.out.println("Venda realizada.");
                    } else {
                        System.out.println("Quantidade invalida ou estoque insuficiente");
                    }
                    break;
            }
        } while (opcao!= 0);
        
        teclado.close();
    }
    
}
