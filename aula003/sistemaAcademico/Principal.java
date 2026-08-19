/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaAcademico;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        Disciplina disciplina1;
        Disciplina disciplina2;
        
        System.out.println("=== CADASTRO DA DISCIPLINA 1 ===");
        disciplina1 = new Disciplina("POO101", "Programacao Orientada a Objetos", 60);
        System.out.println();
        
        System.out.println("=== CADASTRO DA DISCIPLINA 2 ===");
        System.out.println("Digite o codigo: ");
        String codigo2 = teclado.nextLine();
        System.out.println("Digite o nome: ");
        String nome2 = teclado.nextLine();
        System.out.println("Digite a carga horaria: ");
        int cargaHoraria2 = teclado.nextInt();
        disciplina2 = new Disciplina(codigo2, nome2, cargaHoraria2);
        
        System.out.println();
        System.out.println("===============================");
        System.out.println("  DISCIPLINAS CADASTRADAS ");
        System.out.println("===============================");
        
        System.out.println();
        System.out.println("=== DISCIPLINA 1 ===");
        System.out.println("Codigo: " + disciplina1.getCodigo());
        System.out.println("Nome: " + disciplina1.getNome());
        System.out.println("Carga horaria: " + disciplina1.getCargaHoraria() + " horas");
        
        System.out.println();
        
        System.out.println();
        System.out.println("=== DISCIPLINA 2 ===");
        System.out.println("Codigo: " + disciplina2.getCodigo());
        System.out.println("Nome: " + disciplina2.getNome());
        System.out.println("Carga horaria: " + disciplina2.getCargaHoraria() + " horas");
        
        teclado.close();
    }
    
}
