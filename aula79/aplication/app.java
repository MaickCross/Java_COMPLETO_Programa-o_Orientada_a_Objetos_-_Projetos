package aula79.aplication;

import java.util.Scanner;
import aula79.entities.produtos;

public class app {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        produtos produto;

        String nome;
        double preco;
        int estoque;

        System.out.println("Insira os dados do produto: NOME ; VALOR ; QUANTIDADE");
            System.out.print("Nome:");
                nome = in.next();
            System.out.print("Valor:");
                preco = in.nextDouble();
            System.out.print("Quantidade:");
                estoque = in.nextInt();
            
            //inicializando a variavel do tipo estoque

        produto = new produtos(nome, preco, estoque);

        System.out.println("Produto " + nome + "registrado com sucesso!");

        //gerir o estoque

        System.out.printf("Deseja realizar alguma acao?:%n (1)Atualizar Estoque%n (2)Conferir Produto%n (3)Alterar nome%n (4)Alterar valor%n (0)Sair%n");
            int acao = in.nextInt();

            while(acao < 0 || acao > 3){

                System.out.println("Opcao invalida! Por favor tente novamente: 0");
                    acao = in.nextInt();
            }
            while(acao > 0 && acao <= 4){
                switch(acao){

                    case 1: //atualizar  estoque

                        System.out.println("Digite a quantidade a ser atualizada ao estoque: (+)adicionar (-)remover");
                            estoque = in.nextInt();

                        produto.setEstoque(estoque);

                        System.out.println("Estoque atualizado com sucesso!");
                    break;

                    case 2: //informacao do estoque

                        produto.ConferirProduto();

                    break;

                    case 3:         //alterar nome do produto

                        System.out.println("Digite o novo nome do produto");
                            nome = in.next();

                        produto.setNome(nome);

                        System.out.println("Nome atualizado com Sucesso!");
                    break;

                    case 4:     //alterar o valor do produto

                        System.out.println("Insira o novo valor do produto: ");
                            preco = in.nextDouble();

                        produto.setPreco(preco);

                        System.out.println("Valor atualizado com sucesso!");
                    break;
                }

                System.out.printf("Deseja realizar alguma acao?:%n (1)Atualizar Estoque%n (2)Conferir Produto%n (3)Alterar nome%n (4)Alterar valor%n (0)Sair%n");
                    acao = in.nextInt();
            }

            System.out.println("Programa finalizado!");

        in.close();
    }
}
