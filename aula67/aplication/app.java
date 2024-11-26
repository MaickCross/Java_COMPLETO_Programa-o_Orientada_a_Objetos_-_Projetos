package aula67.aplication;

import java.util.Scanner;
import aula67.entities.produtos;

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

        System.out.printf("Deseja realizar alguma acao?:%n (1)Adicionar Estoque%n (2)Remover Estoque%n (3)Conferir Produto%n (0)Sair%n");
            int acao = in.nextInt();

            while(acao < 0 || acao > 3){

                System.out.println("Opcao invalida! Por favor tente novamente: 0");
                    acao = in.nextInt();
            }
            while(acao > 0 && acao <= 3){
                switch(acao){

                    case 1: //adicionar ao estoque

                        System.out.println("Digite a quantidade a ser adicionada ao estoque: ");
                            estoque = in.nextInt();

                        produto.adicionarEstoque(estoque);

                        System.out.println("adicionado com sucesso!");

                    break;

                    case 2: //remover do estoque

                        System.out.println("Digite a quantidade a ser removida do estoque: ");
                            estoque = in.nextInt();

                        produto.removerEstoque(estoque);

                        System.out.println("removido com sucesso!");

                    break;

                    case 3: //informacao do estoque

                        produto.ConferirProduto();

                    break;
                }

                System.out.printf("Deseja realizar alguma acao?:%n (1)Adicionar Estoque%n (2)Remover Estoque%n (3)Conferir Produto%n (0)Sair%n");
                    acao = in.nextInt();
            }

            System.out.println("Programa finalizado!");

        in.close();
    }
}















