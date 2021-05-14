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
public class Produto {
    protected int codigo;
    protected float precoUnitario;
    protected String descricao;
    protected int qtdEstoque;

    public Produto(int codigo, float precoUnitario, String descricao, int qtdEstoque) {
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.descricao = descricao;
        this.qtdEstoque = qtdEstoque;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }
    
    public int retirarEstoque(int quantidade){
        int aux=getQtdEstoque();
        aux = aux-quantidade;
        if(aux<0){
            System.out.println("Nao é possivel retirar tanto, so temos :"+getQtdEstoque());
            aux=getQtdEstoque();
            this.qtdEstoque=0;
            return aux;
        }
        this.qtdEstoque=aux;
        return aux;
    }
    public boolean acrescertarEstoque(int quantidade){
        int aux=getQtdEstoque();
        aux = aux+quantidade;
        this.qtdEstoque=aux;
        return true;
        
    }
    public void imprimirProduto(){
        System.out.println("--------------------");
        System.out.println("Produto n:"+getCodigo());
        System.out.println(getDescricao());
        System.out.println("Custando :"+getPrecoUnitario());
        System.out.println("No estoque temos :"+getQtdEstoque());
        System.out.println("--------------------");
    }
    
}
