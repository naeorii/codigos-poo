/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonificacaofuncionarios;


import java.util.Locale;

public class Administrativo extends Funcionario {

    public Administrativo(int codigo, String nome, double salarioBase) {
        super(codigo, nome, salarioBase);
    }

    @Override
    public double calcularBonificacao() {
        return 0.0;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + calcularBonificacao();
    }

    @Override
    public String getDetalhes() {
        return String.format(Locale.forLanguageTag("pt-BR"),
                "Categoria: Administrativo%n"
                + "Codigo: %d%n"
                + "Nome: %s%n"
                + "Salario-base: R$ %,.2f%n"
                + "Bonificacao: R$ %,.2f%n"
                + "Salario total: R$ %,.2f",
                getCodigo(), getNome(), getSalarioBase(),
                calcularBonificacao(), calcularSalario());
    }
}
