/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaduasnotas;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class MediaDuasNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        
        double media = (nota1 + nota2)/2;
        System.out.println("Media aritmetica: " + media);
        
        boolean mediaMaiorOuIgualSete = (media >= 7);
        boolean mediaMenorQueSete = (media < 7);
        boolean mediaIgualDez = (media ==10);
        
        System.out.println("Media maior ou igual a 7,0? " + mediaMaiorOuIgualSete);
        System.out.println("Media menor que 7,0? " + mediaMenorQueSete);
        System.out.println("Media igual a 10,0? " + mediaIgualDez);

        close.entrada();
        
    }
    
}
