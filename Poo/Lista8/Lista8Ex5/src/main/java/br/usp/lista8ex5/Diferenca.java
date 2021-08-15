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
public class Diferenca implements funcaoAtivada{

    @Override
    public ArrayList<Integer> function(MeusVetores vetor) {
       ArrayList<Integer> C = new ArrayList<Integer>();
       int i;
       int j;
       int diferencial=0;
       for (i=0;i<vetor.getVetorA().size();i++){
            for(j=0;j<vetor.getVetorB().size();j++){
                if(vetor.getVetorA().get(i)==vetor.getVetorB().get(j))
                    diferencial=1;
                }
            if(diferencial==0)C.add(vetor.getVetorA().get(i));
            diferencial=0;
        }
        for (i=0;i<vetor.getVetorB().size();i++){
            for(j=0;j<vetor.getVetorA().size();j++){
                if(vetor.getVetorB().get(i)==vetor.getVetorA().get(j))
                    diferencial=1;
                }
            if(diferencial==0)C.add(vetor.getVetorB().get(i));
            diferencial=0;
        }
        for(i=0;i<C.size();i++){
            for(j=i+1;j<C.size();j++){
                if(C.get(i).equals(C.get(j))){
                    C.remove(j);
                    j--;
                }
            }
        }
        
        System.out.println("Diferenca");
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
