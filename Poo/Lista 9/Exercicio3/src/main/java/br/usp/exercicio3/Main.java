/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.exercicio3;

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
        No<Float> arvore = new No<Float>(30F);
        arvore.setEhRaiz(true);
        try{
            arvore.adiciona(10F);
            arvore.adiciona(20F);
            arvore.adiciona(40F);
            arvore.adiciona(50F);
            arvore.adiciona(60F);
            
            arvore.percorre();
            
            arvore.Busca(10F);
            arvore.Busca(60F);
            arvore.Busca(70F);
            
            arvore.Remocao(10F);
            arvore.Remocao(50F);
            
            arvore.Busca(10F);
            
            arvore.percorre();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
