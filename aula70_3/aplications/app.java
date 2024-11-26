package aula70_3.aplications;

import java.util.Scanner;
import aula70_3.entities.notas;

public class app {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        notas nota;

        System.out.println("Insira o nome do aluno e suas notas: ");
        System.out.print("Nome: ");
            String nome = in.next();
        System.out.print("Insira nota 1: ");
            double nota1 = in.nextDouble();
        System.out.print("Insira nota 2: ");
            double nota2 = in.nextDouble();
        System.out.print("Insira nota 3: ");
            double nota3 = in.nextDouble();

        nota = new notas(nome, nota1, nota2, nota3);

        System.out.printf("Dados inseridos com sucesso!%n%n");

        boolean aprovado = nota.aprovado();
        double notaFinal = nota.notaFinal();

        if(aprovado == true){

            System.out.println(nota);
            System.out.printf("Nota Final: %.1f%n Status: Aprovado%n", notaFinal);
        }else{

            double notaFaltando = nota.notaFaltando();
            System.out.println(nota);
            System.out.printf("Nota Final: %.1f%n Status: Reprovado%n Nota faltando: %.1f%n", notaFinal, notaFaltando);
        }

        in.close();
    }

}
