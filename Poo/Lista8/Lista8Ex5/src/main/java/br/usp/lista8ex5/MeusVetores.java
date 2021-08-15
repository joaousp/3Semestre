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
public class MeusVetores {
    public ArrayList<Integer> VetorA;
    public ArrayList<Integer> VetorB;

    public MeusVetores(ArrayList<Integer> VetorA, ArrayList<Integer> VetorB) {
        this.VetorA = VetorA;
        this.VetorB = VetorB;
    }

    public ArrayList<Integer> getVetorA() {
        return VetorA;
    }

    public void setVetorA(ArrayList<Integer> VetorA) {
        this.VetorA = VetorA;
    }

    public ArrayList<Integer> getVetorB() {
        return VetorB;
    }

    public void setVetorB(ArrayList<Integer> VetorB) {
        this.VetorB = VetorB;
    }
    public ArrayList<Integer> Funcao(funcaoAtivada Objeto ){
        return Objeto.function(this);
    }
    
    
    
}
