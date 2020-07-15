/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.!!!
 */
package aula04getters;
 /**
 *
 * @author Rodrigo Freitas
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;
    
    public Caneta() { // Este é o construtor: Mesmo nome da classe!
        this.modelo = "BIC";
        this.cor = "Azul";
        this.ponta = 0.5f;
        this.tampar();
              
    }    

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;  
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) { //void = não retorna (vazio)
        this.ponta = p;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    public String getCor() {
        return this.cor;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }  
}
