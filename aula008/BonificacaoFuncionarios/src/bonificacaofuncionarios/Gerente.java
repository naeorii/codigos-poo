/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonificacaofuncionarios;
import java.util.Locale;

public class Gerente extends Funcionario {
    private String setor;
    private int numeroFuncionariosGerenciados;

    public Gerente(int codigo, String nome, double salarioBase,
                   String setor, int numeroFuncionariosGerenciados) {
        super(codigo, nome, salarioBase);
        this.setor = setor;
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    @Override
    public double calcularBonificacao() {
        return getSalarioBase() * 0.30;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + calcularBonificacao();
    }

    @Override
    public String getDetalhes() {
        return String.format(Locale.forLanguageTag("pt-BR"),
                "Categoria: Gerente%n"
                + "Codigo: %d%n"
                + "Nome: %s%n"
                + "Setor: %s%n"
                + "Numero de funcionarios gerenciados: %d%n"
                + "Salario-base: R$ %,.2f%n"
                + "Bonificacao: R$ %,.2f%n"
                + "Salario total: R$ %,.2f",
                getCodigo(), getNome(), setor, numeroFuncionariosGerenciados,
                getSalarioBase(), calcularBonificacao(), calcularSalario());
    }
}
