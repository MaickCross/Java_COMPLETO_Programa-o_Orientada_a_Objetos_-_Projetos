package aula67.entities;

public class produtos {

    public String nome;
    public double preco;    // < parametros sem encapsulamento
    public int quantidade;
    public double valorEstoque;

    //construtor

    public produtos(String nome, double preco, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

        this.valorEstoque = this.quantidade * this.preco;

    }

    //metodos

    public void adicionarEstoque(int estoque){

        this.quantidade = this.quantidade + estoque; // < adicionar estoque
        this.valorEstoque = this.quantidade * this.preco;
    }

    public void removerEstoque(int estoque){

        if(estoque <= this.quantidade){

            this.quantidade = this.quantidade - estoque;  // < remover estoque porem estoque nao pode ser menor que 0
            this.valorEstoque = this.quantidade * this.preco;

        }else{
        
            System.out.println("Valor inserido invalido! Nao eh permitido estoque negativo");
        }

    }

    public void ConferirProduto(){ // < mostrar os dados do produto

        System.out.printf("ITEM: %s%n VALOR: R$%.2f%n ESTOQUE: %d%n Valor total em Estoque: %.2f%n", this.nome, this.preco, this.quantidade, this.valorEstoque);
    }
}
