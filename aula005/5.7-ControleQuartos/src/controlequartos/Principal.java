package controlequartos;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Quarto[] quartos = new Quarto[5];
        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\n====CONTROLE DE QUARTOS====");
            System.out.println("1 - Cadastrar quarto");
            System.out.println("2 - Ocupar quarto");
            System.out.println("3 - Liberar quarto");
            System.out.println("4 - Consultar quarto");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    if (quantidade == quartos.length) {
                        System.out.println("Numero maximo atingido.");
                        break;
                    }
                    System.out.print("Numero do quarto: ");
                    int numeroNovoQuarto = teclado.nextInt();

                    boolean quartoJaExiste = false;
                    for(int indice=0;  indice < quantidade; indice++) {
                        if(quartos[indice].getNumero() == numeroNovoQuarto){
                            quartoJaExiste = true;
                            break;
                        }
                    }
                    if (quartoJaExiste) {
                        System.out.println("Quarto ja cadastrado.");
                        break;
                    }
                    quartos[quantidade] = new Quarto(numeroNovoQuarto);
                    quantidade++;
                    System.out.println("Quarto cadastrado.");
                    break;
                case 2:
                    System.out.print("Numero do quarto: ");
                    int numero = teclado.nextInt();
                    Quarto quartoParaOcupacao = null;

                    for(int indice = 0; indice < quantidade; indice++) {
                        if(quartos[indice].getNumero() == numero) {
                            quartoParaOcupacao = quartos[indice];
                        }
                    }

                    if (quartoParaOcupacao == null) {
                        System.out.println("Quarto nao encontrado");
                        break;
                    }

                    System.out.println(quartoParaOcupacao.ocupar() ? "Quarto ocupado." : "Quarto ja esta ocupado.");
                    break;
                case 3:
                    System.out.print("Numero do quarto: ");
                    numero = teclado.nextInt();
                    Quarto quartoParaLiberacao = null;

                    for(int indice = 0; indice < quantidade; indice++) {
                        if(quartos[indice].getNumero() == numero) {
                            quartoParaLiberacao = quartos[indice];
                        }
                    }

                    if (quartoParaLiberacao == null) {
                        System.out.println("Quarto nao encontrado");
                        break;
                    }

                    System.out.println(quartoParaLiberacao.liberar() ? "Quarto liberado." : "Quarto ja esta livre.");
                    break;
                case 4:
                    System.out.print("Numero do quarto: ");
                    numero = teclado.nextInt();
                    Quarto quartoParaConsulta = null;

                    for(int indice = 0; indice < quantidade; indice++) {
                        if(quartos[indice].getNumero() == numero) {
                            quartoParaConsulta = quartos[indice];
                        }
                    }

                    if (quartoParaConsulta == null) {
                        System.out.println("Quarto nao encontrado");
                        break;
                    }

                    System.out.println(quartoParaConsulta.isOcupado() ? "Ocupado." : "Livre.");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

        } while(opcao != 0);
        teclado.close();
    }
}
