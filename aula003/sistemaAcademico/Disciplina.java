/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAcademico;

/**
 *
 * @author Aluno
 */
public class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    
    public Disciplina(String codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        
        if(cargaHoraria > 0) {
            this.cargaHoraria = cargaHoraria;
        }
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getCargaHoraria () {
        return cargaHoraria;
    }
}
