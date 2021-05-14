/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.lista3ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author joaom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        Date dataFormatada = formato.parse("14/05/2021"); 
        
        ProdutoPerecivel banana=new ProdutoPerecivel(1, (float) 0.5, "Banana", 20, dataFormatada); 
        
        dataFormatada = formato.parse("12/05/2021"); 
        ProdutoPerecivelEspecial fermento = new ProdutoPerecivelEspecial(2, (float) 1.50, "Fermento Biologico", 15, dataFormatada);
        
        ProdutoNaoPerecivel arroz = new ProdutoNaoPerecivel(3, 25, "Saco Arroz 5kg", 47, 4);
        Estoque deposito=new Estoque();
        deposito.cadastrarProduto(banana);
        deposito.cadastrarProduto(fermento);
        deposito.cadastrarProduto(arroz);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
        dataFormatada = formato.parse("07/05/2021"); 
        int a=deposito.retirarProduto(1,10, dataFormatada);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");
        Produto teste;
        teste=deposito.consultarCodigo(1);
        teste.imprimirProduto();
        
        deposito.custoDeTodosOsProdutos();
        deposito.imprimirEstoque();
    
    
    
    }
    
}
