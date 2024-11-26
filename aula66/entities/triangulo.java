package aula66.entities;

import java.lang.Math;

public class triangulo {

    public double lado1;
    public double lado2;    // < parametros sem encapsulamento
    public double lado3;
    public double area;

    //construtor
    
    public triangulo(double lado1, double lado2, double lado3){

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

        double p = (this.lado1 + this.lado2 + this.lado3)/2;

        this.area = Math.sqrt(p * (p - this.lado1) * (p - this.lado2) * (p - this.lado3));
    }




}
