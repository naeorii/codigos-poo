package sistemahoteleirohashmap;

import java.util.Locale;

public class Simples extends Quarto {
    private boolean possuiVentilador;
    private boolean possuiTV;

    public Simples(int numero, double valorBaseDiaria,
                   boolean possuiVentilador, boolean possuiTV) {
        super(numero, valorBaseDiaria);
        this.possuiVentilador = possuiVentilador;
        this.possuiTV = possuiTV;
    }

    public boolean isPossuiVentilador() {
        return possuiVentilador;
    }

    public boolean isPossuiTV() {
        return possuiTV;
    }

    @Override
    public double calcularDiaria() {
        return getValorBaseDiaria();
    }

    @Override
    public String getDetalhes() {
        return "Tipo: Simples | Numero: " + getNumero()
                + " | Diaria: R$ " + String.format(Locale.forLanguageTag("pt-BR"), "%.2f", calcularDiaria())
                + " | Situacao: " + (isOcupado() ? "Ocupado" : "Disponivel")
                + " | Ventilador: " + (possuiVentilador ? "Sim" : "Nao")
                + " | TV: " + (possuiTV ? "Sim" : "Nao");
    }
}
