/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.projetofinal;

/**
 *
 * @author Rodrigo Freitas
 */
public class CursoJavaProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula de PHP");
        v[2] = new Video("Aula de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("juba","Zezinho",22,"M");
        g[1] = new Gafanhoto("creu","Creusa",12,"F");
        
        //System.out.println(v[0].toString());
        //System.out.println(g[0].toString());
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(35.0f);
        System.out.println(vis[0].toString());
        
       
        
        
    }
    
}
