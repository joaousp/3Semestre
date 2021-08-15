/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Auxiliar.Posicao;
import Modelo.BlocoMovedor;
import Modelo.Elemento;
import Modelo.ElementoFactory;
import Modelo.Hero;
import Modelo.Quadrado;
import Modelo.Recompensa;
import Modelo.Robo;
import java.util.ArrayList;

/**
 *
 * @author joaom
 */
public class Fase extends ArrayList<Elemento>{

    Fase(int iSize) {
        super(iSize);
    }
    public void setFase1(Hero umHero){
        this.clear();
        this.add(umHero);
        
        //fazendo a bordinha
        //this.add(new Quadrado(new Posicao(0,0), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(0,0), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(0,12), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(0,12), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(12,0), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(12,0), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(12,12), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(12,12), "quadradoVerde.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(i,0), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,0), "quadradoVermelhoLiso.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(i,12), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,12), "quadradoVermelhoLiso.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(0,i'), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(0,i), "quadradoVermelhoLiso.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(12,i), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(12,i), "quadradoVermelhoLiso.png"));
               
        // Adicionando os blocos vermelhos
        for(int j=2;j<11;j=j+2)
            for(int i=2;i<11;i=i+2)
                //this.add(new Quadrado(new Posicao(i,j), "quadradoVermelhoLiso.png"));
                this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,j), "quadradoVermelhoLiso.png"));
        
        // Adicionando os blocos verdes
        //this.add(new Quadrado(new Posicao(4,1), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(4,1), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(10,1), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(10,1), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(1,2), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(1,2), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(3,2), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(3,2), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(5,2), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(5,2), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(2,3), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(2,3), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(6,3), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(6,3), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(10,3), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(10,3), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(9,4), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(9,4), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(1,6), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(1,6), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(3,6), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(3,6), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(7,6), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(7,6), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(6,7), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(6,7), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(10,7), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(10,7), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(7,8), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(7,8), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(11,8), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(11,8), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(2,9), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(2,9), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(4,9), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(4,9), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(8,9), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(8,9), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(10,9), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(10,9), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(5,10), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(5,10), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(9,10), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(9,10), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(2,11), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(2,11), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(8,11), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(8,11), "quadradoVerde.png"));
        
        //adicionar os robos        
        //this.add(new Robo(new Posicao(1,10), "robo_vermelho.png"));
        this.add(ElementoFactory.getElemento("Robo", new Posicao(1,10), "robo_vermelho.png"));
        //this.add(new Robo(new Posicao(11,10), "robo_verde.png"));
        this.add(ElementoFactory.getElemento("Robo", new Posicao(11,10), "robo_verde.png"));
        //this.add(new Robo(new Posicao(11,2), "robo_azul.png")); 
        this.add(ElementoFactory.getElemento("Robo", new Posicao(11,2), "robo_azul.png"));
        //this.add(new Robo(new Posicao(3,1), "robo_amarelo.png"));
        this.add(ElementoFactory.getElemento("Robo", new Posicao(3,1), "robo_amarelo.png"));
                
        // Adicionando as Recompensas        
        //this.add(new Recompensa(new Posicao(1,1), "uva.png"));
        this.add(ElementoFactory.getElemento("Recompensa", new Posicao(1,1), "uva.png"));
        //this.add(new Recompensa(new Posicao(1,11), "uva.png"));
        this.add(ElementoFactory.getElemento("Recompensa", new Posicao(1,11), "uva.png"));
        //this.add(new Recompensa(new Posicao(11,1), "uva.png"));
        this.add(ElementoFactory.getElemento("Recompensa", new Posicao(11,1), "uva.png"));
        //this.add(new Recompensa(new Posicao(11,11), "uva.png"));
        this.add(ElementoFactory.getElemento("Recompensa", new Posicao(11,11), "uva.png"));
    }
    
    public void setFase2(Hero umHero){
        this.clear();
        this.add(umHero);
        
        //fazendo a bordinha
        //this.add(new Quadrado(new Posicao(0,0), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(0,0), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(0,12), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(0,12), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(12,0), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(12,0), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(12,12), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(12,12), "quadradoVerde.png"));
        
        //borda vermelha
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(i,0), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,0), "quadradoVermelhoLiso.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(i,12), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,12), "quadradoVermelhoLiso.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(0,i), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(0,i), "quadradoVermelhoLiso.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(12,i), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(12,i), "quadradoVermelhoLiso.png"));
        
        //estrutura vermelha fase
        for(int i=4;i<9;i=i+4)
            //this.add(new Quadrado(new Posicao(2,i), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(2,i), "quadradoVermelhoLiso.png"));
        for(int i=4;i<9;i=i+4)
            //this.add(new Quadrado(new Posicao(6,i), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(6,i), "quadradoVermelhoLiso.png"));
        for(int i=4;i<9;i=i+4)
            //this.add(new Quadrado(new Posicao(10,i), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(10,i), "quadradoVermelhoLiso.png"));
        for(int i=2;i<11;i=i+2)
            //this.add(new Quadrado(new Posicao(4,i), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(4,i), "quadradoVermelhoLiso.png"));
        for(int i=2;i<11;i=i+2)
            //this.add(new Quadrado(new Posicao(8,i), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(8,i), "quadradoVermelhoLiso.png"));
                
        //colocar os robos        
        //this.add(new Robo(new Posicao(1,10), "robo_vermelho.png"));
        this.add(ElementoFactory.getElemento("Robo", new Posicao(1,10), "robo_vermelho.png"));
        //this.add(new Robo(new Posicao(11,10), "robo_verde.png"));
        this.add(ElementoFactory.getElemento("Robo", new Posicao(11,10), "robo_verde.png"));
        //this.add(new Robo(new Posicao(11,2), "robo_azul.png"));
        this.add(ElementoFactory.getElemento("Robo", new Posicao(11,2), "robo_azul.png"));
        //this.add(new Robo(new Posicao(3,1), "robo_amarelo.png"));
        this.add(ElementoFactory.getElemento("Robo", new Posicao(3,1), "robo_amarelo.png"));
                              
        //------------------------------
        //bloco up        
        //this.add(new BlocoMovedor(new Posicao(4,1), "SetaBlocoCima.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(4,1), "SetaBlocoCima.png"));
        //this.add(new BlocoMovedor(new Posicao(5,1), "SetaBlocoCima.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(5,1), "SetaBlocoCima.png"));
        //this.add(new BlocoMovedor(new Posicao(6,1), "SetaBlocoCima.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(6,1), "SetaBlocoCima.png"));
        //this.add(new BlocoMovedor(new Posicao(7,1), "SetaBlocoCima.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(7,1), "SetaBlocoCima.png"));
        //this.add(new BlocoMovedor(new Posicao(8,1), "SetaBlocoCima.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(8,1), "SetaBlocoCima.png"));          
        //this.add(new BlocoMovedor(new Posicao(4,7), "SetaBlocoCima.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(4,7), "SetaBlocoCima.png"));
        //this.add(new BlocoMovedor(new Posicao(8,7), "SetaBlocoCima.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(8,7), "SetaBlocoCima.png"));
        //this.add(new BlocoMovedor(new Posicao(8,9), "SetaBlocoCima.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(8,9), "SetaBlocoCima.png"));
        //this.add(new BlocoMovedor(new Posicao(8,11), "SetaBlocoCima.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(8,11), "SetaBlocoCima.png"));
        //this.add(new BlocoMovedor(new Posicao(4,9), "SetaBlocoCima.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(4,9), "SetaBlocoCima.png"));
        //this.add(new BlocoMovedor(new Posicao(5,9), "SetaBlocoCima.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(5,9), "SetaBlocoCima.png"));
        
        //------------------------------
        //bloco down
        //this.add(new BlocoMovedor(new Posicao(4,3), "SetaBlocoBaixo.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(4,3), "SetaBlocoBaixo.png"));
        //this.add(new BlocoMovedor(new Posicao(8,3), "SetaBlocoBaixo.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(8,3), "SetaBlocoBaixo.png"));
        //this.add(new BlocoMovedor(new Posicao(4,5), "SetaBlocoBaixo.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(4,5), "SetaBlocoBaixo.png"));
        //this.add(new BlocoMovedor(new Posicao(3,5), "SetaBlocoBaixo.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(3,5), "SetaBlocoBaixo.png"));
        //this.add(new BlocoMovedor(new Posicao(8,5), "SetaBlocoBaixo.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(8,5), "SetaBlocoBaixo.png"));
        //this.add(new BlocoMovedor(new Posicao(4,11), "SetaBlocoBaixo.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(4,11), "SetaBlocoBaixo.png"));
        
        //-----------------------------------------------
        //bloco esquerda
        //this.add(new BlocoMovedor(new Posicao(11,4), "SetaBlocoEsquerda.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(11,4), "SetaBlocoEsquerda.png"));
        //this.add(new BlocoMovedor(new Posicao(3,6), "SetaBlocoEsquerda.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(3,6), "SetaBlocoEsquerda.png"));
        //this.add(new BlocoMovedor(new Posicao(3,7), "SetaBlocoEsquerda.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(3,7), "SetaBlocoEsquerda.png"));
        //this.add(new BlocoMovedor(new Posicao(3,8), "SetaBlocoEsquerda.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(3,8), "SetaBlocoEsquerda.png"));
        //this.add(new BlocoMovedor(new Posicao(7,8), "SetaBlocoEsquerda.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(7,8), "SetaBlocoEsquerda.png"));
        //this.add(new BlocoMovedor(new Posicao(5,10), "SetaBlocoEsquerda.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(5,10), "SetaBlocoEsquerda.png"));
        //this.add(new BlocoMovedor(new Posicao(5,11), "SetaBlocoEsquerda.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(5,11), "SetaBlocoEsquerda.png"));
        
        //------------------------------------------------
        //bloco direita        
        //this.add(new BlocoMovedor(new Posicao(1,4), "SetaBlocoDireita.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(1,4), "SetaBlocoDireita.png"));
        //this.add(new BlocoMovedor(new Posicao(3,4), "SetaBlocoDireita.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(3,4), "SetaBlocoDireita.png"));
        //this.add(new BlocoMovedor(new Posicao(5,4), "SetaBlocoDireita.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(5,4), "SetaBlocoDireita.png"));
        //this.add(new BlocoMovedor(new Posicao(7,4), "SetaBlocoDireita.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(7,4), "SetaBlocoDireita.png"));
        //this.add(new BlocoMovedor(new Posicao(9,4), "SetaBlocoDireita.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(9,4), "SetaBlocoDireita.png"));                
        //this.add(new BlocoMovedor(new Posicao(1,8), "SetaBlocoDireita.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(1,8), "SetaBlocoDireita.png"));
        //this.add(new BlocoMovedor(new Posicao(5,8), "SetaBlocoDireita.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(5,8), "SetaBlocoDireita.png"));
        //this.add(new BlocoMovedor(new Posicao(9,8), "SetaBlocoDireita.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(9,8), "SetaBlocoDireita.png"));
        //this.add(new BlocoMovedor(new Posicao(11,8), "SetaBlocoDireita.png"));
        this.add(ElementoFactory.getElemento("BlocoMovedor", new Posicao(11,8), "SetaBlocoDireita.png"));
        
        //colocando a recompensa da fase 2        
        //this.add(new Recompensa(new Posicao(2,6), "cereja.png"));
        this.add(ElementoFactory.getElemento("Recompensa", new Posicao(2,6), "cereja.png"));
        //this.add(new Recompensa(new Posicao(10,6), "cereja.png"));
        this.add(ElementoFactory.getElemento("Recompensa", new Posicao(10,6), "cereja.png"));
        //this.add(new Recompensa(new Posicao(6,2), "cereja.png"));
        this.add(ElementoFactory.getElemento("Recompensa", new Posicao(6,2), "cereja.png"));
        //this.add(new Recompensa(new Posicao(6,10), "cereja.png"));
        this.add(ElementoFactory.getElemento("Recompensa", new Posicao(6,10), "cereja.png"));
    }
    
    public void setFase3(Hero umHero){
        this.clear();
        this.add(umHero);
        
        //fazendo a bordinha
        //this.add(new Quadrado(new Posicao(0,0), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(0,0), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(0,12), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(0,12), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(12,0), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(12,0), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(12,12), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(12,12), "quadradoVerde.png"));
        
        //borda vermelha
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(i,0), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,0), "quadradoVermelhoLiso.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(i,12), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,12), "quadradoVermelhoLiso.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(0,i), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(0,i), "quadradoVermelhoLiso.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(12,i), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(12,i), "quadradoVermelhoLiso.png"));
        
        // Estrutura blocos Vermelhos
        for(int i=3;i<=10;i++)
            //this.add(new Quadrado(new Posicao(i,2), "quadradoVermelho.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,2), "quadradoVermelho.png"));
        for(int i=3;i<10;i++)
            //this.add(new Quadrado(new Posicao(i,10), "quadradoVermelho.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,10), "quadradoVermelho.png"));
        for(int i=2;i<=10;i++)
            //this.add(new Quadrado(new Posicao(2,i), "quadradoVermelho.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(2,i), "quadradoVermelho.png"));
        for(int i=3;i<=10;i++)
            //this.add(new Quadrado(new Posicao(10,i), "quadradoVermelho.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(10,i), "quadradoVermelho.png"));
        for(int i=5;i<=8;i++)
            //this.add(new Quadrado(new Posicao(i,4), "quadradoVermelho.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,4), "quadradoVermelho.png"));
        for(int i=5;i<8;i++)
            //this.add(new Quadrado(new Posicao(i,8), "quadradoVermelho.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,8), "quadradoVermelho.png"));
        for(int i=4;i<=8;i++)
            //this.add(new Quadrado(new Posicao(4,i), "quadradoVermelho.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(4,i), "quadradoVermelho.png"));
        for(int i=5;i<=8;i++)
            //this.add(new Quadrado(new Posicao(8,i), "quadradoVermelho.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(8,i), "quadradoVermelho.png"));
        
        // Adicionando Robos
        //this.add(new Robo(new Posicao(7,1), "robo_azul.png"));
        this.add(ElementoFactory.getElemento("Robo", new Posicao(7,1), "robo_azul.png"));
        //this.add(new Robo(new Posicao(7,3), "robo_amarelo.png"));
        this.add(ElementoFactory.getElemento("Robo", new Posicao(7,3), "robo_amarelo.png"));
        //this.add(new Robo(new Posicao(5,9), "robo_verde.png"));
        this.add(ElementoFactory.getElemento("Robo", new Posicao(5,9), "robo_verde.png"));
        //this.add(new Robo(new Posicao(5,11), "robo_vermelho.png"));
        this.add(ElementoFactory.getElemento("Robo", new Posicao(5,11), "robo_vermelho.png"));
        
        // Adicionando Recompensas
        //this.add(new Recompensa(new Posicao(6,1), "uva.png"));
        this.add(ElementoFactory.getElemento("Recompensa", new Posicao(6,1), "uva.png"));
        //this.add(new Recompensa(new Posicao(6,3), "uva.png"));
        this.add(ElementoFactory.getElemento("Recompensa", new Posicao(6,3), "uva.png"));
        //this.add(new Recompensa(new Posicao(6,9), "uva.png"));
        this.add(ElementoFactory.getElemento("Recompensa", new Posicao(6,9), "uva.png"));
        //this.add(new Recompensa(new Posicao(6,11), "uva.png"));
        this.add(ElementoFactory.getElemento("Recompensa", new Posicao(6,11), "uva.png"));         
    }
    
    public void setFase4(Hero umHero){
        this.clear();
        this.add(umHero);

        //fazendo a bordinha
        //this.add(new Quadrado(new Posicao(0,0), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(0,0), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(0,12), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(0,12), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(12,0), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(12,0), "quadradoVerde.png"));
        //this.add(new Quadrado(new Posicao(12,12), "quadradoVerde.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(12,12), "quadradoVerde.png"));

        //borda vermelha
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(i,0), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,0), "quadradoVermelhoLiso.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(i,12), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(i,12), "quadradoVermelhoLiso.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(0,i), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(0,i), "quadradoVermelhoLiso.png"));
        for(int i=1;i<12;i++)
            //this.add(new Quadrado(new Posicao(12,i), "quadradoVermelhoLiso.png"));
            this.add(ElementoFactory.getElemento("Quadrado", new Posicao(12,i), "quadradoVermelhoLiso.png"));

        // Quadrado Vermelhos
        //this.add(new Quadrado(new Posicao(1,4), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(1,4), "quadradoVermelhoLiso.png"));    
        //this.add(new Quadrado(new Posicao(1,8), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(1,8), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(2,1), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(2,1), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(2,9), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(2,9), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(3,6), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(3,6), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(4,3), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(4,3), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(4,11), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(4,11), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(6,3), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(6,3), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(6,9), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(6,9), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(7,4), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(7,4), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(8,1), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(8,1), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(9,2), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(9,2), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(9,8), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(9,8), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(9,11), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(9,11), "quadradoVermelhoLiso.png"));
        //this.add(new Quadrado(new Posicao(11,2), "quadradoVermelhoLiso.png"));
        this.add(ElementoFactory.getElemento("Quadrado", new Posicao(11,2), "quadradoVermelhoLiso.png"));

       // Quadrado Verdes
       //this.add(new Quadrado(new Posicao(2,2), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(2,2), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(2,4), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(2,4), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(2,6), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(2,6), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(2,8), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(2,8), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(2,10), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(2,10), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(3,3), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(3,3), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(3,5), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(3,5), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(3,7), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(3,7), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(3,9), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(3,9), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(4,2), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(4,2), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(4,4), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(4,4), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(4,6), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(4,6), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(4,8), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(4,8), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(4,10), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(4,10), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(5,3), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(5,3), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(5,5), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(5,5), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(5,7), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(5,7), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(5,9), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(5,9), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(6,2), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(6,2), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(6,4), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(6,4), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(6,6), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(6,6), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(6,8), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(6,8), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(6,10), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(6,10), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(7,3), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(7,3), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(7,5), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(7,5), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(7,7), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(7,7), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(7,9), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(7,9), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(8,2), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(8,2), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(8,4), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(8,4), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(8,6), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(8,6), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(8,8), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(8,8), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(8,10), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(8,10), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(9,3), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(9,3), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(9,5), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(9,5), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(9,7), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(9,7), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(9,9), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(9,9), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(10,2), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(10,2), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(10,4), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(10,4), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(10,6), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(10,6), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(10,8), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(10,8), "quadradoVerdeLiso.png"));
       //this.add(new Quadrado(new Posicao(10,10), "quadradoVerdeLiso.png"));
       this.add(ElementoFactory.getElemento("Quadrado", new Posicao(10,10), "quadradoVerdeLiso.png"));

       // Adicionando Robos
       //this.add(new Robo(new Posicao(11,6), "robo_vermelho.png"));
       this.add(ElementoFactory.getElemento("Robo", new Posicao(11,6), "robo_vermelho.png"));
       //this.add(new Robo(new Posicao(6,1), "robo_verde.png"));
       this.add(ElementoFactory.getElemento("Robo", new Posicao(6,1), "robo_verde.png"));
       //this.add(new Robo(new Posicao(6,11), "robo_azul.png"));     
       this.add(ElementoFactory.getElemento("Robo", new Posicao(6,11), "robo_azul.png"));
       //this.add(new Robo(new Posicao(1,6), "robo_amarelo.png"));
       this.add(ElementoFactory.getElemento("Robo", new Posicao(1,6), "robo_amarelo.png"));

       // Adicionando Colecionaveis
       //this.add(new Recompensa(new Posicao(1,1), "limao.png"));
       this.add(ElementoFactory.getElemento("Recompensa", new Posicao(1,1), "limao.png"));
       //this.add(new Recompensa(new Posicao(11,11), "limao.png"));
       this.add(ElementoFactory.getElemento("Recompensa", new Posicao(11,11), "limao.png"));
       //this.add(new Recompensa(new Posicao(1,11), "limao.png"));
       this.add(ElementoFactory.getElemento("Recompensa", new Posicao(1,11), "limao.png"));
       //this.add(new Recompensa(new Posicao(11,1), "limao.png")); 
       this.add(ElementoFactory.getElemento("Recompensa", new Posicao(11,1), "limao.png"));
    }    
}
