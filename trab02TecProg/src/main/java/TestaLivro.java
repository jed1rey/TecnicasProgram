/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paula
 */
public class TestaLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.inicializar("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia", "Editora Martins Fontes");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Editora: " + livro.getEditora());

        // Você também pode testar os métodos set para alterar os atributos, se desejar.
    }
}