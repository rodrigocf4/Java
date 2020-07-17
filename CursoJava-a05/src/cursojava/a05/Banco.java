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
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if(this.getTipo() == "cc") {
            this.setSaldo(50);
        } else if(this.getTipo() == "cp") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
        
    }
    
    public void fecharConta() {
        if(this.getSaldo() != 0) {
            System.out.println("Você possui débitos ou créditos na conta. Verifique sua conta antes de fechar");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso! Volte sempre!");   
        }
    }
    
    public void depositar(float v) {
        if(this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v );
            System.out.println("Depósito realizado na conta de " + getDono());
        } else {
            System.out.println("Impossível depositar!!");
        }
    }
    
    public void sacar(float s) {
        if(this.getStatus() == true && this.getSaldo() >= s) {
            setSaldo(getSaldo() - s);
            System.out.println("Saque realizado na conta de " + getDono());
        } else {
            System.out.println("Impossível sacar! Pague suas dívidas lazarento");
        }
    }
    
    public void pagarMensalidade() {
        int m = 0;
        if(this.getTipo() == "cc") {
            m = 12;
        } else if(this.getTipo() == "cp"){
            m = 20;
        }
        if(this.getStatus() == true) {
            this.setSaldo(this.getSaldo() - m);
            System.out.println("Mensalidade paga com sucesso!");
        }else {
            System.out.println("Saldo insuficiente para pagar!");
                    
        }
        
        
        
    }
    
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
    
    
    
}
