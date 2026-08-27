/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlequartoshotel;
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

        System.out.print("Numero do quarto: ");
        int numero = teclado.nextInt();

        Quarto quarto = new Quarto(numero);

        int opcao;

        do {

            System.out.println("\n=== CONTROLE DO QUARTO ===");
            System.out.println("1 - Ocupar");
            System.out.println("2 - Liberar");
            System.out.println("3 - Consultar situacao");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {

                case 1 -> {
                    quarto.ocupar();
                    System.out.println("Quarto ocupado.");
                }

                case 2 -> {
                    quarto.liberar();
                    System.out.println("Quarto liberado.");
                }

                case 3 -> {
                    if (quarto.isOcupado()) {
                        System.out.println("O quarto esta ocupado.");
                    } else {
                        System.out.println("O quarto esta livre.");
                    }
                }

                case 0 -> {
                    System.out.println("Programa encerrado.");
                }

                default -> {
                    System.out.println("Opcao invalida.");
                }
            }

        } while (opcao != 0);

        teclado.close();
    
    }
    
}
