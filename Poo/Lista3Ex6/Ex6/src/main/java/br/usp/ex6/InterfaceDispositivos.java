/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.ex6;

/**
 *
 * @author joaom
 */
public interface InterfaceDispositivos {
    
    //nos utilizariamos uma interface ela daria uma caminho para os desenvolvedores
    //sem que o codigo fosse revelado
    
    public void ligar();
    public void desligar();
    
    public int checarStatus();
    
    public void calibrar();
    
}
