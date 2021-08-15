package Controler;

import Modelo.Elemento;
import Modelo.Hero;
import Auxiliar.Posicao;
import Modelo.Recompensa;

import java.util.ArrayList;

/**
 *
 * @author junio
 */
public class ControleDeJogo {
    public void desenhaTudo(ArrayList<Elemento> e){
        for(int i = 0; i < e.size(); i++){
            e.get(i).autoDesenho();
        }
    }
    public void processaTudo(ArrayList<Elemento> e){
        /*O heroi (protagonista) eh sempre o primeiro do array*/
        Hero hHero = (Hero) e.get(0);
        Elemento eTemp;
        /*Processa todos os demais em relacao ao heroi*/
        for(int i = 1; i < e.size(); i++){
            eTemp = e.get(i); /*Pega o i-esimo elemento do jogo*/
            /*Verifica se o heroi se sobrepoe ao i-ésimo elemento*/
            if(hHero.getPosicao().estaNaMesmaPosicao(eTemp.getPosicao())){
                /*Nem todos os elementos podem ser transpostos pelo heroi*/
                if(eTemp.isbTransponivel()&&!eTemp.ispNaoRemovivel()){
                    
                    e.remove(eTemp);
                }
                else hHero.voltaAUltimaPosicao();
                
            }
        }
    }
    public boolean ehPosicaoValida(ArrayList<Elemento> e, Posicao p,int tecla){
        Elemento eTemp;
        /*Validacao da posicao de todos os elementos com relacao a Posicao p*/
        for(int i = 1; i < e.size(); i++){ /*Olha todos os elementos*/
            eTemp = e.get(i); /*Pega o i-esimo elemento do jogo*/

            if(!eTemp.isbTransponivel()){
                
                if(eTemp.getPosicao().estaNaMesmaPosicao(p)) {
                    
                    if(eTemp.ispMovivel()){
                        
                     switch (tecla){
                         case 0:
                             eTemp.moveUp();
                             if(ehPosicaoValidaRelativaAUmPersonagem(e,eTemp)){
                                break;
                             }
                             else{
                                 if(!eTemp.ispNaoRemovivel())
                                 e.remove(eTemp);
                                 else {
                                     eTemp.getPosicao().volta();
                                     return false;
                                 }
                             }
                             break;
                         case 1:
                             eTemp.moveDown();
                              if(ehPosicaoValidaRelativaAUmPersonagem(e,eTemp)){
                                break;
                             }
                             else{
                                 if(!eTemp.ispNaoRemovivel())
                                 e.remove(eTemp);
                                 else {
                                     eTemp.getPosicao().volta();
                                     return false;
                                 }
                             
                             }
                             break;
                         case 2:
                             eTemp.moveLeft();
                              if(ehPosicaoValidaRelativaAUmPersonagem(e,eTemp)){
                                break;
                             }
                             else{
                                 if(!eTemp.ispNaoRemovivel())
                                 e.remove(eTemp);
                                 else {
                                     eTemp.getPosicao().volta();
                                     return false;
                                 }
                             
                             }
                             break;
                         case 3:
                             eTemp.moveRight();
                             if(ehPosicaoValidaRelativaAUmPersonagem(e,eTemp)){
                                break;
                             }
                             else{
                                 if(!eTemp.ispNaoRemovivel())
                                 e.remove(eTemp);
                                 else {
                                     eTemp.getPosicao().volta();
                                     return false;
                                 }
                             
                             }
                             break;     
                        }
                    return true;
                    }
                 return false; /*A posicao p é invalida, pois ha um elemento (i-esimo eTemp) intransponivel lá*/
                }
            }
        }
        return true;
    }
   
    
    public int ehBlocoMovimento(ArrayList<Elemento> e, Posicao p){
        Elemento eTemp;
        /*Validacao da posicao de todos os elementos com relacao a Posicao p*/
        for(int i = 1; i < e.size(); i++){ /*Olha todos os elementos*/
            eTemp = e.get(i); /*Pega o i-esimo elemento do jogo*/

            if(eTemp.isbTransponivel()){
                if(eTemp.getPosicao().estaNaMesmaPosicao(p)) {
                    if(eTemp.ispNaoRemovivel()){
                        if(eTemp.isMoverCima())return 1;
                        if(eTemp.isMoverBaixo())return 2;
                        if(eTemp.isMoverEsquerda())return 3;
                        if(eTemp.isMoverDireita())return 4;
                        
                        
                    }
                    return 0;
                }
            }
        }
        return 0;
    }
    public boolean ehPosicaoMortal(ArrayList<Elemento> e, Posicao p){
        Elemento eTemp;
        /*Validacao da posicao de todos os elementos com relacao a Posicao p*/
        for(int i = 1; i < e.size(); i++){ /*Olha todos os elementos*/
            eTemp = e.get(i); /*Pega o i-esimo elemento do jogo*/

            if(!eTemp.isbTransponivel()){
                
                if(eTemp.getPosicao().estaNaMesmaPosicao(p)) {
                    
                    if(eTemp.isbMortal()){
                        e.remove(eTemp);
                        return false;
                    }
                   
                    return true; /*A posicao p é invalida, pois ha um elemento (i-esimo eTemp) intransponivel lá*/
                }
            }
        }
        return true;
    }
    
      public boolean ehPosicaoValidaRelativaAUmPersonagem(ArrayList<Elemento> e, Elemento umElemento){
        Elemento eTemp;
        /*Validacao da posicao de todos os elementos com relacao a Posicao p*/
        for(int i = 1; i < e.size(); i++){ /*Olha todos os elementos*/
            eTemp = e.get(i); /*Pega o i-esimo elemento do jogo*/
            if(eTemp==umElemento)
                continue;
            if(!eTemp.ispMovivel()||!eTemp.isbTransponivel())
                if(eTemp.getPosicao().estaNaMesmaPosicao(umElemento.getPosicao()))
                    return false; /*A posicao p é invalida, pois ha um elemento (i-esimo eTemp) intransponivel lá*/
        }
        
        return true;
    }
      
      //TODO mudar o instanceof
      public boolean hasRecompensasAinda(ArrayList<Elemento> e){
            Elemento eTemp;
            for(int i = 1; i < e.size(); i++){
                eTemp = e.get(i); /*Pega o i-esimo elemento do jogo*/
                if(eTemp instanceof Recompensa){
                    //System.out.println("Achei fruta");
                    return true;
                }
            }
            //System.out.println("Acabou");
            return false;
      }
    
          
}
    

