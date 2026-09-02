/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico5.pkg2;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String nome;
    private String matricula;
    private double primeiraNota;
    private double segundaNota;
    
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public boolean registrarPrimeiraNota (double nota) {
        if (primeiraNota < 0 || primeiraNota > 10) {
            return false;
        }
        this.primeiraNota = nota;
        return true;
    }
    
    public boolean registrarSegundaNota (double nota) {
        if (segundaNota < 0 || segundaNota > 10) {
            return false;
        }
        this.segundaNota = nota;
        return true;
    }
    
     public String getNome() {
        return nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public double calcularMedia() {
        return (primeiraNota + segundaNota) / 2;
    }
    
    public boolean estaAprovado() {
        return calcularMedia() <= 7.0;
    }
}
