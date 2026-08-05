/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacoesdoisnumerosinteiros;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class OperacoesDoisNumerosInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero inteiro: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo numero inteiro (diferente de zero): ");
        int b = sc.nextInt();
        
        //soma
        int soma = a + b;
        //subtração
        int sub = a - b;
        //multiplicação
        int multi = a * b;
        //divisão
        int divInteira = a / b;
        //divisão ponto flutuante
        float divPontoFlutuante = (float) a / b;
        
        System.out.println("Soma = " +  soma);
        System.out.println("Subtracao = " + sub);
        System.out.println("Multiplicacao = " + multi);
        System.out.println("Divisao inteira = " + divInteira);
        System.out.println("Divisao com ponto flutuante = " + divPontoFlutuante);
        
        sc.close();
        


    }
    
}
