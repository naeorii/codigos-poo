package agendacontatos;

import java.util.ArrayList;
import java.util.Locale;

/** Gerencia os contatos; Principal nao acessa a lista diretamente. */
public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public boolean cadastrar(Contato c) {
        // Rejeita entradas em branco e e-mails com formato invalido.
        if (c == null || c.normalizarNome().isBlank()
                || !c.emailValido()) {
            return false;
        }

        // Compara sem diferenciar maiusculas/minusculas.
        for (Contato contato : contatos) {
            if (contato.getEmail().equalsIgnoreCase(c.getEmail())) {
                return false;
            }
        }

        contatos.add(c);
        return true;
    }

    public Contato buscarPorNome(String nome) {
        if (nome == null || nome.isBlank()) {
            return null;
        }
        String pesquisa = nome.strip().replaceAll("\\s+", " ");

        // Prioriza a correspondencia exata, se existir.
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(pesquisa)) {
                return contato;
            }
        }

        // Tambem permite pesquisar por uma parte do nome.
        String pesquisaMinuscula = pesquisa.toLowerCase(Locale.ROOT);
        for (Contato contato : contatos) {
            if (contato.getNome().toLowerCase(Locale.ROOT)
                    .contains(pesquisaMinuscula)) {
                return contato;
            }
        }
        return null;
    }

    public void listar() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }

        System.out.println("\n===== CONTATOS CADASTRADOS =====");
        for (Contato contato : contatos) {
            contato.exibir();
        }
    }
}
