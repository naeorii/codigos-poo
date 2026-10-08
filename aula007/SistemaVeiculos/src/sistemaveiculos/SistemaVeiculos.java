/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaveiculos;
import java.util.ArrayList;
/**
 *
 * @author taian
 */
public class SistemaVeiculos {
    private ArrayList<Veiculo> veiculos;
    
    public SistemaVeiculos() {
        veiculos = new ArrayList<>();
    }
    
    public boolean cadastrarVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            return false;
        }
        
        if (buscarVeiculo(veiculo.getPlaca()) != null) {
            return false;
        }
        
        veiculos.add(veiculo);
        return true;
    }
    
    public Veiculo buscarVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculo;
            }
        }
        return null;
    }
    
    public boolean removerVeiculo(String placa) {
        Veiculo veiculo = buscarVeiculo(placa);
        
        if (veiculo != null) {
            return veiculos.remove(veiculo);
        }
        
        return false;
    }
    
    public void listarVeiculos() {
        if(veiculos.isEmpty()) {
            System.out.println("Nenhum veiculo esta cadastrado.");
        } else {
            for (Veiculo veiculo : veiculos) {
                System.out.println("==========");
                System.out.println("Placa: " + veiculo.getPlaca());
                System.out.println("Modelo: " + veiculo.getModelo());
            
                if (veiculo instanceof Carro) {
                    Carro carro = (Carro) veiculo;
                    System.out.println("Número de portas: " + carro.getQuantidadePortas());
                }
            }
        }
    }
    
}
