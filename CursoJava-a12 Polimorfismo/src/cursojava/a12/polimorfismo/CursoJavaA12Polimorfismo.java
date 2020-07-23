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
public class CursoJavaA12Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        a.locomover();
        r.locomover();
        p.locomover();
        a.locomover();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        c.locomover();
        k.locomover();
        k.emitirSom();
    }
    
}
