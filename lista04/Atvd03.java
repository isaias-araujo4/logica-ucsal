package lista04;

import java.util.Scanner;

public class Atvd03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float media = 0;
        int idade = 0, opcao, contador = 0;
        String sexo, genero;

        System.out.println("digite a sua idade");
        idade = sc.nextInt();

        while (idade != -1) {

            System.out.println("1 = masculino e 2 = feminino");
            opcao = sc.nextInt();

            contador++;
            media = idade / contador;

            switch (opcao) {
                case 1:
                    sexo = "masculino";
                    break;

                case 2:
                    sexo = "feminino";
                    break;

                default:
                    break;
            }

            System.out.println("1 = comedia, 2 = terror e 3 = acao");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    genero = "comedia";
                    break;

                case 2:
                    genero = "terror";
                    break;

                case 3:
                    genero = "acao";
                    break;

                default:
                    break;
            }

            System.out.println("digite a sua idade");
            idade = sc.nextInt();
        }

        System.out.println();
    }

}
