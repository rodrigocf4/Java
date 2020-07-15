/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04getters;

/**
 *
 * @author Rodrigo Freitas
 */
public class Aula04Getters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC","Amarela",0.4f,true);
        //c1.setModelo("BIC");
        //c1.modelo = "BIC"; // aceita pois modelo é Public!
        //c1.setPonta(0.5f);
        //c1.setCor("Preta");
        //c1.ponta = 0.5f < não funciona ponta é Private!
        c1.status();
        
        System.out.print("Tenho uma caneta " + c1.getModelo());  
        System.out.println(" de cor " + c1.getCor() + " e ponta: " + c1.getPonta());  
    }
    
}
