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
public abstract class DividaDecorator extends Divida{
    
    
    protected float alteradorDivida;

    public DividaDecorator(float alteradorDivida, Divida objeto) {
        super(objeto.getTotalDivida(), objeto.getMesesParaPagar());
        this.alteradorDivida = alteradorDivida;
    }

    public float getAlteradorDivida() {
        return alteradorDivida;
    }

    public void setAlteradorDivida(float alteradorDivida) {
        this.alteradorDivida = alteradorDivida;
    }
    
    
    
}
      
