/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemafuncionarios;

/**
 *
 * @author taian
 */

import java.util.ArrayList;

public class SistemaFuncionarios {
    private ArrayList<Funcionario> funcionarios;

    public SistemaFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public boolean cadastrarFuncionario(Funcionario funcionario) {
        if (funcionario == null) {
            return false;
        }

        if (buscarFuncionario(funcionario.getCodigo()) != null) {
            return false;
        }

        funcionarios.add(funcionario);
        return true;
    }

    public Funcionario buscarFuncionario(int codigo) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCodigo() == codigo) {
                return funcionario;
            }
        }

        return null;
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionario cadastrado.");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println("--------------------");
                funcionario.exibirDados();

                if (funcionario instanceof Gerente) {
                    Gerente gerente = (Gerente) funcionario;
                    System.out.println("Cargo: Gerente");
                    System.out.println("Setor: " + gerente.getSetor());
                    System.out.println("Funcionarios gerenciados: " + gerente.getNumeroFuncionariosGerenciados());
                }

                if (funcionario instanceof Secretario) {
                    Secretario secretario = (Secretario) funcionario;
                    System.out.println("Cargo: Secretario");
                    System.out.println("Local de trabalho: " + secretario.getLocalTrabalho());
                    System.out.println("Ramal: " + secretario.getRamal());
                }
            }
        }
    }

    public int quantidadeFuncionarios() {
        return funcionarios.size();
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }
}
