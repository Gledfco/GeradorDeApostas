package exercicios;

import java.util.Scanner;

public class EstaEntreZeroDezPar {

    public static void main(String[] args) {

        Scanner entrada  = new Scanner(System.in);

        System.out.println("Digite um Numero :");

         int n = entrada.nextInt();

         if (n >=0 && n <= 10){
             if(n %2 ==0){

                 System.out.println("Numero e Par ");
             } else {
                 System.out.println("Numero nao e Par");
             } 
         }else {
             System.out.println("O numero "+ n +" Nao esta entre 0 e 10 ");
         }


        entrada.close();



    }
}
