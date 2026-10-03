/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemapedidos;

/**
 *
 * @author taian
 */
public class Principal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Taiana", "123.456.789-00");
        CalculadoraFrete calculadora = new CalculadoraFrete();
        
        Pedido pedido1 = new Pedido(1, 150.0, cliente);
        Pedido pedido2 = new Pedido(2, 250.0, cliente);

        System.out.println("=== PEDIDO 1 ===");
        System.out.println("Numero: " + pedido1.getNumero());
        System.out.println("Cliente: " + pedido1.getCliente().getNome());
        System.out.println("CPF: " + pedido1.getCliente().getCpf());
        System.out.println("Valor dos produtos: R$ " + pedido1.getValorProdutos());
        System.out.println("Valor final: R$ " + pedido1.calcularValorFinal(calculadora));

        System.out.println();

        System.out.println("=== PEDIDO 2 ===");
        System.out.println("Numero: " + pedido2.getNumero());
        System.out.println("Cliente: " + pedido2.getCliente().getNome());
        System.out.println("CPF: " + pedido2.getCliente().getCpf());
        System.out.println("Valor dos produtos: R$ " + pedido2.getValorProdutos());
        System.out.println("Valor final: R$ " + pedido2.calcularValorFinal(calculadora));
    }
}
