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
public class Pessoa {
    String nome;
    String corDoCabelo;
    String biotipo;
    int idade;
    Carro carro;
    Carro olho;
    
    public void setOlho(Carro olho){

        this.olho = olho;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCorDoCabelo(){
        return corDoCabelo;
    }
    
    public void setCorDoCabelo (String corDoCabelo){
        this.corDoCabelo = corDoCabelo;
    }
    
    public String getBiotipo(){
        return biotipo;
    }
    
    public void setBiotipo (String biotipo){
        this.biotipo = biotipo;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setCarro(Carro carro){
        this.carro = carro;
    }
    
    public Carro getCarro(){
        return this.carro;
    }
    
    public void ligarCarro(){
        carro.ligar();
    }
    
    public void desligarCarro(){
        carro.desligar();
    }
    
    public void acelerarCarro(){
        carro.acelerar();
    }
    
    public void frearCarro(){
        carro.frear();
    }
    
    public void setCambioCarro(int marcha){
        carro.setCambio(marcha);
    }
}


