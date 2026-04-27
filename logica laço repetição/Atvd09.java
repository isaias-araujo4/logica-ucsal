import java.util.Scanner;

public class Atvd09{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int a, b, mmc;

        a = sc.nextInt();
        b = sc.nextInt();
        mmc = a;

        while (mmc%b != 0) {
            mmc += a;
        }
     System.out.println(mmc);   
    }
}