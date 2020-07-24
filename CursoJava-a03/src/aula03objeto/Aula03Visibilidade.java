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
public class Aula03Visibilidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Caneta c1 = new Caneta();
    c1.modelo = "Stabilo";
    c1.cor = "Azul";
    // c1.ponta = 0.5f; não funciona pois o atributo está como private.
    c1.carga = 80;
    // c1.tampada = false;
    c1.tampar();
    c1.status();
    c1.rabiscar();
    } 
    
}
