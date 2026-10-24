
package sistemaequipamentos;

import java.util.Locale;

public class Computador extends Equipamento {
    private int memoriaGB;
    private String processador;

    public Computador(int codigo, String descricao, double valorAquisicao,
                      int memoriaGB, String processador) {
        super(codigo, descricao, valorAquisicao);
        this.memoriaGB = memoriaGB;
        this.processador = processador;
    }

    @Override
    public double calcularManutencaoAnual() {
        return getValorAquisicao() * 0.08;
    }

    @Override
    public String getDetalhes() {
        return String.format(Locale.forLanguageTag("pt-BR"),
                "Categoria: Computador%n"
                + "Codigo: %d%n"
                + "Descricao: %s%n"
                + "Memoria RAM: %d GB%n"
                + "Processador: %s%n"
                + "Valor de aquisicao: R$ %,.2f%n"
                + "Manutencao anual: R$ %,.2f",
                getCodigo(), getDescricao(), memoriaGB, processador,
                getValorAquisicao(), calcularManutencaoAnual());
    }
}
