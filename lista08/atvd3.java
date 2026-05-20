import java.util.Scanner;
import java.util.Arrays;

public class atvd3 {

    public static void ordenar(int[] n) {
        Arrays.sort(n);
    }

    public static void listar(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[50];

        for (int i = 0; i < n.length; i++) {

            n[i] = sc.nextInt();

        }

        ordenar(n);
        listar(n);

        sc.close();
    }
}