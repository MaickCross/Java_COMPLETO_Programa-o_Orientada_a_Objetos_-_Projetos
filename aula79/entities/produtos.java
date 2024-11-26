package aula79.entities;

public class produtos {

    private String nome;
    private double preco;    // < parametros sem encapsulamento
    private int quantidade;
    private double valorEstoque;

    //construtor

    public produtos(String nome, double preco, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

        this.valorEstoque = this.quantidade * this.preco;

    }

    //metodos

    public void ConferirProduto(){ // < mostrar os dados do produto

        System.out.printf("ITEM: %s%n VALOR: R$%.2f%n ESTOQUE: %d%n Valor total em Estoque: %.2f%n", this.nome, this.preco, this.quantidade, this.valorEstoque);
    }

    //getters e setters

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
        this.valorEstoque = this.quantidade * this.preco;
    }

    public int getEstoque(){
        return this.quantidade;
    }

    public void setEstoque(int quantidade){

        if(quantidade <= this.quantidade){

            this.quantidade = this.quantidade + quantidade;  // < remover(-) ou adicionar(+) estoque porem estoque nao pode ser menor que 0
            this.valorEstoque = this.quantidade * this.preco;

        }else{
        
            System.out.println("Valor inserido invalido! Nao eh permitido estoque negativo");
        }
    }

    public double getValorEstoque(){
        return this.valorEstoque;
    }
}
