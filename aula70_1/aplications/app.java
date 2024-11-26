package aula70_1.aplications;

import java.util.Scanner;
import aula70_1.entities.retangulo;

public class app {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        retangulo retangulo;

        System.out.println("Insira as dimensoes do retangulo: ");
        System.out.print("Base: ");
            double base = in.nextDouble();
        System.out.print("Altura: ");
            double altura = in.nextDouble();
        System.out.printf("Retangulo registrado com sucesso!%n %n");

        retangulo = new retangulo(base, altura);

        System.out.println(retangulo);

        System.out.println(alteracao());
            char alteracao = in.next().charAt(0);

        while(alteracao == 's'){

            System.out.println(opcao());
                int opcao = in.nextInt();

            while(opcao >= 0 && opcao <= 3){
                switch (opcao){
                    case 1:             //alterar base

                        System.out.print("Insira a nova base: ");
                            base = in.nextInt();
                            retangulo.setBase(base);
                        System.out.printf("Base alterada com sucesso!%n %n");
                        System.out.println(retangulo);
                        System.out.println(opcao());
                            alteracao = in.next().charAt(0);
                    break;
                    case 2:             //alterar altura

                        System.out.print("Insira a nova altura: ");
                            altura = in.nextInt();
                            retangulo.setAltura(altura);
                        System.out.printf("Altura alterada com sucesso!%n %n");
                        System.out.println(retangulo);
                        System.out.println(opcao());
                            alteracao = in.next().charAt(0);
                    break;
                    case 3:             //mostrar dados

                        System.out.println(retangulo);
                        System.out.println(opcao());
                            alteracao = in.next().charAt(0);
                    break;
                    case 0:

                        opcao = 5;
                        alteracao = 'n';
                }
            }

        
        }

        System.out.println("Programa finalizado");
        
        in.close();

    
    }

    //função para exibir textos das opçoes de alteração
    public static String opcao(){

        return "Alterar Base: (1)" + "\n"
        + "Alterar Altura: (2)" + "\n"
        + "Mostrar Dados: (3)" + "\n" + "Sair: (0) ";
    }

    //funcao para exibir textos se vai alterar ou nao
    public static String alteracao(){

        return "Deseja fazer alguma alteração? (s)Sim (n)Não:" + "\n";
    }

}