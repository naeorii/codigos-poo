/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author taian
 */
public class Principal {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Universitaria");

        Livro livro1 = new Livro(101, "Programacaoo Orientada a Objetos", "Joao");

        Livro livro2 = new Livro(102, "Banco de Dados", "Maria");

        Livro livro3 = new Livro( 103, "Sistemas Distribuidos","Carlos");

        boolean cadastro1 = biblioteca.cadastrarLivro(livro1);
        boolean cadastro2 = biblioteca.cadastrarLivro(livro2);
        boolean cadastro3 = biblioteca.cadastrarLivro(livro3);

        System.out.println("Cadastro do livro 1: " + cadastro1);
        System.out.println("Cadastro do livro 2: " + cadastro2);
        System.out.println("Cadastro do livro 3: " + cadastro3);

        System.out.println();
        biblioteca.listarLivros();
        GeradorRelatorio gerador = new GeradorRelatorio();
        biblioteca.gerarRelatorio(gerador);
        System.out.println();

        System.out.println("=== TENTATIVA DE CODIGO DUPLICADO ===");
        Livro livroDuplicado = new Livro(102, "Outro Livro", "Outro Autor");

        boolean cadastroDuplicado = biblioteca.cadastrarLivro(livroDuplicado);

        if (cadastroDuplicado) {
            System.out.println("Livro cadastrado.");
        } else {
            System.out.println("Cadastro nao realizado: codigo ja cadastrado.");
        }

        System.out.println("Quantidade de livros: "  + biblioteca.getQuantidadeLivros());
    }
}
    

