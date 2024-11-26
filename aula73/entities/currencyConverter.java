package aula73.entities;

public class currencyConverter {

    private static final double TAXA = 0.06;
    private double dolar;                           // < parametros
    private double quantidade;
    private double precoFinal;

    public currencyConverter(double dolar, double quantidade){

        this.dolar = dolar;
        this.quantidade = quantidade;
        calcularIOF();
    }

    //metodos 

    //função para calcular a transação
    public void calcularIOF(){
        this.precoFinal = dolar * quantidade + ((quantidade * dolar) * TAXA);
    }

    //getters e setters

    public double getDolar(){
        return dolar;
    }

    public void setDolar(double dolar){
        this.dolar = dolar;
        calcularIOF();
    }

    public double getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(double quantidade){
        this.quantidade = quantidade;
        calcularIOF();
    }

    public double getPrecoFinal(){
        return precoFinal;
    }

    //metodo toString

    public String toString(){

        return "Valor do dolar: R$" + dolar + "\n"
            + "Quantidade em dolares a ser comprado: USD$" + quantidade + "\n"
            + "Valor total a ser pago em Reais: R$" + precoFinal + "\n";
    }




}
