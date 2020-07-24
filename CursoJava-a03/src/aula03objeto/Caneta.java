/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03objeto;

/**
 *
 * @author Rodrigo Freitas
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
   public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    /* Método Rabiscar */
    public void rabiscar() {
        if(this.tampada==true) {
            System.out.println("ERRO. Não posso rabiscar tampada severino");
        } else {
            System.out.println("RABISCO");
        }
    }
    
    /* Método tampar */
    public void tampar() {
        this.tampada = true;
    }
    
    /* Método destampar */
   public void destampar() {
        this.tampada = false;
    }
}