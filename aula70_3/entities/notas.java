package aula70_3.entities;

public class notas {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    //constutor
    public notas(String nome, double nota1, double nota2, double nota3){

        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }

    //metodos
    
    //nota final
    public double notaFinal(){
        double notaFinal = nota1 + nota2 + nota3;
        return notaFinal;
    }

    //aprovado
    public boolean aprovado(){
        boolean aprovado = false;
        double notaFinal = notaFinal();

        if(notaFinal >= 60){
            aprovado = true;
        }
        return aprovado;
    }

    //nota faltando
    public double notaFaltando(){
        double notafinal = notaFinal();
        double notaFaltando = 60 - notafinal;
        return notaFaltando;
    }

    //getters e setters

    public String getNome(){
        return nome;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public double getNota3(){
        return nota1;
    }

    //toString

    public String toString(){

        return "Nome: " + nome + "\n"
            + "Nota 1: " + nota1 + "\n"
            + "Nota 2: " + nota2 + "\n"
            + "Nota 3: " + nota3 + "\n";
    }



}
