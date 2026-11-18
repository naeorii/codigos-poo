package sistemahoteleirohashmap;

import java.util.Locale;

public class SuperLuxo extends Quarto {
    private boolean possuiHidromassagem;
    private boolean possuiVistaPanoramica;

    public SuperLuxo(int numero, double valorBaseDiaria,
                     boolean possuiHidromassagem, boolean possuiVistaPanoramica) {
        super(numero, valorBaseDiaria);
        this.possuiHidromassagem = possuiHidromassagem;
        this.possuiVistaPanoramica = possuiVistaPanoramica;
    }

    public boolean isPossuiHidromassagem() {
        return possuiHidromassagem;
    }

    public boolean isPossuiVistaPanoramica() {
        return possuiVistaPanoramica;
    }

    @Override
    public double calcularDiaria() {
        return getValorBaseDiaria() * 1.40;
    }

    @Override
    public String getDetalhes() {
        return "Tipo: SuperLuxo | Numero: " + getNumero()
                + " | Diaria: R$ " + String.format(Locale.forLanguageTag("pt-BR"), "%.2f", calcularDiaria())
                + " | Situacao: " + (isOcupado() ? "Ocupado" : "Disponivel")
                + " | Hidromassagem: " + (possuiHidromassagem ? "Sim" : "Nao")
                + " | Vista panoramica: " + (possuiVistaPanoramica ? "Sim" : "Nao");
    }
}
