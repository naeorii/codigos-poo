/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleproduto;

/**
 *
 * @author taian
 */
public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    
    public Produto (String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public void reporEstoque(int quantidade) {
        this.estoque += quantidade;
    }
    
    public void vender(int quantidade) {
        this.estoque -= quantidade;
    }
    
    public int getEstoque() {
        return estoque;
    }
    
    public double calcularValorEstoque() {
        return preco*estoque;
    }
}
