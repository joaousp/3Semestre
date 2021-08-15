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
public class JurosComDesconto extends DividaDecorator{
    
    Juros ObjetoOriginal;
    
    public JurosComDesconto( float alteradorDivida, Juros objeto) {
        super(alteradorDivida, objeto);
        ObjetoOriginal=objeto;
    }

    public Juros getObjetoOriginal() {
        return ObjetoOriginal;
    }

    public void setObjetoOriginal(Juros ObjetoOriginal) {
        this.ObjetoOriginal = ObjetoOriginal;
    }
    
    public float Calculo() {
        
        float dividaMensal=getTotalDivida()/getMesesParaPagar();
        float dividaMensalComJuros=0;
        for(int i=0;i<getMesesParaPagar();i++){
            dividaMensalComJuros=dividaMensalComJuros+dividaMensal+ObjetoOriginal.getAlteradorDivida();
        }
        
        return dividaMensalComJuros-alteradorDivida;
    }
   
}
