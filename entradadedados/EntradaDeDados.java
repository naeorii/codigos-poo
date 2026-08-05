/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradadedados;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class EntradaDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Seu nome: ");
       String nome = sc.nextLine();
       
       System.out.print("Sua idade: ");
       int idade = sc.nextInt();
       
       sc.close();
    }
    
}
