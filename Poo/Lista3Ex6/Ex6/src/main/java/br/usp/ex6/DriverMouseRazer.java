/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.ex6;

/**
 *
 * @author joaom
 */
public abstract class DriverMouseRazer implements InterfaceDispositivos{
    boolean rgbLigado;
    int DPI;
    int pesoGramas;
    boolean ligado;
    boolean calibrado;
    String marca;
    String modelo;
    
    abstract public void ligarRGB();
    abstract public void desligarRGB();
    
    abstract public void modificarDpiPara(int valor);

    public boolean isRgbLigado() {
        return rgbLigado;
    }

    public void setRgbLigado(boolean rgbLigado) {
        this.rgbLigado = rgbLigado;
    }

    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isCalibrado() {
        return calibrado;
    }

    public void setCalibrado(boolean calibrado) {
        this.calibrado = calibrado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
            
    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public int checarStatus() {
        System.out.println("Checando status");
        System.out.println("tudo ok");
        return 100;
    }

    @Override
    public void calibrar() {
        System.out.println("CALIBRANDO....");
        setCalibrado(true);
    }
    
    
    
    
}
