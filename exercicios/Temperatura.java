package exercicios;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {


            //(°F - 32 ) * 5/9 = °C
        Scanner entrada = new Scanner (System.in);


        System.out.println("________CONVERSOR DE TEMPERATURA__________");
        System.out.println("Digite a temperatura em Fahrenheit ");

        double f = entrada.nextDouble();

        double fator = 32;
        double calculoFator = 5.0/9;

        double resultado = (f-fator) * calculoFator;

        System.out.printf("A temperatura %.2f fahrenheit convertida em graus Celsius e igual a °%.2f  : ",f,resultado);





        entrada.close();






    }

}
