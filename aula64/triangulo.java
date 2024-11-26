import java.util.Scanner;
import java.lang.Math;

public class triangulo {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        double lado1;
        double lado2;
        double lado3;

        System.out.println("Digite as dimensoes do triangulo 1: ");
            lado1 = in.nextDouble();
            lado2 = in.nextDouble();
            lado3 = in.nextDouble();

            //chamar a função que calcula a area

            double area1 = calcularArea(lado1, lado2, lado3);
            
        System.out.println("Digite as dimensoes do triangulo 2: ");
            lado1 = in.nextDouble();
            lado2 = in.nextDouble();
            lado3 = in.nextDouble();

            //chamar a função que calcula a area 

            double area2 = calcularArea(lado1, lado2, lado3);

            //chamar a função que compara as areas

            MaiorArea(area1, area2);

        in.close();
    }

    //função para calcular a area do triangulo

public static double calcularArea(double lado1, double lado2, double lado3){

    double p = (lado1 + lado2 + lado3)/2;

    double area = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));

    return area;
}

//função para conferir a maior area entre 2 triangulos

public static void MaiorArea(double area1, double area2){

    if(area1 <= area2){

        System.out.printf("area do triangulo1: %.2f%n area do triangulo2: %.2f%n triangulo de maior area: triangulo2", area1, area2);
    }else{

        System.out.printf("area do triangulo1: %.2f%n area do triangulo2: %.2f%n triangulo de maior area: triangulo1", area1, area2);
    }

}

}




