/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.lista3ex4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author joaom
 */
public class Estoque {
    private ArrayList<Produto> Lista = new ArrayList();

    public Estoque() {
    }
    
    public void cadastrarProduto(Produto p){
        Lista.add(p);
    }
    public Produto consultarCodigo(int codigo){
        Iterator<Produto> iterator=Lista.iterator();
        while(iterator.hasNext()){
            Produto produto=iterator.next();
            if(produto.getCodigo()==codigo){
                return produto;
            }
        }
        return null;
    }
    
    public int retirarProduto(int codigo,int quantidade,Date hoje){
        Produto produto=consultarCodigo(codigo);
        if(produto!=null){
            //instanceof
      
            int a=produto.retirarEstoque(quantidade);
            return a;
        }
        return 0;
    }
    public float custoDeTodosOsProdutos(){
        Iterator<Produto> iterator=Lista.iterator();
        float soma=0;
        while(iterator.hasNext()){
            Produto produto=iterator.next();
            soma=soma+(produto.getPrecoUnitario()*produto.getQtdEstoque());
        }
        return soma;
    }
    public void imprimirEstoque(){
        Iterator<Produto> iterator=Lista.iterator();
        
        while(iterator.hasNext()){
            Produto produto=iterator.next();
            produto.imprimirProduto();
        }
    }
           
}
