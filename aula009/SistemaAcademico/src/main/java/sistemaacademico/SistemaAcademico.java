package sistemaacademico;

import java.util.ArrayList;

public class SistemaAcademico {
    private ArrayList<Aluno> alunos;

    public SistemaAcademico() {
        alunos = new ArrayList<>();
    }

    public boolean cadastrar(int matricula, String nome) {
        if (nome == null || nome.isBlank()) {
            return false;
        }
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return false;
            }
        }
        alunos.add(new Aluno(matricula, nome));
        return true;
    }

    public Aluno buscarPorNome(String nome) {
        if (nome == null) {
            return null;
        }
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome.strip())) {
                return aluno;
            }
        }
        return null;
    }

    public String listar() {
        String resultado = "";
        for (Aluno aluno : alunos) {
            resultado += aluno.getMatricula() + " - "
                    + aluno.getNome() + "\n";
        }
        return resultado.isEmpty() ? "Nenhum aluno." : resultado;
    }
}
