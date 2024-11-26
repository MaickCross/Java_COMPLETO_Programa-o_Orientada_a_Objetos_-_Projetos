package aula65;

import java.util.Scanner;
import java.lang.Math;

public class app {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        triangulo x = new triangulo();      //declarando uma variavel da classe triangulo
        triangulo y = new triangulo();

        double p;
        
        System.out.println("Digite as dimensoes do triangulo x: ");
            x.lado1 = in.nextDouble();
            x.lado2 = in.nextDouble();
            x.lado3 = in.nextDouble();

        //calcular area de x

        p = (x.lado1 + x.lado2 + x.lado3)/2;

        x.area = Math.sqrt(p * (p - x.lado1) * (p - x.lado2) * (p - x.lado3));

        System.out.println("Digite as dimensoes do triangulo y: ");
            y.lado1 = in.nextDouble();
            y.lado2 = in.nextDouble();
            y.lado3 = in.nextDouble();

        //calcular area de y

        p = (y.lado1 + y.lado2 + y.lado3)/2;

        y.area = Math.sqrt(p * (p - y.lado1) * (p - y.lado2) * (p - y.lado3));


        //comparar as areas

        if(x.area <= y.area){

            System.out.printf("area do triangulo X: %.2f%n area do triangulo Y: %.2f%n triangulo de maior area: triangulo Y%n", x.area, y.area);
        }else{
    
            System.out.printf("area do triangulo X: %.2f%n area do triangulo Y: %.2f%n triangulo de maior area: triangulo X%n", x.area, y.area);
        }

        in.close();
    }

}
