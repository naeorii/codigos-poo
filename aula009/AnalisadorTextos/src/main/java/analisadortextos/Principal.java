package analisadortextos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HistoricoTextos historicoTextos = new HistoricoTextos();
        int opcao;

        do {
            System.out.println("\n===== ANALISADOR DE TEXTOS =====");
            System.out.println("1 - Informar novo texto");
            System.out.println("2 - Contar caracteres");
            System.out.println("3 - Contar palavras");
            System.out.println("4 - Buscar palavra ou trecho");
            System.out.println("5 - Localizar posicao de trecho");
            System.out.println("6 - Extrair parte do texto");
            System.out.println("7 - Converter para maiusculas");
            System.out.println("8 - Converter para minusculas");
            System.out.println("9 - Substituir trecho");
            System.out.println("10 - Verificar inicio do texto");
            System.out.println("11 - Verificar final do texto");
            System.out.println("12 - Listar textos analisados");
            System.out.println("13 - Mostrar primeiro caractere");
            System.out.println("14 - Comparar texto completo");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = teclado.nextInt();
            teclado.nextLine(); // Consome a quebra de linha pendente.

            switch (opcao) {
                case 1: {
                    System.out.print("Digite o texto: ");
                    String texto = teclado.nextLine();
                    if (historicoTextos.adicionar(texto)) {
                        System.out.println("Texto cadastrado e selecionado.");
                    } else {
                        System.out.println("Texto vazio nao permitido.");
                    }
                    break;
                }
                case 2: {
                    AnalisadorTexto textoAtual = historicoTextos.getAtual();
                    if (textoAtual == null) {
                        System.out.println("Cadastre um texto primeiro.");
                    } else {
                        System.out.println("Caracteres: " + textoAtual.contarCaracteres());
                    }
                    break;
                }
                case 3: {
                    AnalisadorTexto atual = historicoTextos.getAtual();
                    if (atual == null) {
                        System.out.println("Cadastre um texto primeiro.");
                    } else {
                        System.out.println("Palavras: " + atual.contarPalavras());
                    }
                    break;
                }
                case 4: {
                    AnalisadorTexto atual = historicoTextos.getAtual();
                    if (atual == null) {
                        System.out.println("Cadastre um texto primeiro.");
                    } else {
                        System.out.print("Palavra ou trecho: ");
                        String palavra = teclado.nextLine();
                        System.out.println("Encontrado: " + atual.buscarPalavra(palavra));
                    }
                    break;
                }
                case 5: {
                    AnalisadorTexto atual = historicoTextos.getAtual();
                    if (atual == null) {
                        System.out.println("Cadastre um texto primeiro.");
                    } else {
                        System.out.print("Trecho: ");
                        String trecho = teclado.nextLine();
                        System.out.println("Posicao: " + atual.posicaoPalavra(trecho));
                    }
                    break;
                }
                case 6: {
                    AnalisadorTexto atual = historicoTextos.getAtual();
                    if (atual == null) {
                        System.out.println("Cadastre um texto primeiro.");
                    } else {
                        System.out.print("Indice inicial: ");
                        int inicio = teclado.nextInt();
                        System.out.print("Indice final (exclusivo): ");
                        int fim = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println(atual.extrairTrecho(inicio, fim));
                    }
                    break;
                }
                case 7: {
                    AnalisadorTexto atual = historicoTextos.getAtual();
                    if (atual == null) {
                        System.out.println("Cadastre um texto primeiro.");
                    } else {
                        System.out.println(atual.converterMaiusculas());
                    }
                    break;
                }
                case 8: {
                    AnalisadorTexto atual = historicoTextos.getAtual();
                    if (atual == null) {
                        System.out.println("Cadastre um texto primeiro.");
                    } else {
                        System.out.println(atual.converterMinusculas());
                    }
                    break;
                }
                case 9: {
                    AnalisadorTexto atual = historicoTextos.getAtual();
                    if (atual == null) {
                        System.out.println("Cadastre um texto primeiro.");
                    } else {
                        System.out.print("Trecho antigo: ");
                        String antigo = teclado.nextLine();
                        System.out.print("Trecho novo: ");
                        String novo = teclado.nextLine();
                        System.out.println(atual.substituir(antigo, novo));
                    }
                    break;
                }
                case 10: {
                    AnalisadorTexto atual = historicoTextos.getAtual();
                    if (atual == null) {
                        System.out.println("Cadastre um texto primeiro.");
                    } else {
                        System.out.print("Trecho inicial: ");
                        String trecho = teclado.nextLine();
                        System.out.println("Inicia com: " + atual.iniciaCom(trecho));
                    }
                    break;
                }
                case 11: {
                    AnalisadorTexto atual = historicoTextos.getAtual();
                    if (atual == null) {
                        System.out.println("Cadastre um texto primeiro.");
                    } else {
                        System.out.print("Trecho final: ");
                        String trecho = teclado.nextLine();
                        System.out.println("Termina com: " + atual.terminaCom(trecho));
                    }
                    break;
                }
                case 12: {
                    System.out.println(historicoTextos.listar());
                    break;
                }
                case 13: {
                    AnalisadorTexto atual = historicoTextos.getAtual();
                    if (atual == null) {
                        System.out.println("Cadastre um texto primeiro.");
                    } else {
                        System.out.println("Primeiro caractere: " + atual.primeiroCaractere());
                    }
                    break;
                }
                case 14: {
                    AnalisadorTexto atual = historicoTextos.getAtual();
                    if (atual == null) {
                        System.out.println("Cadastre um texto primeiro.");
                    } else {
                        System.out.print("Texto para comparar: ");
                        String outro = teclado.nextLine();
                        System.out.println("Igual (sem diferenciar caixa): " + atual.igualA(outro));
                    }
                    break;
                }
                case 0: {
                    System.out.println("Programa encerrado.");
                    break;
                }
                default: {
                    System.out.println("Opcao invalida.");
                    break;
                }
            }
        } while (opcao != 0);
        teclado.close();
    }
}
