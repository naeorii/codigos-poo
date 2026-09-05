package controlehotel;

public class Hotel {
    private String nome;
    private Quarto[] quartos;
    private int quantidade;

    public Hotel(String nome, int capacidade) {
        this.nome = nome;
        quartos = new Quarto[capacidade];
    }

    public boolean adicionarQuarto(Quarto quarto) {
        if (quarto == null || quantidade == quartos.length || buscarQuarto(quarto.getNumero()) != null) {
            return false;
        }
        quartos[quantidade] = quarto;
        quantidade++;
        return true;
    }

    public Quarto buscarQuarto (int numero) {
        for (int indice = 0; indice < quantidade; indice++) {
            if(quartos[indice].getNumero() == numero) {
                return quartos[indice];
            }
        }
        return null;
    }

    public boolean ocuparQuarto(int numero) {
        Quarto quartoEncontrado = buscarQuarto(numero);
        return quartoEncontrado != null && quartoEncontrado.ocupar();
    }

    public boolean liberarQuarto (int numero) {
        Quarto quartoEncontrado = buscarQuarto(numero);
        return quartoEncontrado != null && quartoEncontrado.liberar();
    }

    public int contarLivres() {
        int contador = 0;

        for(int indice = 0; indice < quantidade; indice++){
            if(!quartos[indice].isOcupado()) {
                contador++;
            }
        }

        return contador;
    }

    public int contarOcupados () {
        return quantidade - contarLivres();
    }

    public String getNome () {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
