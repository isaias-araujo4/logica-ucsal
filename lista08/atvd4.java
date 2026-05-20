

import java.util.Scanner;

public class atvd4 {


    public static void preencher(int ra, int[] n){

        for (int i = 1; i < n.length; i++) {
            n[i] = n[i - 1] + ra;
        }
    }

    public static void mostrarPa(int[] n){
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] n =  new int[20];
        int ra;

        n[0] = sc.nextInt();
        ra = sc.nextInt();

        preencher(ra, n);
        mostrarPa(n);


        sc.close();
    }
    
}