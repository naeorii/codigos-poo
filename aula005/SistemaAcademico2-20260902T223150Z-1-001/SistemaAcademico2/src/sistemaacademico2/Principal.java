/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademico2;
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
        Aluno[] alunos = null;
        int quantidade = 0;
        int opcao;
        
        do {
            System.out.println("\n=====SISTEMA ACADEMICO====");
            System.out.println("1 - Definir numero maximo de alunos");
            System.out.println("2 - Cadastrar aluno");
            System.out.println("3 - Listar alunos");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1-> {
                    if (alunos != null) {
                        System.out.println("Quantidade maxima ja definida");
                    } else {
                        System.out.print("Numero maximo de alunos: ");
                        int maximo = teclado.nextInt();
                        
                        while (maximo <= 0) {
                            System.out.print("Digite um valor maior que zero: ");
                            maximo = teclado.nextInt();
                        }
                        
                        alunos = new Aluno[maximo];
                    }
                }
                case 2 -> {
                    if (alunos == null) {
                        System.out.println("Defina primeiro o numero maximo");
                    } else if (quantidade == alunos.length) {
                        System.out.println("Limite de alunos atingido");
                    } else {
                        teclado.nextLine();
                        
                        System.out.print("Nome: ");
                        String nome = teclado.nextLine();
                        System.out.print("Matricula: ");
                        String matricula = teclado.nextLine();
                        
                        Aluno aluno = new Aluno(nome, matricula);
                        
                        System.out.print("Nota 1: ");
                        double nota1 = teclado.nextDouble();
                        while (!aluno.registrarNota1(nota1)) {
                            System.out.print("Nota invalida. Digite novamente.");
                            nota1 = teclado.nextDouble();
                        }
                        
                        System.out.print("Nota 2: ");
                        double nota2 = teclado.nextDouble();
                        while (!aluno.registrarNota2(nota2)) {
                            System.out.print("Nota invalida. Digite novamente.");
                            nota2 = teclado.nextDouble();
                        }
                        
                        alunos[quantidade] = aluno;
                        quantidade++;
                        System.out.println("Aluno cadastrado.");
                    }
                }
                case 3 -> {
                    if (quantidade ==0) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (int i =0; i < quantidade; i++) {
                            System.out.printf("%d - %s |%s | Media: %.2f | %s%n",
                            i + 1,
                            alunos[i].getNome(),
                            alunos[i].getMatricula(),
                            alunos[i].calcularMedia(),
                            alunos[i].estaAprovado() ? "Aprovado" : "Recuperacao");
                        }
                    }
                }
                
                case 0 -> System.out.println("Programa encerrado.");
                default -> System.out.println("OPcao invalida.");
            }
                
                
        } while ( opcao != 0);
        
        teclado.close();
    }
    
}
