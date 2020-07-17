/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.a05;

/**
 *
 * @author rodri
 */
public class CursoJavaA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumConta(1111);
        p1.setDono("Manfredi");
        p1.abrirConta("cc");
        
        Banco p2 = new Banco();
        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("cp");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(100);
        
        p1.sacar(150);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
