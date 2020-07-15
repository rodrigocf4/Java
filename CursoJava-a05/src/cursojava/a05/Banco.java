/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.a05;

/**
 *
 * @author Rodrigo Freitas
 */
public class Banco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Banco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void abrirConta() {
        this.setStatus(true);
        if(this.getTipo() == "cc") {
            this.setSaldo(50f);
        } else if(this.getTipo() == "cp") {
            this.setSaldo(150f);
        }
        
    }
    
    public void fecharConta() {
        if(this.getSaldo() != 0) {
            System.out.println("Você possui débitos ou créditos na conta. Verifique sua conta antes de fechar");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso! Volte sempre!");   
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
