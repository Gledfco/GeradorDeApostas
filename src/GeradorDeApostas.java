import java.util.Random;
import java.util.Scanner;

public class GeradorDeApostas {

    public static void main(String[] args) {

        System.out.println("Escolha qual tipo de Aposta !!!!");


        System.out.println("Loteria Sorte Grande !!! ");
        System.out.println("Digite uma das Opcoes Abaixo: ");
        System.out.println(" 1 - Mega Sena  ");
        System.out.println(" 2 - LotoFacil  ");
        System.out.println(" 3 -   Quina    ");
        System.out.println(" 0 -   Sair     ");

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        if (n == 1) {

                    Random aleatorio = new Random();

                System.out.printf("Seus numeros sao  :");
                for (int i = 0; i < 6; i++) {
                    int number = aleatorio.nextInt(60) + 1;

                    System.out.printf(" %d ",number);
                }


        } else if (n == 2) {

            Random aleatorio = new Random();

            System.out.printf("Seus numeros sao  :");
            for (int i = 0; i < 15; i++) {
                int number = aleatorio.nextInt(25) + 1;

                System.out.printf(" %d ",number);
            }


        }else if (n == 3) {

            Random aleatorio = new Random();

            System.out.printf("Seus numeros sao  :");
            for (int i = 0; i < 5; i++) {
                int number = aleatorio.nextInt(80) + 1;

                System.out.printf(" %d ",number);
            }

            } else if (n==0) {
            System.out.println("Obrigado");
        }
        entrada.close();
    }



    }







