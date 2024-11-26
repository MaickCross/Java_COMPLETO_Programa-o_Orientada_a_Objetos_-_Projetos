package aula89;

import java.util.Scanner;

public class app {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.printf("O programa ira calcular a media da altura dos alunos%n Quantidade de alunos: ");
            int n = in.nextInt();

        //declaração do vetor
        double[] vect = new double[n];  

        //for para inserir valores no vetor
        for(int i = 0; i<n; i++){
            
            int cont = i+1;
            System.out.print("Altura do aluno " + cont + ": ");
                vect[i] = in.nextDouble();    //como inserir valores no vetor
        }

        //calcular a media dos alunos
        double soma = 0;

        for(int i = 0; i<n; i++){

            soma = soma + vect[i];  //como somar as notas dos vetores
        }

        double media = soma/n;

        System.out.printf("A media de alturas dos %d alunos é: %.2fcm%n",n, media);



        in.close();
    }

}
