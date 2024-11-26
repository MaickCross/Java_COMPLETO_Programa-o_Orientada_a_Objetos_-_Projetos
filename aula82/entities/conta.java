package aula82.entities;

public class conta {

    private String nome;
    private double saldo;   //parametros com encapsulamento
    private int numeroConta;

    //construtores

    public conta(){         //construtor default

    }

    public conta(String nome, int numeroConta){

        this.nome = nome;
        this.numeroConta = numeroConta;     // < construtor sem deposito inicial
        this.saldo = 0;
    }

    public conta(String nome, int numeroConta, double depositoInicial){

        this.nome = nome;
        this.numeroConta = numeroConta;     // < construtor com deposito inicial
        deposito(depositoInicial);
    }

    //metodos

    public void deposito(double deposito){

        this.saldo = this.saldo + deposito;     //função de deposito

        System.out.println("Deposito realizado com Sucesso!");
    }

    public void saque(double saque){        //função de saque

        if(saque > this.saldo){
            System.out.printf("Valor de saque invalido!%n Voce possui R$%.2f em sua conta%n", this.saldo);
        }else{
            this.saldo = this.saldo - saque -5;

            System.out.println("Deposito realizado com Sucesso!");
        }
    }

    public String toString(){       //imprimir dados da conta

        return "Nome do titular: " + nome + "\n" + "Numero de conta: " + numeroConta + "\n" + "Saldo: " + saldo;
    }

    //getters e setters

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
        System.out.println("Nome atualizado com suceso!");
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

}
