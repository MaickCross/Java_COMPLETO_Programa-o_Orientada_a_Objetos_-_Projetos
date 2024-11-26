package aula73.aplications;

import java.util.Scanner;
import aula73.entities.currencyConverter;

public class app {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        currencyConverter transacao;

        System.out.print("Digite o valor do dolar: ");
            double valor = in.nextDouble();
        System.out.print("Quantos dolares serão comprados?: ");
            double quantidade = in.nextDouble();
        
        transacao = new currencyConverter(valor, quantidade);

        System.out.println(transacao);

        System.out.print(alteracaoString());
            char alteracao = in.next().charAt(0);

        while(alteracao == 's'){

            System.out.println(opcoeString());
                int opcao = in.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Insira o novo valor do dolar: ");
                        valor = in.nextDouble();
                    transacao.setDolar(valor);
                    System.out.println(transacao);
                    System.out.println(alteracaoString());
                        alteracao =  in.next().charAt(0);
                break;
                case 2:
                    System.out.print("Insira a nova quantidade desejada:");
                        quantidade = in.nextDouble();
                    transacao.setQuantidade(quantidade);
                    System.out.println(transacao);
                    System.out.println(alteracaoString());
                        alteracao = in.next().charAt(0);
                break;
                case 3:
                    System.out.println(transacao);
                    System.out.println(alteracaoString());
                        alteracao = in.next().charAt(0);
                break;
                case 0:
                    alteracao = 'n';
                break;
            }
        }

        System.out.println("Programa encerrado");

        in.close();
    }

    //função para conferir se vai houver alteraçao
    public static String alteracaoString(){
        return "Deseja fazer alguma alteração?: (s)Sim (n)Não : ";
    }

    //função de opçoes de alteracao
    public static String opcoeString(){
        return "Selecione a opção:" + "\n" 
            + "(1)Alterar valor do dolar" + "\n"
            + "(2)Alterar quantidade a ser comprada" + "\n"
            + "(3)Conferir transação" + "\n"
            + "(0)Sair";
    }

}
