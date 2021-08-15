/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.lista8ex5;

import java.util.ArrayList;

/**
 *
 * @author joaom
 */
public class Uniao implements funcaoAtivada{

    @Override
    public ArrayList<Integer> function(MeusVetores vetor) {
       ArrayList<Integer> C = new ArrayList<Integer>();
       int i;
       int j;
       for (i=0;i<vetor.getVetorA().size();i++){
        C.add(vetor.getVetorA().get(i));
       }
       for(j=0;j<vetor.getVetorB().size();j++){
               C.add(vetor.getVetorB().get(j));
               
       }
        for(i=0;i<C.size();i++){
            for(j=i+1;j<C.size();j++){
                if(C.get(i).equals(C.get(j))){
                    C.remove(j);
                    j--;
                }
            }
        }
        System.out.println("Uniao");
        System.out.println("Vetor A");   
        for(j=0;j<vetor.getVetorA().size();j++){
               System.out.print(vetor.getVetorA().get(j)+" ");
       }
        System.out.println(" ");
        System.out.println("Vetor B");   
        for(j=0;j<vetor.getVetorB().size();j++){
               System.out.print(vetor.getVetorB().get(j)+" ");
       }
        System.out.println(" ");
        System.out.println("Vetor Resultante ");   
        for(j=0;j<C.size();j++){
               System.out.print(C.get(j)+" ");
       }
        
        System.out.println(" ");
        return C;
    }
    
}
