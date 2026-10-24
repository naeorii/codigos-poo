/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonificacaofuncionarios;


public abstract class Funcionario implements Bonificavel {
    private int codigo;
    private String nome;
    private double salarioBase;

    public Funcionario(int codigo, String nome, double salarioBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = salarioBase;
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

    @Override
    public abstract double calcularBonificacao();

    public abstract double calcularSalario();

    public abstract String getDetalhes();
}

