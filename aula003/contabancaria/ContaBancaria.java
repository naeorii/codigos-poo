/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;

/**
 *
 * @author taian
 */
public class ContaBancaria {
    private String titular;
    private String numero;
    private double saldo;
    
    public ContaBancaria(String titular, String numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        if (valor > 0){
            this.saldo += valor;
        }
        else {
            System.out.println("Valor nao aceito.");
        }
        
    }
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor nao aceito.");
        }
            }
    
    public void transferir(ContaBancaria destino, double valor) {
        if (valor <= saldo){
        this.saldo -= valor;
        destino.depositar(valor);
        } else {
            System.out.println("Nao e possivel transferir este valor.");
        }
    }
    
     
    
}
