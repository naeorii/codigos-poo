package analisadortextos;

public class AnalisadorTexto {
    // Atributo privado que armazena o texto original.
    private String textoOriginal;

    public AnalisadorTexto(String textoOriginal) {
        // strip() retorna uma nova String, sem modificar a original.
        this.textoOriginal = textoOriginal == null ? "" : textoOriginal.strip();
    }

    public String getTextoOriginal() {
        return textoOriginal;
    }

    public int contarCaracteres() {
        return textoOriginal.length();
    }

    public int contarPalavras() {
        String texto = textoOriginal.strip();
        if (texto.isEmpty()) {
            return 0;
        }
        // Divide o texto em palavras usando um ou mais espacos em branco.
        return texto.split("\\s+").length;
    }

    public boolean buscarPalavra(String palavra) {
        // Busca sem diferenciar letras maiusculas e minusculas.
        return textoOriginal.toLowerCase()
                .contains(palavra.strip().toLowerCase());
    }

    public int posicaoPalavra(String palavra) {
        // Retorna o indice da primeira ocorrencia ou -1.
        return textoOriginal.toLowerCase()
                .indexOf(palavra.strip().toLowerCase());
    }

    public String extrairTrecho(int inicio, int fim) {
        if (inicio < 0 || fim > textoOriginal.length()
                || inicio >= fim) {
            return "Intervalo invalido.";
        }
        // O indice final nao faz parte do trecho extraido.
        return textoOriginal.substring(inicio, fim);
    }

    public String converterMaiusculas() {
        return textoOriginal.toUpperCase();
    }

    public String converterMinusculas() {
        return textoOriginal.toLowerCase();
    }

    public String substituir(String antigo, String novo) {
        if (antigo.isEmpty()) {
            return "Trecho a substituir nao pode ser vazio.";
        }
        return textoOriginal.replace(antigo, novo);
    }

    public boolean iniciaCom(String trecho) {
        return textoOriginal.toLowerCase()
                .startsWith(trecho.strip().toLowerCase());
    }

    public boolean terminaCom(String trecho) {
        return textoOriginal.toLowerCase()
                .endsWith(trecho.strip().toLowerCase());
    }

    public char primeiroCaractere() {
        if (textoOriginal.isEmpty()) {
            return '\0';
        }
        return textoOriginal.charAt(0);
    }

    public boolean igualA(String outro) {
        return textoOriginal.equalsIgnoreCase(outro.strip());
    }
}
