
package sistemaequipamentos;

public abstract class Equipamento {
    private int codigo;
    private String descricao;
    private double valorAquisicao;

    public Equipamento(int codigo, String descricao, double valorAquisicao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorAquisicao = valorAquisicao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorAquisicao() {
        return valorAquisicao;
    }

    public abstract double calcularManutencaoAnual();

    public abstract String getDetalhes();
}
