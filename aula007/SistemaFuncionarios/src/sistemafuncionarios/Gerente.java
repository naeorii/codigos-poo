/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafuncionarios;

/**
 *
 * @author taian
 */

public class Gerente extends Funcionario {
    private String setor;
    private int numeroFuncionariosGerenciados;

    public Gerente(int codigo, String nome, double salarioBase, String setor, int numeroFuncionariosGerenciados) {
        super(codigo, nome, salarioBase, 0.30);
        this.setor = setor;
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    public String getSetor() {
        return setor;
    }

    public int getNumeroFuncionariosGerenciados() {
        return numeroFuncionariosGerenciados;
    }
}
