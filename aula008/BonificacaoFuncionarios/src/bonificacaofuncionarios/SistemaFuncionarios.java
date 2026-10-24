/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonificacaofuncionarios;
import java.util.ArrayList;

public class SistemaFuncionarios {
    private ArrayList<Funcionario> funcionarios;

    public SistemaFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public boolean cadastrar(Funcionario funcionario) {
        if (funcionario == null) {
            return false;
        }
        if (funcionario.getCodigo() <= 0) {
            return false;
        }
        if (funcionario.getNome() == null
                || funcionario.getNome().trim().isEmpty()) {
            return false;
        }
        if (!Double.isFinite(funcionario.getSalarioBase())
                || funcionario.getSalarioBase() < 0) {
            return false;
        }
        if (buscar(funcionario.getCodigo()) != null) {
            return false;
        }

        funcionarios.add(funcionario);
        return true;
    }

    public Funcionario buscar(int codigo) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCodigo() == codigo) {
                return funcionario;
            }
        }
        return null;
    }

    public boolean remover(int codigo) {
        Funcionario funcionario = buscar(codigo);
        if (funcionario == null) {
            return false;
        }
        return funcionarios.remove(funcionario);
    }

    public void exibir(Funcionario funcionario) {
        if (funcionario == null) {
            System.out.println("Funcionario nao encontrado.");
        } else {
            System.out.println(funcionario.getDetalhes());
        }
    }

    public void listar() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionario cadastrado.");
            return;
        }
        for (Funcionario funcionario : funcionarios) {
            System.out.println("------------------------------");
            System.out.println(funcionario.getDetalhes());
        }
        System.out.println("------------------------------");
    }

    public int quantidade() {
        return funcionarios.size();
    }
}
