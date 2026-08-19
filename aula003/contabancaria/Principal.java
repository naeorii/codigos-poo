/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;
import java.util.Scanner;

/**
 *
 * @author taian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ContaBancaria conta1 = new ContaBancaria("Taiana", "047484");
        ContaBancaria conta2 = new ContaBancaria("Renan", "346264");
        
        System.out.println("Insira um valor para deposito na conta1: ");
        double valor = teclado.nextDouble();
        conta1.depositar(valor);
        System.out.println("Saldo da conta1: " + conta1.getSaldo());
        
        System.out.println("Insira um valor para deposito na conta2: ");
        valor = teclado.nextDouble();
        conta2.depositar(valor);
        System.out.println("Saldo da conta2: " + conta2.getSaldo());
        
        System.out.println("Insira um valor para sacar na conta1: ");
        valor = teclado.nextDouble();
        conta1.sacar(valor);
        System.out.println("Saldo da conta1: " + conta1.getSaldo());
        
        System.out.println("Insira um valor para transferencia: ");
        valor = teclado.nextDouble();
        conta1.transferir(conta2, valor);
        System.out.println("Saldo da conta1: " + conta1.getSaldo());
        System.out.println("Saldo da conta2: " + conta2.getSaldo());
        
        
    }
    
}
