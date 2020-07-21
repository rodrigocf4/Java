/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.a07;

import java.util.Random;

/**
 *
 * @author Rodrigo Freitas
 */
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) &&
                l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiado = null;
        }
        
    }
    
    public void lutar() {
        if(this.aprovada){
            System.out.println("## DESAFIADO ##");
            this.desafiado.apresentar();
            System.out.println("## DESAFIANTE ##");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("======RESULTADO DA LUTA========");
            switch(vencedor){
            case 0: // Empate
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                System.out.println("Empatou");
                break;
            
            case 1: // Desafiado vence
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                System.out.println(this.desafiado.getNome() + " venceu!");
                break;
                
                
                
            case 2: // Desafiante vence
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome() + " venceu!");
                break;
        }
              
    }else{
            System.out.println("A luta não pode acontecer!");
        }
        System.out.println("====================");
}
    
    //Métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
    

