/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafuncionarios;

/**
 *
 * @author taian
 */

public class Funcionario {
    private int codigo;
    private String nome;
    private double salarioBase;
    private double percentualBonificacao;

    public Funcionario(int codigo, String nome, double salarioBase, double percentualBonificacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.percentualBonificacao = percentualBonificacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getPercentualBonificacao() {
        return percentualBonificacao;
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * percentualBonificacao);
    }

    public void exibirDados() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Salario base: R$ " + salarioBase);
        System.out.println("Bonificacao: " + (percentualBonificacao * 100) + "%");
        System.out.println("Salario final: R$ " + calcularSalario());
    }
}
