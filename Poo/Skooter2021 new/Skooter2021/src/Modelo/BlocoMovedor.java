package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Auxiliar.Posicao;
import Controler.Tela;
import java.awt.Graphics;
import java.io.Serializable;

public class BlocoMovedor extends Elemento implements Serializable{
    //Construtor
    public BlocoMovedor(Posicao posicao, String arquivo) {
        super(arquivo);
        this.pPosicao=posicao;
        this.bTransponivel = true;
        //this.moverBaixo=true;
        this.pNaoRemovivel=true;
        
        switch (arquivo){
        case "SetaBlocoCima.png":
            this.moverCima = true;
            break;
        case "SetaBlocoBaixo.png":
            this.moverBaixo = true;
            
            break;
        case "SetaBlocoEsquerda.png":
            this.moverEsquerda = true;
            break;
        case "SetaBlocoDireita.png":
            this.moverDireita = true;
            break;
        }
        
    }
    
}
