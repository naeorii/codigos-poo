
package sistemaequipamentos;

import java.util.Locale;

public class Impressora extends Equipamento {
    private String tecnologia;
    private int paginasPorMinuto;

    public Impressora(int codigo, String descricao, double valorAquisicao,
                     String tecnologia, int paginasPorMinuto) {
        super(codigo, descricao, valorAquisicao);
        this.tecnologia = tecnologia;
        this.paginasPorMinuto = paginasPorMinuto;
    }

    @Override
    public double calcularManutencaoAnual() {
        return getValorAquisicao() * 0.12;
    }

    @Override
    public String getDetalhes() {
        return String.format(Locale.forLanguageTag("pt-BR"),
                "Categoria: Impressora%n"
                + "Codigo: %d%n"
                + "Descricao: %s%n"
                + "Tecnologia: %s%n"
                + "Paginas por minuto: %d%n"
                + "Valor de aquisicao: R$ %,.2f%n"
                + "Manutencao anual: R$ %,.2f",
                getCodigo(), getDescricao(), tecnologia, paginasPorMinuto,
                getValorAquisicao(), calcularManutencaoAnual());
    }
}
