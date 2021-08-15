package Controler;

import Modelo.*;
import Auxiliar.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;


/**
 *
 * @author junio
 */
public class Tela extends javax.swing.JFrame implements MouseListener, KeyListener {

    private Hero hHero;
    private ArrayList<Elemento> eElementos;
    private ControleDeJogo cControle = new ControleDeJogo();
    private Graphics g2;
    private Fase minhaFase;
    private int nivelFase=0;
    /**
     * Creates new form
     */
    public Tela() {
        Desenhador.setCenario(this); /*Desenhador funciona no modo estatico*/
        initComponents();
 
        this.addMouseListener(this); /*mouse*/
        this.addKeyListener(this);   /*teclado*/
        
        /*Cria a janela do tamanho do cenario + insets (bordas) da janela*/
        this.setSize(Consts.RES * Consts.CELL_SIDE + getInsets().left + getInsets().right,
                Consts.RES * Consts.CELL_SIDE + getInsets().top + getInsets().bottom);

        /*Este array vai guardar os elementos graficos*/
        eElementos = new ArrayList<Elemento>(100);

    
        /*Cria eElementos adiciona elementos*/
        /*O protagonista (heroi) necessariamente precisa estar na posicao 0 do array*/
        hHero =  Hero.getInstance("skooter_hero.png"); /* https://www.online-image-editor.com/ */
        if(nivelFase==0)nivelFase=1;
        hHero.setPosicao(7, 5);
        this.addElemento(hHero);
        minhaFase= new Fase(100);
        minhaFase.setFase1(hHero);
        eElementos = minhaFase;
        

    }
    
    public void addElemento(Elemento umElemento) {
        eElementos.add(umElemento);
    }

    public void removeElemento(Elemento umElemento) {
        eElementos.remove(umElemento);
    }

    public Graphics getGraphicsBuffer(){
        return g2;
    }
    
    /*Este metodo eh executado a cada Consts.FRAME_INTERVAL milissegundos*/    
    public void paint(Graphics gOld) {
        Graphics g = this.getBufferStrategy().getDrawGraphics();
        /*Criamos um contexto gráfico*/
        g2 = g.create(getInsets().left, getInsets().top, getWidth() - getInsets().right, getHeight() - getInsets().top);

        /*Desenha cenário*/
        for (int i = 0; i < Consts.RES; i++) {
            for (int j = 0; j < Consts.RES; j++) {
                try {
                    /*Linha para alterar o background*/
                    Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "background.png");
                    g2.drawImage(newImage,j*Consts.CELL_SIDE, i*Consts.CELL_SIDE, Consts.CELL_SIDE, Consts.CELL_SIDE, null);

                } catch (IOException ex) {
                    Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        /*Aqui podem ser inseridos novos processamentos de controle*/
        if (!this.eElementos.isEmpty()) {
            
            this.cControle.processaTudo(eElementos);
            
            this.cControle.desenhaTudo(eElementos);
            if (!cControle.ehPosicaoMortal(this.eElementos,hHero.getPosicao())) {
                this.eElementos.clear();
                hHero =  Hero.getInstance("skooter_hero.png"); /* https://www.online-image-editor.com/ */
                hHero.setPosicao(5,5 );
                this.addElemento(hHero);
                minhaFase= new Fase(100);
                minhaFase.setFase1(hHero);
                eElementos = minhaFase;
                nivelFase=1;
            }
            //TODO mudar hasRecompensasAinda
            if(!this.cControle.hasRecompensasAinda(eElementos)&&nivelFase==1){
                this.eElementos.clear();
                hHero =  Hero.getInstance("skooter_hero.png"); /* https://www.online-image-editor.com/ */
                hHero.setPosicao(5,5 );
                this.addElemento(hHero);
                minhaFase= new Fase(100);
                minhaFase.setFase2(hHero);
                eElementos = minhaFase;
                nivelFase=2;
                
            }
            
            if(!this.cControle.hasRecompensasAinda(eElementos)&&nivelFase==2){
                     
                this.eElementos.clear();
                hHero =  Hero.getInstance("skooter_hero.png");
                hHero.setPosicao(5,5 );
                this.addElemento(hHero);
                minhaFase= new Fase(100);
                minhaFase.setFase3(hHero);
                eElementos = minhaFase;
                nivelFase=3;
            }
            //TODO concertar isso
            if(!this.cControle.hasRecompensasAinda(eElementos)&&nivelFase==3){
                this.eElementos.clear();
                hHero =  Hero.getInstance("skooter_hero.png"); /* https://www.online-image-editor.com/ */
                hHero.setPosicao(5,6);
                this.addElemento(hHero);
                minhaFase= new Fase(100);
                minhaFase.setFase4(hHero);
                eElementos = minhaFase;
                nivelFase=4;
            }

            
            
        }

        g.dispose();
        g2.dispose();
        if (!getBufferStrategy().contentsLost()) {
            getBufferStrategy().show();
        }
    }

    public void go() {
        TimerTask redesenhar = new TimerTask() {
            public void run() {
                repaint(); /*(executa o metodo paint)*/
            }
        };        
        
        /*Redesenha (executa o metodo paint) tudo a cada Consts.FRAME_INTERVAL milissegundos*/
        Timer timer = new Timer();
        timer.schedule(redesenhar, 0, Consts.FRAME_INTERVAL);
    }

    public void keyPressed(KeyEvent e) {
        int tecla=-1;
        /*Movimento do heroi via teclado*/
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hHero.moveUp();
            tecla=0;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hHero.moveDown();
            tecla=1;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hHero.moveLeft();
            tecla=2;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hHero.moveRight();
            tecla=3;
        } else if (e.getKeyCode() == KeyEvent.VK_R) {
            this.eElementos.clear();
            hHero =  Hero.getInstance("skooter_hero.png"); /* https://www.online-image-editor.com/ */
            hHero.setPosicao(5,5 );
            this.addElemento(hHero);
            minhaFase= new Fase(100);
            minhaFase.setFase1(hHero);
            eElementos = minhaFase;
            nivelFase=1;
        }
        
        /*Se o heroi for para uma posicao invalida, sobre um elemento intransponivel, volta para onde estava*/
        if (!cControle.ehPosicaoMortal(this.eElementos,hHero.getPosicao())) {
            this.eElementos.clear();
            hHero =  Hero.getInstance("skooter_hero.png"); /* https://www.online-image-editor.com/ */
            hHero.setPosicao(5,5 );
            this.addElemento(hHero);
            minhaFase= new Fase(100);
            minhaFase.setFase1(hHero);
            eElementos = minhaFase;
            nivelFase=1;
        }
        if (!cControle.ehPosicaoValida(this.eElementos,hHero.getPosicao(),tecla)) {
            hHero.voltaAUltimaPosicao();
            
        }
        int direcao=cControle.ehBlocoMovimento(this.eElementos,hHero.getPosicao());
        
        //vou trabalhar da mesma forma que nos jogos de pokemon, pisou no bloco vai ate o fim;
        while (direcao!=0) {
            
            if(direcao==1)hHero.moveUp();
            if(direcao==2)hHero.moveDown();
            if(direcao==3)hHero.moveLeft();
            if(direcao==4)hHero.moveRight();
            direcao=cControle.ehBlocoMovimento(this.eElementos,hHero.getPosicao());
                       
        }
        
        this.setTitle("-> Cell: " + (hHero.getPosicao().getColuna()) + ", " + (hHero.getPosicao().getLinha()));
    }

    public void mousePressed(MouseEvent e) {
         //Movimento via mouse
         int x = e.getX();
         int y = e.getY();
     
         this.setTitle("X: "+ x + ", Y: " + y +
         " -> Cell: " + (y/Consts.CELL_SIDE) + ", " + (x/Consts.CELL_SIDE));
        
         this.hHero.getPosicao().setPosicao(y/Consts.CELL_SIDE, x/Consts.CELL_SIDE);

        /*Se o heroi for para uma posicao invalida, sobre um elemento intransponivel, volta para onde estava*/
        if (!cControle.ehPosicaoValida(this.eElementos,hHero.getPosicao(),-1)) {
            
            hHero.voltaAUltimaPosicao();
        }         
         
        repaint();
    }
    public boolean ehPosicaoValida(Posicao umaPosicao){
        return cControle.ehPosicaoValida(this.eElementos, umaPosicao,-1);
        
    }
    
    public boolean ehPosicaoValidaRelativaAUmPersonagem(Elemento umPersonagem){
        return cControle.ehPosicaoValidaRelativaAUmPersonagem(this.eElementos, umPersonagem);
    }
    public ControleDeJogo getControle(){
        return this.cControle;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POO2021");
        setAutoRequestFocus(false);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
}
