
package Modelo;

import Auxiliar.Posicao;

public class ElementoFactory {
    
    public static Elemento getElemento(String tipo, Posicao umaPosicao, String arquivo){
        Elemento elemento = null;
        
        if (tipo.equals("Quadrado")){
            elemento = new Quadrado(umaPosicao, arquivo);
        }
        else if (tipo.equals("BlocoMovedor")){
            elemento = new BlocoMovedor(umaPosicao, arquivo);
        }
        else if (tipo.equals("Recompensa")){
            elemento = new Recompensa(umaPosicao, arquivo);
        }
        else {
            elemento = new Robo(umaPosicao, arquivo);
        }
        
        return elemento;
    }
    
}
