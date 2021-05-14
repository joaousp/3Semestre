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
public class ProdutoPerecivel extends Produto{
   
    protected Date dataValidade;

    public ProdutoPerecivel(int codigo, float precoUnitario, String descricao, int qtdEstoque, Date dataValidade) {
        super(codigo,precoUnitario,descricao,qtdEstoque);
        this.dataValidade = dataValidade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public int retirarEstoque(int quantidade, Date hoje){
        long diff = (getDataValidade().getTime() - hoje.getTime());
        //System.out.println(getDataValidade().getTime()+" "+hoje);
        if((diff/(1000 * 60 * 60 * 24))>30){
            int aux=getQtdEstoque();
            aux = aux-quantidade;
            if(aux<0){
                System.out.println("Nao é possivel retirar tanto, so temos :"+getQtdEstoque());
                aux=super.getQtdEstoque();
                this.qtdEstoque=0;
                return aux;
            }
            this.qtdEstoque=aux;
            return aux;
        }
        else{
            //produto vai vencer
            System.out.println("Produto muito proximo de vencimento");
            qtdEstoque=0;
            return 0;
        }
    }
   
   
    @Override
    public boolean acrescertarEstoque(int quantidade){
        boolean verificador;
        int aux=getQtdEstoque();
        if(aux<=0){
            aux = aux+quantidade;
            this.qtdEstoque=aux;
            verificador=true;
            return verificador;
        }
        else{
            verificador=false;
            return verificador;
        }
    }
    
    
    
}
