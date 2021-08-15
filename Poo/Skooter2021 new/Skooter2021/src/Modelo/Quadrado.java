/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Auxiliar.Desenhador;
import Auxiliar.Posicao;

/**
 *
 * @author joaom
 */
public class Quadrado extends Elemento {
    String tipoQuadrado;
    private int contador;
    
    // Construtor    
    public Quadrado(Posicao umaPosicao, String arquivo) {
        super(arquivo);
        this.setPosicao(umaPosicao);
        this.tipoQuadrado = arquivo;
        
        switch (arquivo) {
            case "quadradoVerde.png":
                bTransponivel = false;
                pMovivel = true;
                break;
            
            case "quadradoVerdeLiso.png":
                bTransponivel = true;
                pMovivel = false;                
                break;
                
            case "quadradoVermelhoLiso.png":
                bTransponivel=false;
                break;
            
            case "quadradoVermelho.png":
                bTransponivel=false;
                pMovivel=true;
                pNaoRemovivel=true;
                break;
        }
    }
    
    @Override
     public void autoDesenho(){
         
         switch (tipoQuadrado) {
            case "quadradoVerde.png":             
                if(!Desenhador.getTelaDoJogo().ehPosicaoValidaRelativaAUmPersonagem(this)){
                    Desenhador.getTelaDoJogo().removeElemento(this);        
                }

                super.autoDesenho();
                break;
            
            case "quadradoVerdeLiso.png":
                if(!Desenhador.getTelaDoJogo().ehPosicaoValidaRelativaAUmPersonagem(this)){
                    Desenhador.getTelaDoJogo().removeElemento(this);        
                }

                super.autoDesenho();
                break;
                
            case "quadradoVermelho.png":
                super.autoDesenho();
                break;
            
            case "quadradoVermelhoLiso.png":
                contador = 0;
                
                if(!Desenhador.getTelaDoJogo().ehPosicaoValidaRelativaAUmPersonagem(this)){
                    contador++;
                    System.out.println("Nao rola patrao");
                    System.out.println(this.getPosicao().getLinha()+" "+this.getPosicao().getColuna());
                    System.out.println(contador);
                    this.getPosicao().volta();
                }
              
                //setpMovivel(true);
                super.autoDesenho();           
        }
        
        
       
    }
     
     
     
    
    
    
    
}
