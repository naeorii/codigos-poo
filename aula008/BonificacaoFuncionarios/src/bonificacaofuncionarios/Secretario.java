/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonificacaofuncionarios;
import java.util.Locale;

public class Secretario extends Funcionario {
    private String localTrabalho;
    private String ramal;

    public Secretario(int codigo, String nome, double salarioBase,
                     String localTrabalho, String ramal) {
        super(codigo, nome, salarioBase);
        this.localTrabalho = localTrabalho;
        this.ramal = ramal;
    }

    @Override
    public double calcularBonificacao() {
        return getSalarioBase() * 0.10;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + calcularBonificacao();
    }

    @Override
    public String getDetalhes() {
        return String.format(Locale.forLanguageTag("pt-BR"),
                "Categoria: Secretario%n"
                + "Codigo: %d%n"
                + "Nome: %s%n"
                + "Local de trabalho: %s%n"
                + "Ramal: %s%n"
                + "Salario-base: R$ %,.2f%n"
                + "Bonificacao: R$ %,.2f%n"
                + "Salario total: R$ %,.2f",
                getCodigo(), getNome(), localTrabalho, ramal,
                getSalarioBase(), calcularBonificacao(), calcularSalario());
    }
}
