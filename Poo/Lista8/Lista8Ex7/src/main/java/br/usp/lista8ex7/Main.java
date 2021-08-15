/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.lista8ex7;

/**
 *
 * @author joaom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Divida novaDivida=new Divida(1500, 12); //1500 reais com 12 meses para pagar
        System.out.println(novaDivida.Calculo()+" Reais a serem pagos");
        Juros DividaComJuros = new Juros(10, novaDivida);//10 reais de juros mensais em cima da divida original
        System.out.println(DividaComJuros.Calculo()+" Reais a serem pagos");
        JurosComDesconto DividaComJurosComDesconto = new JurosComDesconto(25, DividaComJuros);//25 reais de desconto em cima da divida original
        System.out.println(DividaComJurosComDesconto.Calculo()+" Reais a serem pagos");
        JurosComDescontoComTaxas DividaComJurosComDescontoComTaxas= new JurosComDescontoComTaxas(15, DividaComJurosComDesconto);//75 reais de desconto em cima da divida original
        System.out.println(DividaComJurosComDescontoComTaxas.Calculo()+" Reais a serem pagos");
    }
    
}
