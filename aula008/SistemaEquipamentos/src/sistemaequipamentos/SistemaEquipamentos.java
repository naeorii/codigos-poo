
package sistemaequipamentos;

import java.util.ArrayList;

public class SistemaEquipamentos {
    private ArrayList<Equipamento> equipamentos;

    public SistemaEquipamentos() {
        equipamentos = new ArrayList<>();
    }

    public boolean cadastrar(Equipamento equipamento) {
        if (equipamento == null) {
            return false;
        }
        if (equipamento.getCodigo() <= 0) {
            return false;
        }
        if (equipamento.getDescricao() == null
                || equipamento.getDescricao().trim().isEmpty()) {
            return false;
        }
        if (!Double.isFinite(equipamento.getValorAquisicao())
                || equipamento.getValorAquisicao() < 0) {
            return false;
        }
        if (buscar(equipamento.getCodigo()) != null) {
            return false;
        }

        equipamentos.add(equipamento);
        return true;
    }

    public Equipamento buscar(int codigo) {
        for (Equipamento equipamento : equipamentos) {
            if (equipamento.getCodigo() == codigo) {
                return equipamento;
            }
        }
        return null;
    }

    public boolean remover(int codigo) {
        Equipamento equipamento = buscar(codigo);
        if (equipamento == null) {
            return false;
        }
        return equipamentos.remove(equipamento);
    }

    public void listar() {
        if (equipamentos.isEmpty()) {
            System.out.println("Nenhum equipamento cadastrado.");
            return;
        }
        for (Equipamento equipamento : equipamentos) {
            System.out.println("------------------------------");
            System.out.println(equipamento.getDetalhes());
        }
        System.out.println("------------------------------");
    }

    public int quantidade() {
        return equipamentos.size();
    }
}
