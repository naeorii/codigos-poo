
package sistemaequipamentos;

import java.util.Locale;

public class Projetor extends Equipamento {
    private String resolucao;
    private int luminosidadeLumens;

    public Projetor(int codigo, String descricao, double valorAquisicao,
                   String resolucao, int luminosidadeLumens) {
        super(codigo, descricao, valorAquisicao);
        this.resolucao = resolucao;
        this.luminosidadeLumens = luminosidadeLumens;
    }

    @Override
    public double calcularManutencaoAnual() {
        return getValorAquisicao() * 0.10;
    }

    @Override
    public String getDetalhes() {
        return String.format(Locale.forLanguageTag("pt-BR"),
                "Categoria: Projetor%n"
                + "Codigo: %d%n"
                + "Descricao: %s%n"
                + "Resolucao: %s%n"
                + "Luminosidade: %d lumens%n"
                + "Valor de aquisicao: R$ %,.2f%n"
                + "Manutencao anual: R$ %,.2f",
                getCodigo(), getDescricao(), resolucao, luminosidadeLumens,
                getValorAquisicao(), calcularManutencaoAnual());
    }
}
