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
public class Livro {
    String titulo;
    String autor;
    String editora;
    int edicao;
    
    public void getTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String setTitulo(){
        return this.titulo;
    }
    
    public void getAutor(String autor){
        this.autor = autor;
    }
    
    public String setAutor(){
        return this.autor;
    }
    
    public void getEditora(String editora){
        this.editora = editora;
    }
    
    public String setEditora(){
        return this.editora;
    }
    
    public void getEdicao(int edicao){
        this.edicao = edicao;
    }
    
    public int setEdicao(){
        return this.edicao;
    }
}
