package aula71.aplication;

import java.util.Scanner;
import aula71.entities.calculadora;

public class app {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor do raio da circunferencia: ");
            double raio = in.nextInt();

        calculadora circulo = new calculadora(raio);

        //retornar os valores do circulo

        circulo.retornarDados();
        
        in.close();
    }

}
