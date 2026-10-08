/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaveiculos;
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
        Scanner entrada = new Scanner(System.in);
        SistemaVeiculos sistema = new SistemaVeiculos();

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE VEICULOS ===");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Buscar veiculo");
            System.out.println("3 - Remover veiculo");
            System.out.println("4 - Listar veiculos");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Placa: ");
                    String placa = entrada.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = entrada.nextLine();

                    System.out.print("Quantidade de portas: ");
                    int portas = Integer.parseInt(entrada.nextLine());

                    Veiculo veiculo = new Carro(placa, modelo, portas);

                    if (sistema.cadastrarVeiculo(veiculo)) {
                        System.out.println("Carro cadastrado.");
                    } else {
                        System.out.println("Placa ja cadastrada.");
                    }
                    break;

                case 2:
                    System.out.print("Placa: ");
                    placa = entrada.nextLine();

                    Veiculo encontrado = sistema.buscarVeiculo(placa);

                    if (encontrado != null) {
                        System.out.println("Modelo: " + encontrado.getModelo());
                        System.out.println("Placa: " + encontrado.getPlaca());

                        if (encontrado instanceof Carro) {
                            Carro carro = (Carro) encontrado;
                            System.out.println("Portas: " + carro.getQuantidadePortas());
                        }
                    } else {
                        System.out.println("Veiculo nao encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Placa: ");
                    placa = entrada.nextLine();

                    if (sistema.removerVeiculo(placa)) {
                        System.out.println("Veiculo removido.");
                    } else {
                        System.out.println("Veiculo nao encontrado.");
                    }
                    break;

                case 4:
                    sistema.listarVeiculos();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        entrada.close();

    }
    
}
