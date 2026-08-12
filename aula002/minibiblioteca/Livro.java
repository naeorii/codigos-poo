/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minibiblioteca;

/**
 *
 * @author taian
 */
public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public boolean getDisponivel() {
        return disponivel;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        }
        else {
            System.out.println("Livro nao disponivel");
        }
    }
    
    public void devolver() {
        this.disponivel = true;
    }
}


