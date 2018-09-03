/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ice
 */
public class Jogadores {
    String nome;
    int idade;
    int palpite;
    
    void darpalpite(){
        palpite = (int)(Math.random()*10);
    }
    
    public Jogadores(){
        
    }
    
    public Jogadores(String nome1, int idade1, int palpite1){
        nome = nome1;
        idade = idade1;
        palpite = palpite1;
    }
}
