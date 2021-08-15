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
public class Divida implements Funcao{
    private float totalDivida;
    private int mesesParaPagar;

    public Divida(float totalDivida,int mesesParaPagar) {
        this.totalDivida = totalDivida;
        this.mesesParaPagar=mesesParaPagar;
    }

    public float getTotalDivida() {
        return totalDivida;
    }

    public void setTotalDivida(float totalDivida) {
        this.totalDivida = totalDivida;
    }

    public int getMesesParaPagar() {
        return mesesParaPagar;
    }

    public void setMesesParaPagar(int mesesParaPagar) {
        this.mesesParaPagar = mesesParaPagar;
    }
    
    
    
    
    @Override
    public float Calculo() {
        return totalDivida; //To change body of generated methods, choose Tools | Templates.
    }
    
}
