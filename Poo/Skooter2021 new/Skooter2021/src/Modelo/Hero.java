package Modelo;

import java.io.*;

/**
 *
 * @author Junio
 */
public class Hero extends Elemento implements Serializable{
    private static Hero instance;
    private Hero(String sNomeImagePNG) {
        super(sNomeImagePNG);
        pHero = true;

    }
    public static Hero getInstance(String sNomeImagePNG){
        if(instance==null){
            instance=new Hero(sNomeImagePNG);
        }
        return instance;
    }

    public void voltaAUltimaPosicao(){
        this.pPosicao.volta();
    }
}
