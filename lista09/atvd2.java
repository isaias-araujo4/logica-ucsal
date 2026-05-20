package lista09;

import java.util.Scanner;

public class atvd2 {

    public static void comparar(int[] n) {

        int maiorN = n[0];

        for (int i = 1; i < n.length; i++) {

            if (n[i] > maiorN) {
                maiorN = n[i];
            }
        }

        System.out.println(maiorN);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] n = new int[50];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        comparar(n);

        sc.close();
    }

}
