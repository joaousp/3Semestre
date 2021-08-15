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
public class JurosComDescontoComTaxas extends DividaDecorator{
    
    JurosComDesconto ObjetoOriginalComDesconto;
    public JurosComDescontoComTaxas(float alteradorDivida, JurosComDesconto objeto) {
        super(alteradorDivida, objeto);
        ObjetoOriginalComDesconto=objeto;
    }
     public float Calculo() {
        float dividaMensal=getTotalDivida()/getMesesParaPagar();
        float dividaMensalComJuros=0;
        for(int i=0;i<getMesesParaPagar();i++){
            dividaMensalComJuros=dividaMensalComJuros+dividaMensal+ObjetoOriginalComDesconto.getObjetoOriginal().getAlteradorDivida();
        }
        dividaMensalComJuros=dividaMensalComJuros-ObjetoOriginalComDesconto.getAlteradorDivida();
        return dividaMensalComJuros+alteradorDivida;
    }
    
}
