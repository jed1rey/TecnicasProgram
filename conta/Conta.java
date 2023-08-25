/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conta;

/**
 *
 * @author 1091392313004
 */
public class Conta {
    private String name; //variavel de instancia
    
    
    
    
    //metodo (funcao) para definir o nome no objeto
    
    public void setName(String name){
        this.name = name;    // armazena o nome
    }
    
    //metodo para recuperar o nome no objeto
    public String getName(){
        return name; //retorna o valor do nome para quem o chamou
    }
}

