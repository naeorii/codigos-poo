/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapedidos;

public class Pedido {

    private int numero;
    private double valorProdutos;
    private Cliente cliente;

    public Pedido(int numero, double valorProdutos, Cliente cliente) {
        this.numero = numero;
        this.valorProdutos = valorProdutos;
        this.cliente = cliente;
    }

    public double calcularValorFinal(CalculadoraFrete calculadoraFrete) {
        double frete = calculadoraFrete.calcularFrete(valorProdutos);
        return valorProdutos + frete;
    }

    public int getNumero() {
        return numero;
    }

    public double getValorProdutos() {
        return valorProdutos;
    }

    public Cliente getCliente() {
        return cliente;
    }
}