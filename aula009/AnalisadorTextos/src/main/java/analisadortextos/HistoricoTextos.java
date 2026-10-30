package analisadortextos;

import java.util.ArrayList;

public class HistoricoTextos {
    private ArrayList<AnalisadorTexto> textos;
    // -1 indica que nao existe texto ativo.
    private int indiceAtual;

    public HistoricoTextos() {
        textos = new ArrayList<>();
        indiceAtual = -1;
    }

    public boolean adicionar(String texto) {
        if (texto == null || texto.strip().isEmpty()) {
            return false;
        }
        textos.add(new AnalisadorTexto(texto));
        indiceAtual = textos.size() - 1;
        return true;
    }

    public AnalisadorTexto getAtual() {
        if (indiceAtual < 0) {
            return null;
        }
        return textos.get(indiceAtual);
    }

    public String listar() {
        if (textos.isEmpty()) {
            return "Nenhum texto cadastrado.";
        }
        String resultado = "";
        for (int i = 0; i < textos.size(); i++) {
            String marcador = i == indiceAtual ? " [ATUAL]" : "";
            resultado += (i + 1) + " - "
                    + textos.get(i).getTextoOriginal()
                    + marcador + "\n";
        }
        return resultado;
    }

    public int quantidade() {
        return textos.size();
    }
}
