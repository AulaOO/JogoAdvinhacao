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
public class Jogo {
    
    Jogadores jogue1;
    Jogadores jogue2;
    Jogadores jogue3;
    Jogadores vencedor;
    
    void inicializar(){
        jogue1 = new Jogadores();
        jogue1.nome = "Pedro";
        jogue1.darpalpite();
        jogue2 = new Jogadores();
        jogue2.nome = "Lucas";
        jogue2.darpalpite();
        jogue3 = new Jogadores();
        jogue3.nome = "Andre";
        jogue3.darpalpite();
        vencedor = new Jogadores();
    }
    
    void imprimiEstado(){
        System.out.println("Jogador 1 " + jogue1.idade + "Jogador 1 " + jogue1.palpite);
        System.out.println("Jogador 2 " + jogue2.idade + "Jogador 2 " + jogue2.palpite);
        System.out.println("Jogador 3 " + jogue3.idade + "Jogador 3 " + jogue3.palpite);
    }
    
    void jogar(int valor){
        inicializar();
        imprimiEstado();
        quemGanhou(valor);
        imprimiGanhador();
    }
    
    void quemGanhou(int valor){
        if(jogue1.palpite == valor){
            vencedor = jogue1;
        }
    }

    void imprimiGanhador() {
        System.out.println("Vencedor: " + vencedor.nome);
    }
}
