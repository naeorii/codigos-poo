/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlequartoshotel;

/**
 *
 * @author taian
 */
public class Quarto {
    private int numero;
    private boolean ocupado;
    
    public Quarto(int numero){
        this.numero = numero;
        this.ocupado = false;
    }
    
    public void ocupar() {
        ocupado = true;
    }

    public void liberar() {
        ocupado = false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public int getNumero() {
        return numero;
    } 
    
}
