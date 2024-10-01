package exercicios;

import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {

        System.out.println("Entre com sua altura :");

        Scanner entrada = new Scanner(System.in);

        double altura = entrada.nextDouble();

        System.out.println("Agora entre com seu peso : ");

        double peso = entrada.nextDouble();

        double calculo = peso / Math.pow(altura,altura);


        System.out.printf(" Seu IMC e igual a %.2f",calculo);






        entrada.close();

    }

}
