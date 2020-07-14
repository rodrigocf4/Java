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
    
    public void Caneta() { // Este é o construtor: Mesmo nome da classe!
        this.setTampar();
        this.cor = "Azul";
        this.setPonta(0.5f);
        this.modelo = "BIC";
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
    public void setTampar() {
        this.tampada = true;
    }
    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }  
}
