/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02objeto;

/**
 *
 * @author Rodrigo Freitas
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    /* Método Rabiscar */
    void rabiscar() {
        if(this.tampada==true) {
            System.out.println("ERRO. Não posso rabiscar tampada severino");
        } else {
            System.out.println("RABISCO");
        }
    }
    
    /* Método tampar */
    void tampar() {
        this.tampada = true;
    }
    
    /* Método destampar */
    void destampar() {
        this.tampada = false;
    }
}