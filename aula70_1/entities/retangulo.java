package aula70_1.entities;

import java.lang.Math;

public class retangulo {

    private double base;
    private double altura;   // < parametros
    private double area;
    private double perimetro;
    private double diagonal;

    //construtor
    public retangulo(double base, double altura){

        this.base = base;
        this.altura = altura;
        area(base, altura);
        perimetro(base, altura);
        diagonal(base, altura);
    }

    //metodos

    public void area(double base, double altura){
        this.area = base * altura;
    }

    public void perimetro(double base, double altura){
        this.perimetro = 2 * (base + altura);
    }

    public void diagonal(double base, double altura){
        this.diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2));
    }

    //getters e setters

    public double getBase(){
        return this.base;
    }

    public void setBase(double base){
        this.base = base;
        area(this.base, this.altura);
        perimetro(this.base, this.altura);
        diagonal(this.base, this.altura);

    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
        area(this.base, this.altura);
        perimetro(this.base, this.altura);
        diagonal(this.base, this.altura);

    }

    public double getArea(){
        return this.area;
    }

    public double getPerimetro(){
        return this.perimetro;
    }

    public double getDiagonal(){
        return this.diagonal;
    }

    //metodo toString

    public String toString(){

        return "Base: " + base + "\n"
         + "Altura: " + altura + "\n" 
         + "Area: " + area + "\n"
         + "Perimetro: " + perimetro + "\n"
         + "Diagonal: " + diagonal + "\n" + "\n";
    }

}
