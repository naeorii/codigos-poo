/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversaotemperatura;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ConversaoTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        float temperaturaCelsius = entrada.nextFloat();
        
        float temperaturaFahrenheit = ((temperaturaCelsius * 9) / 5)+ 32;
 
        System.out.printf("A temperatura em Fahrenheit eh: %.2f \n", temperaturaFahrenheit);
        
        boolean maiorQueTrinta = temperaturaCelsius > 30;
        boolean menorQueDez = temperaturaCelsius < 10;
        boolean igualVinte = temperaturaCelsius == 20;
        
        System.out.println("Temperatura em Celsius maior que 30 C? " + maiorQueTrinta);
        System.out.println("Temperatura em Celsius menor que 10 C? " + menorQueDez);
        System.out.println("Temperatura em Celsius igual a 20 C? " + igualVinte);

        
        entrada.close();
    }   
}
