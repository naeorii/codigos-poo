/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controledisciplina;

/**
 *
 * @author aluno
 */
public class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private double mediaMinima;
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCargaHoraria () {
        return cargaHoraria;
    }
    
    public void setCargaHoraria (int cargaHoraria) {
        if ( cargaHoraria > 0){
            this.cargaHoraria = cargaHoraria;
        }
    }
    
    public double getMediaMinima(){
        return mediaMinima;
    }
    
    public void setMediaMinima (double mediaMinima) {
        if(mediaMinima >=0 && mediaMinima <= 10){
            this.mediaMinima = mediaMinima;
        }
    }
    
    public boolean verificarAprovacao(double mediaAluno) {
        return mediaAluno >= mediaMinima;
    }
    
    

}
