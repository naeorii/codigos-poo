package sistemahoteleirohashmap;

public abstract class Quarto implements ControleOcupacao {
    private int numero;
    private double valorBaseDiaria;
    private boolean ocupado;

    public Quarto(int numero, double valorBaseDiaria) {
        if (numero <= 0) {
            throw new IllegalArgumentException("O numero do quarto deve ser positivo.");
        }
        if (!Double.isFinite(valorBaseDiaria) || valorBaseDiaria <= 0) {
            throw new IllegalArgumentException("O valor da diaria deve ser positivo.");
        }
        this.numero = numero;
        this.valorBaseDiaria = valorBaseDiaria;
        this.ocupado = false;
    }

    public int getNumero() {
        return numero;
    }

    public double getValorBaseDiaria() {
        return valorBaseDiaria;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    @Override
    public boolean checkIn() {
        if (ocupado) {
            return false;
        }
        ocupado = true;
        return true;
    }

    @Override
    public boolean checkOut() {
        if (!ocupado) {
            return false;
        }
        ocupado = false;
        return true;
    }

    public abstract double calcularDiaria();

    public abstract String getDetalhes();
}
