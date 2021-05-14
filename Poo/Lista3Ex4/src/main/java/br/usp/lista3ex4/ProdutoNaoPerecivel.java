/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.lista3ex4;

/**
 *
 * @author joaom
 */
public class ProdutoNaoPerecivel extends Produto {
    protected int anosGarantia;

    public ProdutoNaoPerecivel(int codigo, float precoUnitario, String descricao, int qtdEstoque,int anosGarantia) {
        super(codigo, precoUnitario, descricao, qtdEstoque);
        this.anosGarantia=anosGarantia;
    }

    public int getAnosGarantia() {
        return anosGarantia;
    }
    
}
