/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova.prova;

/**
 *
 * @author paula
 */
public class Teste {
    public static void main(String[] args) {
    
    double quilometro = 2.8;
    double litro = 4.5;
    double metroCubico = 2.5;
    double barril = 3.0;
    
    
    System.out.println(quilometro + " quilometros correspondem a " + ConversaoDeDados.km_metros(quilometro) + " metros");
    System.out.println(litro + "litros correspondem a " + ConversaoDeDados.litro_decilitros(litro) + " decilitros" );
    System.out.println(metroCubico + " metros cubidos correspondem a " + ConversaoDeDados.metro_pes(metroCubico) + " pés cubicos" );
    System.out.println(barril + " barris correspondem a " + ConversaoDeDados.barril_decalitros(barril) + " decalitros");
    System.out.println(barril + " barris correspondem a " + ConversaoDeDados.barril_litros(barril) + " litros");
    }
    
    
    
    
    
    
}
