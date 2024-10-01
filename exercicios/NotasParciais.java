package exercicios;

import java.util.Scanner;

public class NotasParciais {

    public static void main(String[] args) {


        Scanner entrada  = new Scanner(System.in);

        System.out.println("Digite as notas ");

        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();

        double media = (n1 + n2) /2;

        if (media >= 7 ){
            System.out.println("Aluno Aprovado");
         }if ( media <= 6.9 &&  media >= 4 ) {
            System.out.println("Aluno em Recuperacao ");
        }
        System.out.println("Aluno Reprovado !!!");

        entrada.close();



    }
}
