/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author taian
 */
public class Biblioteca {

    private String nome;
    private Livro[] livros;

    private int quantidadeLivros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new Livro[5];
        this.quantidadeLivros = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public boolean cadastrarLivro(Livro livro) {
        if (livro == null) {
            return false;
        }
        
        for (int i = 0; i < quantidadeLivros; i++) {

            if (livros[i].getCodigo() == livro.getCodigo()) {
                return false;
            }
        }
        
        if (quantidadeLivros >= livros.length) {
            return false;
        }
        
        livros[quantidadeLivros] = livro;
        quantidadeLivros++;

        return true;
    }

    public void listarLivros() {

        if (quantidadeLivros == 0) {
            System.out.println("O acervo está vazio.");
            return;
        }

        System.out.println("=== LIVROS DO ACERVO ===");

        for (int i = 0; i < quantidadeLivros; i++) {

            System.out.println("Livro " + (i + 1));

            livros[i].exibirDados();

            System.out.println();
        }
    }

    public void gerarRelatorio(GeradorRelatorio gerador) {
        gerador.gerar(this);
    }
}