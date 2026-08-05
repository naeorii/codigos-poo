/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propriedadesnumero;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class PropriedadesNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");  
        int numero = entrada.nextInt();
        
        boolean entre10e50 = (numero > 10 && numero < 50);
        boolean foraDoIntervalo = !entre10e50;
        boolean par = numero%2==0;
        boolean positivoPar = numero > 0 && par;
        boolean negativoOuMaiorQueCem = numero < 0 || numero > 100;
        
        System.out.println("Numero informado: " + numero);
        System.out.println("Esta entre 10 e 50? " + entre10e50);
        System.out.println("Esta fora do intervalo? " + foraDoIntervalo);
        System.out.println("Numero eh par? " + par);
        System.out.println("Eh positivo e par? " + positivoPar);
        System.out.println("Negativo ou maior que 100? " + negativoOuMaiorQueCem);
    }
    
}
