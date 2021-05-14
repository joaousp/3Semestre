/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.lista3ex8;

import java.lang.Math;

/**
 *
 * @author joaom
 */
public class TimeFutebol implements Comparable<TimeFutebol>{
    private int nVitorias;
    private int nDerrotas;
    private int nEmpates;
    private int nGolsMarcados;
    private int nGolsSofridos;
    private int nCartoesAmarelos;
    private int nCartoesVermelhos;
    private int nPontos;
    private String sNome;

    public TimeFutebol(int nVitorias, int nDerrotas, int nEmpates, int nGolsMarcados, int nGolsSofridos, int nCartoesAmarelos, int nCartoesVermelhos, String sNome) {
        this.nVitorias = nVitorias;
        this.nDerrotas = nDerrotas;
        this.nEmpates = nEmpates;
        this.nGolsMarcados = nGolsMarcados;
        this.nGolsSofridos = nGolsSofridos;
        this.nCartoesAmarelos = nCartoesAmarelos;
        this.nCartoesVermelhos = nCartoesVermelhos;
        this.nPontos = 3*nVitorias+nEmpates;
        this.sNome = sNome;
    }

    public int getnVitorias() {
        return nVitorias;
    }

    public void setnVitorias(int nVitorias) {
        this.nVitorias = nVitorias;
    }

    public int getnDerrotas() {
        return nDerrotas;
    }

    public void setnDerrotas(int nDerrotas) {
        this.nDerrotas = nDerrotas;
    }

    public int getnEmpates() {
        return nEmpates;
    }

    public void setnEmpates(int nEmpates) {
        this.nEmpates = nEmpates;
    }

    public int getnGolsMarcados() {
        return nGolsMarcados;
    }

    public void setnGolsMarcados(int nGolsMarcados) {
        this.nGolsMarcados = nGolsMarcados;
    }

    public int getnGolsSofridos() {
        return nGolsSofridos;
    }

    public void setnGolsSofridos(int nGolsSofridos) {
        this.nGolsSofridos = nGolsSofridos;
    }

    public int getnCartoesAmarelos() {
        return nCartoesAmarelos;
    }

    public void setnCartoesAmarelos(int nCartoesAmarelos) {
        this.nCartoesAmarelos = nCartoesAmarelos;
    }

    public int getnCartoesVermelhos() {
        return nCartoesVermelhos;
    }

    public void setnCartoesVermelhos(int nCartoesVermelhos) {
        this.nCartoesVermelhos = nCartoesVermelhos;
    }

    public int getnPontos() {
        return nPontos;
    }

    public void setnPontos(int nPontos) {
        this.nPontos = nPontos;
    }
    
    public String getNome(){
        return sNome;
    }

   

    @Override
    public int compareTo(TimeFutebol o) {
        if(getnPontos()>o.getnPontos()){
            return 1;
        }
        else if(getnPontos()<o.getnPontos()){
            return -1;
        }
        else{
            //numero de vitorias
            if(getnVitorias()>o.getnVitorias()){
                return 1;
            }
            else if(getnVitorias()<o.getnVitorias()){
                return -1;
            }
            else{
                //saldo de gols
                if((getnGolsMarcados()-getnGolsSofridos())>(o.getnGolsMarcados()-o.getnGolsSofridos())){
                    return 1;
                }
                else if((getnGolsMarcados()-getnGolsSofridos())>(o.getnGolsMarcados()-o.getnGolsSofridos())){
                    return -1;
                }
                else{
                    //gols marcados
                    if(getnGolsMarcados()>o.getnGolsMarcados()){
                        return 1;
                    }
                    else if(getnGolsMarcados()<o.getnGolsMarcados()){
                        return -1;
                    }
                    else{
                        //numero de cartoes vermelhos
                        if(getnCartoesVermelhos()<o.getnCartoesVermelhos()){
                            return 1;
                        }
                        else if(getnCartoesVermelhos()>o.getnCartoesVermelhos()){
                            return -1;
                        }
                        else{
                            //numero de cartoes amarelos
                            if(getnCartoesAmarelos()<o.getnCartoesAmarelos()){
                                return 1;
                            }
                            else if(getnCartoesAmarelos()>o.getnCartoesAmarelos()){
                                return -1;
                            }
                            else{
                                //sorteio
                                int valor = (int)(Math.random() * 10 ) + 1;
                                if(valor>5){
                                    return 1;
                                }
                                else{
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    
}
