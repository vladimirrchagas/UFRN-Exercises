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
public class Transporte{
    protected int capacidade;

    public Transporte(int capacidade){
            super();
            this.capacidade = capacidade;
    }
    public int getCapacidade(){
            return capacidade;
    }
    public void setCapacidade(int capacidade){
            this.capacidade = capacidade;
    }
}
