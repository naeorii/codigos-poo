/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleproduto;

/**
 *
 * @author Aluno
 */
public class Produto {
    private double preco;
    private int estoque;
    
  public Produto() {
      preco = 0.0;
      estoque = 0;
  }
  
  public double getPreco(){
      return preco;
  }
  
  public int getEstoque(){
      return estoque;
  }
  
  public boolean alterarPreco(double novoPreco){
      if (novoPreco < 0) {
          return false;
      }
      preco = novoPreco;
      return true;
  }
  
  public boolean reporEstoque (int quantidade) {
      if (quantidade <= 0) {
          return false;
      }
      estoque += quantidade;
      return true;
  }
  
  public boolean vender (int quantidade) {
      if (quantidade <= 0 || quantidade > estoque) {
          return false;
      }
      estoque -= quantidade;
      return true;
  }
}
