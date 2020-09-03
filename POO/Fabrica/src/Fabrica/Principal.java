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
public class Principal {
    public static void main (String[] args){
        /*Aqui estará todo o código responsável por executar o programa;
        *1 - Criação de objetos
        *2 - Manipulação dos seus dados
        *3 - Finalização do programa
        */
        Carro meuCarro = new Carro("Preto", "Passeio", "HEL-0669", 4); /*Objeto 
        meuCarro com os atributos da Classe Carro!
        */
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Camila");
        pessoa.setIdade(27);
        
        meuCarro.setDono(pessoa);
       
        pessoa.setCarro(meuCarro);
        
        //meuCarro.setCor("Preto");
        System.out.println("A cor do meu carro é: "+meuCarro.getCor());
        System.out.println("O tipo do meu carro é: "+meuCarro.getTipo());
        System.out.println("A placa do meu carro é: "+meuCarro.getPlaca());
        System.out.println("Meu carro possui "+meuCarro.getNumPortas()+" portas.");
        System.out.println("Meu carro pertence a: "+meuCarro.getDono().getNome()+", "+
                meuCarro.getDono().getIdade()+" anos.");
        
        pessoa.ligarCarro();
        pessoa.setCambioCarro(1);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(2);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(3);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(2);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(1);
        pessoa.acelerarCarro();
        pessoa.setCambioCarro(0);
        pessoa.acelerarCarro();
        pessoa.frearCarro();
        pessoa.desligarCarro();
        //Carro carro2 = new Carro();
    }
}
