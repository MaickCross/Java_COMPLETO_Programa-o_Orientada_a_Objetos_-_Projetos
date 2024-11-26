package aula71.entities;

public class calculadora {

    public static final double PI = 3.14159; // < membro estatico / variavel estatica

    public double raio;                 // < parametros
    public double circunferencia;
    public double volume;

    //construtor

    public calculadora(double raio){

        this.raio = raio;
        this.circunferencia = (2 * PI * this.raio);
        this.volume = ((4 * PI * this.raio * this.raio * this.raio)/3);
    }

    //retornar dados 

    public void retornarDados(){

        System.out.printf("Raio: %.2f%n Circunferencia: %.2f%n Volume: %.2f%n Valor de PI: %f%n", this.raio, this.circunferencia, this.volume, PI);
    }


}
