/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaveiculos;

/**
 *
 * @author taian
 */
public class Carro extends Veiculo {
    private int quantidadePortas;
    
    public Carro(String placa, String modelo, int quantidadePortas) {
        super(placa, modelo);
        this.quantidadePortas = quantidadePortas;
    }
    
    public int getQuantidadePortas() {
        return quantidadePortas;
    }
}
