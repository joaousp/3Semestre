/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.lista8ex7;

/**
 *
 * @author joaom
 */
public class Juros extends DividaDecorator {
    
    public Juros(float alteradorDivida, Divida objeto) {
       super(alteradorDivida, objeto);
    }
    
    @Override
    public float Calculo() {
        float dividaMensal=getTotalDivida()/getMesesParaPagar();
        float dividaMensalComJuros=0;
        for(int i=0;i<getMesesParaPagar();i++){
            dividaMensalComJuros=dividaMensalComJuros+dividaMensal+alteradorDivida;
        }
        return dividaMensalComJuros;
    }
    
}
