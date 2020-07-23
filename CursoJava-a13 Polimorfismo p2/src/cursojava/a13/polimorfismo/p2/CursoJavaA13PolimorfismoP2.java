/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.a13.polimorfismo.p2;

/**
 *
 * @author Rodrigo Freitas
 */
public class CursoJavaA13PolimorfismoP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11,45);
        c.reagir(21,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2,12.5f);
        c.reagir(17,4.5f);
        
    }
    
}
