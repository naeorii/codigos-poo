/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controestoque;

/**
 *
 * @author taian
 */
public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private int estoque;
    
    
    public Produto(String codigo, String nome, double preco, int estoque){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public int getEstoque(){
        return estoque;
    }
    
    public void reporEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
        } else {
            System.out.println("Nao e possivel adicionar esta quantidade ao estoque");
        }
    }
    
    public boolean vender(int quantidade){
        if (quantidade > 0 && quantidade <= estoque) {
            this.estoque -= quantidade;
            return true;
        } else {
            return false;
        }
    }
    
    public double calcularValorEstoque(){
        return this.preco*this.estoque;
    }
}
