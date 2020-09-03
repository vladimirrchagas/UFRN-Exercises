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

public class Terrestre extends Transporte{
    protected int numRodas;
    
    public Terrestre(int capacidade, int numRodas){
            super(capacidade);
            this.numRodas = numRodas;
    }
    
    public int getNumRodas(){
            return numRodas;
    }
    
    public void setNumRodas(int numRodas){
            this.numRodas = numRodas;
    }
    
    public int calculaNumPneusReserva(){
        return numRodas - 4;
    }
}
