/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atualizacaosaldo;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtualizacaoSaldo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Saldo inicial: ");
        float saldoInicial = entrada.nextFloat();
        System.out.print("Valor do deposito: ");
        float valorDeposito = entrada.nextFloat();
        System.out.print("Valor do saque: ");
        float valorSaque = entrada.nextFloat();
        
        float saldo = saldoInicial;
        saldo += valorDeposito;
        saldo -= valorSaque;
        saldo *= 0.02;
        
        System.out.printf("Saldo inicial: %.2f\n", saldoInicial);
        System.out.printf("Saldo final: %.2f\n", saldo);
        
        boolean saldoFinalMaior = saldo > saldoInicial;
        System.out.println("Saldo final eh maior que o saldo inicial? " + saldoFinalMaior);

        
        
    }
    
}
