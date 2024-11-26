package aula70_2.aplications;

import java.util.Scanner;
import aula70_2.entities.empregado;

public class app {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        
        empregado empregado;

        System.out.print("Digite o nome completo do funcionario: ");
            String nome = in.next();
        System.out.print("Insira o valor do salario: ");
            double salario = in.nextDouble();
        System.out.println("Dados inseridos com sucesso!");

        empregado = new empregado(nome, salario);

        System.out.println(empregado);

        System.out.print(alteracaoString());
            char alteracao = in.next().charAt(0);

        while(alteracao == 's'){

            System.out.println(opcao());
                int opcao = in.nextInt();

            
            switch(opcao){
                case 1:

                    System.out.print("Digitem a porcentagem de aumento: ");
                        double aumento = in.nextDouble();
                    empregado.aumentoSalario(aumento);
                    System.out.printf("Salario aumentado com Sucesso!%n Informaçoes atualizadas: %n");
                    System.out.println(empregado);
                    System.out.println(alteracaoString());
                        alteracao = in.next().charAt(0);
                break;
                case 2:

                    System.out.print("Digite a porcentagem a ser diminuida: ");
                        double diminuir = in.nextDouble();
                    empregado.diminuirSalario(diminuir);    
                    System.out.printf("Salario diminuido com Sucesso!%n Informaçoes atualizadas: %n");
                    System.out.println(empregado);
                    System.out.println(alteracaoString());
                        alteracao = in.next().charAt(0);
                break;
                case 0:

                    alteracao = 'n';
                break;
            }

        }

        System.out.println("Programa finalizado");


        

        in.close();
    }

    //função de texto para alteracao
    public static String alteracaoString(){

        return "Deseja fazer alguma alteração?: (s)Sim (n)Não: ";
    }

    //função de texto para opcao
    public static String opcao(){
        return "Aumentar salario: (1)" + "\n"
            + "Diminuir salario: (2)" + "\n"
            + "Sair: (0)";
    }
}
