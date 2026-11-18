package sistemahoteleirohashmap;

import java.util.Locale;

public class Luxo extends Quarto {
    private boolean possuiArCondicionado;
    private boolean possuiBanheira;

    public Luxo(int numero, double valorBaseDiaria,
                boolean possuiArCondicionado, boolean possuiBanheira) {
        super(numero, valorBaseDiaria);
        this.possuiArCondicionado = possuiArCondicionado;
        this.possuiBanheira = possuiBanheira;
    }

    public boolean isPossuiArCondicionado() {
        return possuiArCondicionado;
    }

    public boolean isPossuiBanheira() {
        return possuiBanheira;
    }

    @Override
    public double calcularDiaria() {
        return getValorBaseDiaria() * 1.20;
    }

    @Override
    public String getDetalhes() {
        return "Tipo: Luxo | Numero: " + getNumero()
                + " | Diaria: R$ " + String.format(Locale.forLanguageTag("pt-BR"), "%.2f", calcularDiaria())
                + " | Situacao: " + (isOcupado() ? "Ocupado" : "Disponivel")
                + " | Ar-condicionado: " + (possuiArCondicionado ? "Sim" : "Nao")
                + " | Banheira: " + (possuiBanheira ? "Sim" : "Nao");
    }
}
