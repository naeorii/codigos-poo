package registroviagens;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Veiculo[] veiculos = new Veiculo[5];
        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\n======REGISTRO DE VIAGENS======");
            System.out.println("1 - Cadastrar veiculo");
            System.out.println("2 - Registrar viagem");
            System.out.println("3 - Consultar veiculo");
            System.out.println("4- Listar veiculos");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    if (quantidade == veiculos.length) {
                        System.out.println("Quantidade maxima de veiculos atingida");
                        break;
                    }
                    System.out.print("Modelo do veiculo: ");
                    String modeloVeiculo = teclado.next();
                    System.out.print("Quilometragem atual do veiculo: ");
                    double quilometragemAtual = teclado.nextDouble();
                    veiculos[quantidade] = new Veiculo(modeloVeiculo, quilometragemAtual);
                    quantidade++;
                    System.out.println("Veiculo cadastrado");
                    break;
                case 2:
                    System.out.print("Modelo: ");
                    String modelo = teclado.next();
                    Veiculo veiculoParaViagem = null;

                    for(int indice = 0; indice < quantidade; indice++) {
                        if (veiculos[indice].getModelo().equals(modelo)) {
                            veiculoParaViagem = veiculos[indice];
                        }
                    }

                    if (veiculoParaViagem  == null) {
                        System.out.println("Veiculo nao encontrado.");
                        break;
                    }

                    System.out.print("Distancia percorrida: ");
                    double distanciaPercorrida = teclado.nextDouble();
                    boolean viagemRegistrada = veiculoParaViagem.viajar(distanciaPercorrida);
                    System.out.println(viagemRegistrada ? "Viagem resgistrada" : "Distancia invalida");
                    break;
                case 3:
                    System.out.print("Modelo: ");
                    modelo = teclado.next();
                    Veiculo veiculoParaConsulta = null;

                    for (int indice = 0; indice < quantidade; indice++) {
                        if (veiculos[indice].getModelo().equals(modelo)) {
                            veiculoParaConsulta = veiculos[indice];
                        }
                    }

                    if (veiculoParaConsulta == null) {
                        System.out.println("Veiculo nao encontrado.");
                        break;
                    }

                    System.out.printf("Quilometragem: %.1f km%n", veiculoParaConsulta.getQuilometragem());
                    break;
                case 4:
                    for (int indice = 0; indice < quantidade; indice++) {
                        System.out.printf("%s - %1.f km%n", veiculos[indice].getModelo(), veiculos[indice].getQuilometragem());
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
        teclado.close();
    }

    }