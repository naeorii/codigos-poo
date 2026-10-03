/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author taian
 */
public class GeradorRelatorio {

    public void gerar(Biblioteca biblioteca) {

        System.out.println("=== RELATORIO DO ACERVO ===");

        System.out.println("Biblioteca: " + biblioteca.getNome());

        System.out.println("Quantidade de livros cadastrados: " + biblioteca.getQuantidadeLivros());
    }
}