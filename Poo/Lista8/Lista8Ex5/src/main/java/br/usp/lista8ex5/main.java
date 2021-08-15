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
public class main {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>();
        ArrayList<Integer> B=new ArrayList<Integer>();
        for(int j=0;j<10;j++){
               A.add(j);
       }
        for(int j=0;j<10;j++){
               B.add(j*2);
       }
        MeusVetores vetor=new MeusVetores(A,B);
        vetor.Funcao(new Uniao());
        vetor.Funcao(new Interseccao());
        vetor.Funcao(new Diferenca());
    }
    
}
