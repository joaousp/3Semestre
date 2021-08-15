/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Auxiliar.Posicao;

/**
 *
 * @author joaom
 */
public class Recompensa extends Elemento{
     public Recompensa(Posicao umaPosicao, String arquivo){
        super(arquivo);
        this.setPosicao(umaPosicao);
        bTransponivel=true;
    }
}
