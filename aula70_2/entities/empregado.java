package aula70_2.entities;

public class empregado {

    private String nome;
    private double salarioBruto;
    private double salarioLiquido;                // < parametros
    private static final double TAXA = 0.10;
    
    //construtor
    public empregado(String nome, double salarioBruto){

        this.nome = nome;
        this.salarioBruto = salarioBruto;
        calcSalarioLiquido(salarioBruto);
    }

    //metodos

    //função para calcular salario Liquido
    public void calcSalarioLiquido(double salarioBruto){
        this.salarioLiquido = (salarioBruto - (salarioBruto* TAXA));
    }

    //função para aumentar salario
    public void aumentoSalario(double porcentagem){
        this.salarioBruto = this.salarioBruto + (salarioBruto * (porcentagem/100));
        calcSalarioLiquido(this.salarioBruto);
    }

    //função para diminuir salario
    public void diminuirSalario(double porcentagem){
        this.salarioBruto = this.salarioBruto - (salarioBruto * (porcentagem/100));
        calcSalarioLiquido(this.salarioBruto);
    }

    //getters e setters

    public String getNome(){
        return this.nome;
    }

    public double getSalarioBruto(){
        return this.salarioBruto;
    }

    public double getSalarioLiquido(){
        return this.salarioLiquido;
    }

    //toString

    public String toString(){

        return "Nome: " + nome + "\n"
                + "Salario Bruto: R$" + salarioBruto + "\n"
                + "Salario Liquido: R$" + salarioLiquido + "\n";
    }



}
