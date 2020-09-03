/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automovel;

/**
 *
 * @author vladi
 */
public class Automovel extends Terrestre{
    private String cor;
    private int numPortas;
    private String placa;

    public Automovel(){
            super(5,4);
    }

    public Automovel(int capacidade, int numRodas, String cor, int numPortas, String placa){
            super(capacidade,numRodas);
            this.cor= cor;
            this.numPortas = numPortas;
            this.placa= placa;
    }

    public String getCor(){
        return cor;
    }

    public String getPlaca(){
        return placa;
    }

    public int getNumPortas(){
        return numPortas;
    }

    public void setCor(String cor){
            this.cor = cor;
    }

    public void setNumPortas(int numPortas){
            this.numPortas = numPortas;
    }

    public void setPlaca(String placa){
            this.placa = placa;
    }

    public static void main(String[] args){
        Automovel automovel = new Automovel();
        int n = automovel.calculaNumPneusReserva();
        System.out.println("num steps: "+ n);
    }
}
