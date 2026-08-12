/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author aluno
 */
public class Conta {
    private String titular;
    private String numero;
    private double saldo;
    

    public String getTitular() {
        return titular;
    }
    
    public void setTitular (String titular) {
        this.titular = titular;
    }
    
    public String getNumero () {
        return numero;
    }
    
    public void setNumero (String numero) {
        this.numero = numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;            
    }
    
    public boolean sacar(double valor) {
        if(valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
