/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

/**
 *
 * @author vladi
 */
public class Carro {
    String cor;
    String tipo;
    String placa;
    int numPortas;
    Pessoa dono;
    int cambio;
    
    public Carro(){
        System.out.println("Você criou um novo objeto da Classe Carro!");
    }
    
    public Pessoa getDono(){
        return dono;
    }
    
    public void setDono(Pessoa dono){
        this.dono = dono;
    }
    
    public void ligar(){
        System.out.println("Carro ligado.");
    }
    
    public void desligar(){
        System.out.println("Carro desligado.");
    }
    
    public void acelerar(){
        System.out.println("Carro acelerando.");
    }
    
    public void frear(){
        System.out.println("Carro freando.");
    }
    
    public void setCambio(int marcha){
        this.cambio = marcha;
    }
    
    public int getCambio(){
        return this.cambio;
    }
    
    public Carro(String cor, String tipo, String placa, int numPortas){
        this.cor = cor;
        this.tipo = tipo;
        this.placa = placa;
        this.numPortas = numPortas;
    }
    
    public void setCor (String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void getNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
    
    public int getNumPortas(){
        return this.numPortas;
    }
}
