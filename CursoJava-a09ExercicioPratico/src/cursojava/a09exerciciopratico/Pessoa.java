/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.a09exerciciopratico;

/**
 *
 * @author Rodrigo Freitas
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    public void fazerAniver() {
        this.setIdade(getIdade()+1);
        System.out.println("Feliz Aniversário" + getNome());
        System.out.println("Agora você tem " + getIdade() + " anos");
        
    }
}
