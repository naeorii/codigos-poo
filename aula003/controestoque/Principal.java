/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controestoque;
import java.util.Scanner;
/**
 *
 * @author taian
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o codigo do primeiro produto: ");
        String codigo = teclado.nextLine();
        System.out.println("Digite o nome do primeiro produto: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o preco do primeiro produto: ");
        double preco = teclado.nextDouble();
        System.out.println("Digite a quantidade do primeiro produto: ");
        int quantidade = teclado.nextInt();
        teclado.nextLine();
        
        Produto produto1 = new Produto(codigo, nome, preco, quantidade);
        
        System.out.println("Digite o codigo do segundo produto: ");
        codigo = teclado.nextLine();
        System.out.println("Digite o nome do segundo produto: ");
        nome = teclado.nextLine();
        System.out.println("Digite o preco do segundo produto: ");
        preco = teclado.nextDouble();
        System.out.println("Digite a quantidade do segundo produto: ");
        quantidade = teclado.nextInt();
        
        Produto produto2 = new Produto(codigo, nome, preco, quantidade);
        
        System.out.println("== PRODUTO 1 == ");
        System.out.println("Insira uma quantidade para venda: ");
        quantidade = teclado.nextInt();
                
        if (produto1.vender(quantidade)) {
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Venda nao realizada por quantidade invalida ou estoque insuficiente.");
        }
        
        System.out.println("== PRODUTO 2 == ");
        System.out.println("Insira uma quantidade para reposicao : ");
        quantidade = teclado.nextInt();
        produto2.reporEstoque(quantidade);
        
       System.out.printf("===============================\n"
                        + "     DADOS DOS PRODUTOS     \n"
                        + "================================\n"
               + "Codigo %s | Nome: %s | Preco: R$ .2f | Quantidade: %d | Valor em estoque: R$: %.2f\n"
               + "Codigo %s | Nome: %s | Preco: R$ %.2f | Quantidade: %d | Valor em estoque: R$: %.2f", produto1.getCodigo(), produto1.getNome(), produto1.getPreco(), produto1.getEstoque(), produto1.calcularValorEstoque(), produto2.getCodigo(), produto2.getNome(), produto2.getPreco(), produto2.getEstoque(), produto2.calcularValorEstoque());
    }
}
