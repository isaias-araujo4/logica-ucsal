import java.util.Scanner;

public class Atvd11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n , fatorial = 1, i;

        n = sc.nextInt();
        i = n;

        while (i > 1) {
            fatorial *= i;
            i--;
        }

        System.out.println(fatorial);
    }
}
