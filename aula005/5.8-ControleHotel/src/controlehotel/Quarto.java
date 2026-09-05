package controlehotel;

public class Quarto {
    private int numero;
    private boolean ocupado;

    public Quarto (int numero) {
        this.numero = numero;
    }

    public boolean ocupar () {
        if (ocupado) {
            return false;
        }
        ocupado = true;
        return true;

    }

    public boolean liberar () {
        if (!ocupado) {
            return false;
        }
        ocupado = false;
        return true;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }
}
