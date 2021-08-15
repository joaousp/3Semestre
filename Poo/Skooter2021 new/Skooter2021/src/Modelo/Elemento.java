package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenhador;
import Controler.Tela;
import Auxiliar.Posicao;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author Junio
 */
public abstract class Elemento implements Serializable {

    protected ImageIcon iImage;
    protected Posicao pPosicao;
    protected boolean bTransponivel; /*Pode passar por cima?*/
    protected boolean bMortal;       /*Se encostar, morre?*/
    protected boolean pMovivel;
    protected boolean pNaoRemovivel;
    protected boolean moverCima;
    protected boolean moverBaixo;
    protected boolean moverEsquerda;
    protected boolean moverDireita;
    protected boolean pHero; // É o heroi?
    //TODO colocar um boolean ehcolecionavel
    
    protected Elemento(String sNomeImagePNG) {
        this.pPosicao = new Posicao(1, 1);
        this.bTransponivel = true;
        this.bMortal = false;
        this.pMovivel = false;
        this.pNaoRemovivel = false;
        this.pHero = false;
        
        this.moverCima = false;
        this.moverBaixo = false;
        this.moverEsquerda = false;
        this.moverDireita = false;
        try {
            iImage = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + sNomeImagePNG);
            Image img = iImage.getImage();
            BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            Graphics g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            iImage = new ImageIcon(bi);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public boolean ispHero(){
        return pHero;
    }

    public boolean isMoverCima() {
        return moverCima;
    }

    public void setMoverCima(boolean moverCima) {
        this.moverCima = moverCima;
    }

    public boolean isMoverBaixo() {
        return moverBaixo;
    }

    public void setMoverBaixo(boolean moverBaixo) {
        this.moverBaixo = moverBaixo;
    }

    public boolean isMoverEsquerda() {
        return moverEsquerda;
    }

    public void setMoverEsquerda(boolean moverEsquerda) {
        this.moverEsquerda = moverEsquerda;
    }

    public boolean isMoverDireita() {
        return moverDireita;
    }

    public void setMoverDireita(boolean moverDireita) {
        this.moverDireita = moverDireita;
    }
    
    

    public boolean ispNaoRemovivel() {
        return pNaoRemovivel;
    }

    public void setpNaoRemovivel(boolean pNaoRemovivel) {
        this.pNaoRemovivel = pNaoRemovivel;
    }

    
    
    public boolean isbMortal() {
        return bMortal;
    }

    public void setbMortal(boolean bMortal) {
        this.bMortal = bMortal;
    }
    

    public boolean ispMovivel() {
        return pMovivel;
    }

    public void setpMovivel(boolean pMovivel) {
        this.pMovivel = pMovivel;
    }
    

    public Posicao getPosicao() {
        return pPosicao;
    }

    public boolean isbTransponivel() {
        return bTransponivel;
    }

    public void setbTransponivel(boolean bTransponivel) {
        this.bTransponivel = bTransponivel;
    }

    public boolean setPosicao(int linha, int coluna) {
        return pPosicao.setPosicao(linha, coluna);
    }

    public boolean setPosicao(Posicao umaPosicao) {
        return pPosicao.copia(umaPosicao);
    }

    public boolean moveUp() {
        return this.pPosicao.moveUp();
    }

    public boolean moveDown() {
        return this.pPosicao.moveDown();
    }

    public boolean moveRight() {
        return this.pPosicao.moveRight();
    }

    public boolean moveLeft() {
        return this.pPosicao.moveLeft();
    }
    
   public void autoDesenho(){
        Desenhador.desenhar(this.iImage, pPosicao.getColuna(), pPosicao.getLinha());        
    }    
}
