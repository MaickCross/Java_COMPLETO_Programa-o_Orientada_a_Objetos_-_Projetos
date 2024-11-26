package aula82.aplications;

import java.util.Scanner;
import aula82.entities.conta;

public class app {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        conta conta;

        System.out.println("Bem vido ao banco do PCC! Por favor insira os dados para a criação da conta:");
        System.out.print("Nome do titular: ");
            String nome = in.next();
        System.out.print("Escolha um numero de conta: ");
            int numeroConta = in.nextInt();
        System.out.print("Deseja fazer um deposito inicial? (s)SIM (n)NAO");
            char conferir = in.next().charAt(0);

            //switch para conferir se sera depositado valor inicial ou nao:
        if(conferir == 's'){

               //com deposito inicial 

                System.out.print("Insira o valor a ser depositado:");
                    double deposito = in.nextDouble();

                System.out.printf("Valor depositado com sucesso!%n Conta Criada com sucesso!%n");
                
                conta = new conta(nome, numeroConta, deposito); //objeto conta iniciado pelo construtor com deposito
        }else{
               //sem deposito inicial

                System.out.println("Conta criada com sucesso!");

                conta = new conta(nome, numeroConta);   //objeto conta iniciado pelo construtor sem deposito
        }

        System.out.printf("Bem vindo ao bonco do PCC! Deseja realizar alguma operação?%n (1)Deposito%n (2)Saque%n (3)Alterar nome do titular%n (4)Conferir dados%n (0)Sair%n");
            int operacao = in.nextInt();

        while(operacao >= 1 && operacao <=4){

            switch(operacao){

                case 1: //deposito

                    System.out.print("Insira o valor a ser depositado:");
                        double depositoo = in.nextDouble();
                    conta.deposito(depositoo);
                    System.out.println(conta);
                break;
                case 2: //saque

                    System.out.print("Insira o valor a ser sacado: ");
                        double saque = in.nextDouble();
                    conta.saque(saque);
                    System.out.println(conta);
                break;
                case 3:

                    System.out.print("Digite o nome do novo titular: ");
                        nome = in.next();
                    conta.setNome(nome);
                    System.out.println(conta);
                break;
                case 4:

                    System.out.println(conta);
                break;
            }

            System.out.printf("Deseja realizar alguma operação?%n (1)Deposito%n (2)Saque%n (3)Alterar nome do titular%n (4)Conferir dados%n (0)Sair%n");
            operacao = in.nextInt();
        }

        System.out.println("Programa finalizado!");
            
        in.close();
    }
}

