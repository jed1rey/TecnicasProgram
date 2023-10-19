/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paula
 */
public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();

        pessoa01.inicializar("Carlos", "Fernandes", 31, "444.555.222-88"); //parametros

        //impressão de dados antes da atualização
        System.out.println("Nome Completo: " + pessoa01.getNome() + " " + pessoa01.getSobrenome());
        System.out.println("Idade: " + pessoa01.getIdade());
        System.out.println("CPF: " + pessoa01.getCpf());

        //atuualização com setter
        pessoa01.setNome("Ana Claudia");
        pessoa01.setSobrenome("Pereira");
        pessoa01.setIdade(32);
        pessoa01.setCpf("222.333.444-89");

        
        System.out.println("################### DADOS ATUALIZADOS COM SUCESSO ##############");
        System.out.println("Nome Completo: " + pessoa01.getNome() + " " + pessoa01.getSobrenome());
        System.out.println("Idade: " + pessoa01.getIdade());
        System.out.println("CPF: " + pessoa01.getCpf());
    }
}
