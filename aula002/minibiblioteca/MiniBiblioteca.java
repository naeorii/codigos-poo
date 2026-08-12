/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minibiblioteca;

/**
 *
 * @author taian
 */
public class MiniBiblioteca {

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setDisponivel(true);
        
        System.out.printf("Livro %s de %s.\n", livro1.getTitulo(), livro1.getAutor());
        livro1.emprestar();
        System.out.println("Disponivel: " +livro1.getDisponivel());
        livro1.emprestar();
        System.out.println("Disponivel: " +livro1.getDisponivel());
        livro1.devolver();
        System.out.println("Disponivel: " +livro1.getDisponivel());
    }
}
