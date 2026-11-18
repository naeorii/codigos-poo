package sistemahoteleirohashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class SistemaHoteleiro {
    private HashMap<Integer, Quarto> quartos;

    public SistemaHoteleiro() {
        quartos = new HashMap<>();
    }

    // Insere um novo quarto apenas se seu numero ainda nao estiver cadastrado.
    public boolean cadastrar(Quarto quarto) {
        if (quarto == null || quartos.containsKey(quarto.getNumero())) {
            return false;
        }
        quartos.put(quarto.getNumero(), quarto);
        return true;
    }

    // Localiza o quarto pelo numero (chave do HashMap).
    public Quarto buscar(int numero) {
        return quartos.get(numero);
    }

    // Um quarto ocupado nao pode ser removido do sistema.
    public boolean remover(int numero) {
        Quarto quarto = quartos.get(numero);
        if (quarto == null || quarto.isOcupado()) {
            return false;
        }
        quartos.remove(numero);
        return true;
    }

    public ArrayList<Quarto> listarTodos() {
        ArrayList<Quarto> lista = new ArrayList<>();
        for (Quarto quarto : quartos.values()) {
            lista.add(quarto);
        }
        return lista;
    }

    public ArrayList<Quarto> listarOcupados() {
        ArrayList<Quarto> lista = new ArrayList<>();
        for (Quarto quarto : quartos.values()) {
            if (quarto.isOcupado()) {
                lista.add(quarto);
            }
        }
        return lista;
    }

    public ArrayList<Quarto> listarDisponiveis() {
        ArrayList<Quarto> lista = new ArrayList<>();
        for (Quarto quarto : quartos.values()) {
            if (!quarto.isOcupado()) {
                lista.add(quarto);
            }
        }
        return lista;
    }

    public boolean checkIn(int numero) {
        Quarto quarto = buscar(numero);
        return quarto != null && quarto.checkIn();
    }

    // Retorna o total a pagar ou -1 quando nao for possivel fazer check-out.
    // So libera o quarto apos validar a quantidade de diarias.
    public double checkOut(int numero, int quantidadeDiarias) {
        Quarto quarto = buscar(numero);
        if (quarto == null || !quarto.isOcupado() || quantidadeDiarias <= 0) {
            return -1;
        }

        double total = quarto.calcularDiaria() * quantidadeDiarias;
        if (quarto.checkOut()) {
            return total;
        }
        return -1;
    }

    public int contarOcupados() {
        int contador = 0;
        for (Quarto quarto : quartos.values()) {
            if (quarto.isOcupado()) {
                contador++;
            }
        }
        return contador;
    }

    public int totalQuartos() {
        return quartos.size();
    }

    public int contarDisponiveis() {
        return totalQuartos() - contarOcupados();
    }
}
