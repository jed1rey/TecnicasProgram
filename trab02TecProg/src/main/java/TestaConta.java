/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paula
 */
public class TestaConta {

    public static void main(String[] args) {
        // Criação de duas instâncias da classe Conta
        Conta contaA = new Conta();
        Conta contaB = new Conta();

        // Inicialização das contas com números e saldos iniciais
        contaA.inicializar(5698, 145.0);
        contaB.inicializar(4545, 503.0);

        // Realização de operações de depósito, saque e transferência entre as contas
        contaA.depositar(240.0);
        contaA.sacar(130.0);
        contaA.transferir(430.0, contaB);

        // Exibição dos saldos das contas
        System.out.println("Saldo da conta " + contaA.getNumConta() + ": " + contaA.getSaldo());
        System.out.println("Saldo da conta " + contaB.getNumConta() + ": " + contaB.getSaldo());

    }

}
