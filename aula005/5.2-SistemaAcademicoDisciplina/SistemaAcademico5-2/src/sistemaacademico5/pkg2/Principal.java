/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademico5.pkg2;
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
        Scanner teclado = new Scanner(System.in);
        Disciplina disciplina = new Disciplina("POO", "Programacao orientada a objetos", 15);
        int opcao;
        
        do {
            System.out.println("====CONTROLE DE DISCIPLINA====");
            System.out.println("1 - Matricular aluno");
            System.out.println("2 - Registrar notas");
            System.out.println("3 - Consultar aluno");
            System.out.println("4 - Exibir quantidade de alunos");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = teclado.next();
                    System.out.print("Matricula: ");
                    String matricula = teclado.next();
                    boolean matriculou = disciplina.matricular(new Aluno(nome, matricula));
                    System.out.println(matriculou ? "Matricula realizada." : "Matricula recusada.");
                    break;
                case 2:
                    System.out.print("Matricula: ");
                    matricula = teclado.next();
                    Aluno aluno = disciplina.buscar(matricula);
                    if (aluno == null) {
                        System.out.println("Aluno nao encontrado.");
                        break;
                    }
                    System.out.print("Primeira nota: ");
                    double primeiraNota = teclado.nextDouble();
                    boolean registrouPrimeiraNota = aluno.registrarPrimeiraNota(primeiraNota);
                    System.out.println(registrouPrimeiraNota ? "Primeira nota resgistrada." : "Primeira nota invalida.");

                    System.out.print("Segunda nota: ");
                    double segundaNota = teclado.nextDouble();
                    boolean registrouSegundaNota = aluno.registrarSegundaNota(segundaNota);
                    System.out.println(registrouSegundaNota ? "Segunda nota registrada." : "Segunda nota invalida.");
                    break;
                case 3:
                    System.out.print("Matricula: ");
                    matricula = teclado.next();
                    aluno = disciplina.buscar(matricula);
                    if (aluno == null) {
                        System.out.println("Aluno nao encontrado.");
                    } else {
                        System.out.printf("%s | Media: %.1f%n", aluno.getNome(), aluno.calcularMedia());
                    }
                    break;
                case 4:
                    System.out.println("Alunos matriculados: " + disciplina.getQuantidade());
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while ( opcao != 0);
        teclado.close();
    }
    
}
