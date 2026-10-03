/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapedidos;

public class CalculadoraFrete {

    public double calcularFrete(double valorProdutos) {

        if (valorProdutos < 200.0) {
            return 25.0;
        }

        return 0.0;
    }
}
