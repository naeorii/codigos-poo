/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico2;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    private boolean notaValida (double nota) {
        return nota >= 0.0 && nota <= 10.0;
    }
    
    public boolean registrarNota1 (double nota) {
        if (notaValida(nota)) {
            nota1 = nota;
            return true;
        }
        return false;
    }
    
    public boolean registrarNota2(double nota) {
        if (notaValida(nota)) {
            nota2 = nota;
            return true;
        }
        return false;
    }
    
    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }
    
    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }
}
