package exercicios;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {

        System.out.println("Digite o ano para saber se e bissexto : ");
        Scanner entrada = new Scanner(System.in);



        String ano = entrada.nextLine();

        int bissexto = Integer.parseInt(ano);

        if (bissexto % 4 == 0 ){
            System.out.printf("Ano %d  e Bissexto ", bissexto);
        }else {
            System.out.printf("Ano %d nao e Bissexto ", bissexto);
        }



        entrada.close();


    }
}
