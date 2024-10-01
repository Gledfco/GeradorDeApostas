package exercicios;

import java.util.Scanner;

public class CelsiusFahrenheit {

    public static void main(String[] args) {

        //F = C x 1,8 + 32
        Scanner entrada = new Scanner (System.in);


        System.out.println("________CONVERSOR DE TEMPERATURA__________");
        System.out.println("Digite a temperatura em Celsius : ");

        double celsius = entrada.nextDouble();

        double fator = celsius * 1.8;
        double resultado = fator + (32);

        System.out.printf("A temperatura %.1f graus Celsius convertida em Fahrenheit e igual a °%.1f  : ",celsius,resultado);

        entrada.close();


    }
}
