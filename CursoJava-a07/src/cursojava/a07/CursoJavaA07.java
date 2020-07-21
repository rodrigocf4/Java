/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.a07;

/**
 *
 * @author Rodrigo Freitas
 */
public class CursoJavaA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Godofredo","Togo",30,1.75f,68.7f,
                                11,2,1);
        l[1] = new Lutador("Zezinho", "Brasil", 29,1.68f,
                            57.8f,14,2,3);
        l[2] = new Lutador("Joazinho", "Hong Kong", 35,1.65f,
                            80.9f,12,2,1);
        l[3] = new Lutador("Betinho", "Burkina Faso", 28,1.93f,
                            81.6f,13,0,2);
        l[4] = new Lutador("Chico Bento", "Peru", 37,1.70f,
                            119.3f,5,4,3);
        l[5] = new Lutador("Anjinho", "Argentina", 30,1.81f,
                            105.7f,12,2,4);
        
        l[3].status();

    }
    
}
