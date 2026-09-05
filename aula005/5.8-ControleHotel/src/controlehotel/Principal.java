package controlehotel;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Hotel hotel = null;
        int opcao;

        do {
            System.out.println("\n====CONTROLE DE HOTEL====");
            if (hotel != null) {
                System.out.println("Hotel: " + hotel.getNome());
            }
            System.out.println("1- Cadastrar hotel");
            System.out.println("2 - Adiconar quarto");
            System.out.println("3 - Ocupar quarto");
            System.out.println("4 - Liberar quarto");
            System.out.println("5 - Consultar quarto");
            System.out.println("6 - Exibir resumo");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    if (hotel != null) {
                        System.out.println("Hotel ja cadastrado.");
                        break;
                    }
                    System.out.print("Nome do hotel: ");
                    String nome = teclado.next();
                    System.out.print("Capacidade: ");
                    int capacidadeHotel = teclado.nextInt();
                    while (capacidadeHotel <= 0) {
                        System.out.print("Capacidade invalida. Digite novamente: ");
                        capacidadeHotel = teclado.nextInt();
                    }
                    hotel = new Hotel(nome, capacidadeHotel);
                    System.out.println("Hotel cadastrado.");
                    break;
                case 2:
                    if (hotel == null) {
                        System.out.println("Cadastre o hotel primeiro.");
                        break;
                    }
                    System.out.print("Numero do quarto: ");
                    int numeroNovoQuarto = teclado.nextInt();
                    Quarto novoQuarto = new Quarto(numeroNovoQuarto);
                    boolean adicionou = hotel.adicionarQuarto(novoQuarto);
                    System.out.println(adicionou
                            ? "Quarto adicionado."
                            : "Numero repetido ou hotel lotado.");
                    break;
                case 3:
                    if (hotel == null) {
                        System.out.println("Cadastre o hotel primeiro.");
                        break;
                    }
                    System.out.print("Numero do quarto: ");
                    int numeroQuartoParaOcupar = teclado.nextInt();
                    boolean quartoOcupado = hotel.ocuparQuarto(
                            numeroQuartoParaOcupar);
                    System.out.println(quartoOcupado
                            ? "Quarto ocupado." : "Nao foi possivel ocupar.");
                    break;
                case 4:
                    if (hotel == null) {
                        System.out.println("Cadastre o hotel primeiro.");
                        break;
                    }
                    System.out.print("Numero do quarto: ");
                    int numeroQuartoParaLiberar = teclado.nextInt();
                    boolean quartoLiberado = hotel.liberarQuarto(
                            numeroQuartoParaLiberar);
                    System.out.println(quartoLiberado ? "Quarto liberado." : "Nao foi possivel liberar.");
                    break;
                case 5:
                    if (hotel == null) {
                        System.out.println("Cadastre o hotel primeiro.");
                        break;
                    }
                    System.out.print("Numero do quarto: ");
                    int numeroQuartoParaConsulta = teclado.nextInt();
                    Quarto quartoParaConsulta = hotel.buscarQuarto(
                            numeroQuartoParaConsulta);
                    if (quartoParaConsulta == null) {
                        System.out.println("Quarto nao encontrado.");
                    } else {
                        System.out.println(quartoParaConsulta.isOcupado() ? "Ocupado" : "Livre");
                    }
                    break;
                case 6:
                    if (hotel == null) {
                        System.out.println("Cadastre o hotel primeiro.");
                        break;
                    }
                    System.out.println("Quartos cadastrados: " + hotel.getQuantidade());
                    System.out.println("Livres: " + hotel.contarLivres());
                    System.out.println("Ocupados: " + hotel.contarOcupados());
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao!= 0);
        teclado.close();
    }


    }