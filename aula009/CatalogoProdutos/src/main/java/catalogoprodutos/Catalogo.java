package catalogoprodutos;

import java.util.ArrayList;

/** Encapsula a lista de produtos e as regras de consulta. */
public class Catalogo {

    private ArrayList<Produto> produtos;

    public Catalogo() {
        produtos = new ArrayList<>();
    }

    public boolean cadastrar(Produto p) {
        if (p == null || !p.codigoValido()
                || p.getDescricao().isBlank()) {
            return false;
        }

        // Nao permite codigos duplicados depois da normalizacao.
        for (Produto produto : produtos) {
            if (produto.getCodigo().equalsIgnoreCase(p.getCodigo())) {
                return false;
            }
        }

        produtos.add(p);
        return true;
    }

    public Produto buscar(String codigo) {
        String codigoPesquisado = Produto.normalizarCodigo(codigo);
        if (codigoPesquisado.isBlank()) {
            return null;
        }

        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigoPesquisado)) {
                return produto;
            }
        }
        return null;
    }

    public void listarCategoria(String prefixo) {
        String categoria = Produto.normalizarCodigo(prefixo);
        if (categoria.isBlank()) {
            System.out.println("Informe uma categoria ou prefixo valido.");
            return;
        }

        boolean encontrou = false;
        System.out.println("\n===== PRODUTOS DA CATEGORIA =====");
        for (Produto produto : produtos) {
            // startsWith() permite filtrar pelo inicio da categoria.
            if (produto.getCodigo().startsWith(categoria)) {
                produto.exibir();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum produto encontrado nessa categoria.");
        }
    }
}
