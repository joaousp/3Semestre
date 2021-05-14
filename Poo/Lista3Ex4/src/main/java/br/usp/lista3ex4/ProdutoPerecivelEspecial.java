/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.lista3ex4;

import java.util.Date;

/**
 *
 * @author joaom
 */
public class ProdutoPerecivelEspecial extends ProdutoPerecivel{
    
    public ProdutoPerecivelEspecial(int codigo, float precoUnitario, String descricao, int qtdEstoque, Date dataValidade) {
        super(codigo, precoUnitario, descricao, qtdEstoque, dataValidade);
    }
    public void imprimirNota(){
        System.out.println("---------NOTA_DE_CONTROLE-----------");
        System.out.println("Produto n:"+getCodigo());
        System.out.println(getDescricao());
        //System.out.println("Custando :"+getPrecoUnitario());
        System.out.println("No estoque temos :"+getQtdEstoque());
        System.out.println("Data de validade :"+getDataValidade());
        System.out.println("---------NOTA_DE_CONTROLE-----------");
    }
}
