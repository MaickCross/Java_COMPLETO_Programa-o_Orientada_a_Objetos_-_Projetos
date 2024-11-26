package aula66.aplication;

import java.util.Scanner;
import aula66.entities.triangulo;

public class app {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        triangulo x, y;

        double lado1, lado2, lado3;

        System.out.println("Digite as dimensoes do triangulo x: ");
        lado1 = in.nextDouble();
        lado2 = in.nextDouble();
        lado3 = in.nextDouble();

        x = new triangulo(lado1, lado2, lado3); //iniciando x com o construtor

        System.out.println("Digite as dimensoes do triangulo y: ");
        lado1 = in.nextDouble();
        lado2 = in.nextDouble();
        lado3 = in.nextDouble();

        y = new triangulo(lado1, lado2, lado3); //iniciando y com o construtor

        //comparar as areas

        if(x.area <= y.area){

            System.out.printf("area do triangulo X: %.2f%n area do triangulo Y: %.2f%n triangulo de maior area: triangulo Y%n", x.area, y.area);
        }else{
    
            System.out.printf("area do triangulo X: %.2f%n area do triangulo Y: %.2f%n triangulo de maior area: triangulo X%n", x.area, y.area);
        }
        
        in.close();
    }

}
