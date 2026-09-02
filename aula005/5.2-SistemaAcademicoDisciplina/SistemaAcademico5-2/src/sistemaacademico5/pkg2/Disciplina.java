/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico5.pkg2;

/**
 *
 * @author Aluno
 */
public class Disciplina {
    private String codigo;
    private String nome;
    private Aluno[] alunos;
    private int quantidade;
    
    public Disciplina(String codigo, String nome, int capacidade) {
        this.codigo = codigo;
        this.nome = nome;
        alunos = new Aluno[capacidade];
    }
    
    public boolean matricular(Aluno aluno) {
        if (aluno == null || quantidade == alunos.length) {
            return false;
        }
        
        for (int indice = 0; indice < quantidade; indice++) {
            if (alunos[indice].getMatricula().equals(aluno.getMatricula())) {
                return false;
            }
        }
        
        alunos[quantidade] = aluno;
        quantidade++;
        return true;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public Aluno buscar(String matricula) {
        for(int indice = 0; indice < quantidade; indice ++) {
            if (alunos[indice].getMatricula().equals(matricula)) {
                return alunos[indice];
            }
        }
        return null;
    }
}
