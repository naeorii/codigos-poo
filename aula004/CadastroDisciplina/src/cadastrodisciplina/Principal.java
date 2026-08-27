/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastrodisciplina;
import java.util.Scanner;
/**
 *
 * @author taian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== CADASTRO DE DISCIPLINA ===");
        System.out.print("Nome da disciplina: ");
        String nome = teclado.nextLine();
        System.out.print("Codigo da disciplina: ");
        String codigo = teclado.nextLine();
        System.out.print("Carga horaria: ");
        int cargaHoraria = teclado.nextInt();
        
        while(cargaHoraria<=0) {
            System.out.print("Carga horaria invalida, digite novamente: ");
            cargaHoraria = teclado.nextInt();
        }
        
        Disciplina disciplina1 = new Disciplina(codigo, nome, cargaHoraria);
        
        
        System.out.println("\n===DISCIPLINA CADASTRADA===");
        System.out.println("Nome: " + disciplina1.getNome());
        System.out.println("Codigo: " + disciplina1.getCodigo());
        System.out.println("Carga horaria: " + disciplina1.getCargaHoraria());
       
    }
    
}
