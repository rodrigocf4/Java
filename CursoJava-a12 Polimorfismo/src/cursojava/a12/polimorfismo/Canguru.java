/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.a12.polimorfismo;

/**
 *
 * @author Rodrigo Freitas
 */
public class Canguru extends Mamifero {
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
    
}
