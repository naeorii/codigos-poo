/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somadoisnumeros;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SomaDoisNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Entrada de dados
        System.out.print("Numero A: ");
        int a = sc.nextInt();
        System.out.print("Numero B: ");
        int b = sc.nextInt();
        
        //Operador soma e saida de dados
        int soma = a +b;
        System.out.println("Soma = " + soma);
        sc.close();
    }
    
}
