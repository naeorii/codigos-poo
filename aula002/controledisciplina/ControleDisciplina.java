/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controledisciplina;

/**
 *
 * @author aluno
 */
public class ControleDisciplina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina();
        
        disciplina1.setNome("Programacao orientada a objetos");
        disciplina1.setCodigo("ufsm00001");
        disciplina1.setMediaMinima(7);
        disciplina1.setCargaHoraria(60);
        
        double mediaAluno = 8;
        
        System.out.printf("Disciplina de %s com a carga horaria de %d\n", disciplina1.getNome(), disciplina1.getCargaHoraria());
        System.out.println("O aluno foi aprovado? " + disciplina1.verificarAprovacao(mediaAluno));
    }
    
}
