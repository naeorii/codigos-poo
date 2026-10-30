package catalogoprodutos;

import java.util.Locale;

/** Produto identificado pelo codigo CATEGORIA-NUMERO. */
public class Produto {

    private String codigo;
    private String descricao;

    public Produto(String codigo, String descricao) {
        this.codigo = normalizarCodigo(codigo);
        this.descricao = descricao == null ? "" : descricao.strip();
    }

    /**
     * Padroniza o codigo antes do cadastro e da pesquisa.
     * Exemplo: " livro - 105 " se torna "LIVRO-105".
     */
    public static String normalizarCodigo(String codigo) {
        if (codigo == null) {
            return "";
        }
        return codigo.strip()
                .toUpperCase(Locale.ROOT)
                .replace(" ", "")
                .replace("\t", "");
    }

    /**
     * Exige exatamente um hifen, categoria nao vazia
     * e numero composto exclusivamente por digitos.
     */
    public boolean codigoValido() {
        int hifen = codigo.indexOf('-');
        if (hifen <= 0 || hifen == codigo.length() - 1) {
            return false;
        }
        if (codigo.indexOf('-', hifen + 1) >= 0) {
            return false;
        }

        String categoria = codigo.substring(0, hifen);
        String numero = codigo.substring(hifen + 1);
        return !categoria.isBlank() && numero.matches("[0-9]+");
    }

    public void exibir() {
        System.out.println("Codigo: " + codigo
                + " | Descricao: " + descricao);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
