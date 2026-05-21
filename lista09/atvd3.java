package lista09;

import java.util.ArrayList;
import java.util.Scanner;

public class atvd3 {

    public static void gerarCupom(ArrayList<Double> quantidade,
                                  ArrayList<Double> valor,
                                  ArrayList<String> produto) {

        double valorTotal = 0;

        System.out.println("\n========= NOTA FISCAL =========");
        System.out.println("Produto | Quantidade | Valor Unitário | Total Item");

        for (int i = 0; i < produto.size(); i++) {

            double valorTotalItem = quantidade.get(i) * valor.get(i);

            valorTotal += valorTotalItem;

            System.out.println(
                    produto.get(i) + " | "
                    + quantidade.get(i) + " | "
                    + valor.get(i) + " | "
                    + valorTotalItem);
        }

        System.out.println("--------------------------------");
        System.out.println("VALOR TOTAL: " + valorTotal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> produto = new ArrayList<>();
        ArrayList<Double> quantidade = new ArrayList<>();
        ArrayList<Double> valor = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n1 - Adicionar produto");
            System.out.println("2 - Finalizar compra");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Produto: ");
                    produto.add(sc.nextLine());

                    System.out.print("Valor unitário: ");
                    valor.add(sc.nextDouble());

                    System.out.print("Quantidade: ");
                    quantidade.add(sc.nextDouble());

                    sc.nextLine();

                    break;

                case 2:

                    gerarCupom(quantidade, valor, produto);

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 2);

        sc.close();
    }
}