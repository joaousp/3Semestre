/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.lista8ex8;

/**
 *
 * @author joaom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sem proxy");
        Sistema IOS = new Sistema("Joao", 135);
        IOS.acessarSistema("Joao", 135);
        IOS.guardarDados("123456789");
        
        System.out.println();
        System.out.println("Sem proxy");
        ProxyAcesso Android = new ProxyAcesso("Joao",456);
        Android.acessarSistema("Joao", 456);
        try{
            Android.guardarDados("123456789");
        }
        catch(Error e){
            System.out.println(e);
        }
        
        System.out.println();
        System.out.println("Com proxy e filtro");
        FilteredSistema Windows= new FilteredSistema("Joao",678);
        Windows.acessarSistema("Joao", 678);
        Windows.guardarDados("123456789");
    }
    
}
