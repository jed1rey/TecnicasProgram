/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paula
 */
public class TestaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.inicializar("Notebook", "Laptop de última geração", 1200.50, 5);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Preço: $" + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}
        // Você também pode testar os métodos set para alterar os atributos, se desejar.