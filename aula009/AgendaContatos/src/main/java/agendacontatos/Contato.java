package agendacontatos;

import java.util.Locale;

/** Representa um contato com nome e endereco de e-mail. */
public class Contato {

    private String nome;
    private String email;

    public Contato(String nome, String email) {
        // strip() elimina espacos nas extremidades.
        this.nome = nome == null ? "" : nome.strip();
        this.email = email == null ? "" : email.strip().toLowerCase(Locale.ROOT);
    }

    /** Elimina espacos extras e preserva maiusculas/minusculas do nome. */
    public String normalizarNome() {
        return nome.strip().replaceAll("\\s+", " ");
    }

    /**
     * Validacao simplificada exigida no enunciado:
     * um @, com texto antes/depois, e pelo menos um ponto depois do @.
     * Nao confirma que o endereco realmente exista.
     */
    public boolean emailValido() {
        if (email.isBlank() || email.contains(" ")) {
            return false;
        }

        int arroba = email.indexOf('@');
        int pontoDepoisArroba = email.indexOf('.', arroba + 1);

        return arroba > 0
                && email.indexOf('@', arroba + 1) == -1
                && pontoDepoisArroba > arroba + 1
                && pontoDepoisArroba < email.length() - 1;
    }

    public void exibir() {
        System.out.println("Nome: " + normalizarNome()
                + " | E-mail: " + email);
    }

    public String getNome() {
        return normalizarNome();
    }

    public String getEmail() {
        return email;
    }
}
