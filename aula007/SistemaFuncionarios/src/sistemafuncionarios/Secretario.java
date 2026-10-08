/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafuncionarios;

/**
 *
 * @author taian
 */

public class Secretario extends Funcionario {
    private String localTrabalho;
    private String ramal;

    public Secretario(int codigo, String nome, double salarioBase, String localTrabalho, String ramal) {
        super(codigo, nome, salarioBase, 0.10);
        this.localTrabalho = localTrabalho;
        this.ramal = ramal;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public String getRamal() {
        return ramal;
    }
}
