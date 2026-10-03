/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author taian
 */
public class Livro {

    private int codigo;
    private String titulo;
    private String autor;

    public Livro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirDados() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
