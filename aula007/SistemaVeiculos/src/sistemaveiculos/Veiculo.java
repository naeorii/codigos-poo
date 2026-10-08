/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaveiculos;

/**
 *
 * @author taian
 */
public class Veiculo {
    private String placa;
    private String modelo;
    
    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public String getModelo() {
        return modelo;
    }
}
