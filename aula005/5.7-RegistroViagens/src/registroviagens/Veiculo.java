package registroviagens;

public class Veiculo {
    private String modelo;
    private double quilometragem;

    public Veiculo(String modelo, double quilometragem) {
        this.modelo = modelo;
        if (quilometragem > 0) {
            this.quilometragem = quilometragem;
        }
    }

    public boolean viajar(double distancia) {
        if (distancia <= 0) {
            return false;
        }
        this.quilometragem += distancia;
        return true;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getQuilometragem() {
        return this.quilometragem;
    }
}
