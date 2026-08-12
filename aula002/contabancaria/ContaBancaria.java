/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta conta1 = new Conta();
        conta1.setTitular("Ana");
        conta1.setNumero("12345");
                       
        System.out.printf("Digite o valor a ser depositado: ");
        double valor1 = entrada.nextDouble();
        conta1.depositar(valor1);
        
        System.out.printf("Digite o valor a ser depositado: ");
        double valor2 = entrada.nextDouble();
        conta1.depositar(valor2);
        
        System.out.printf("Digite o valor a ser sacado: ");
        double valor3 = entrada.nextDouble();
        conta1.sacar(valor3);
        
        
        System.out.println("O saldo final eh: " + conta1.getSaldo());
        
        
    }
    
}
