package modulos;

import java.util.Scanner;

public class atva1 {
    
    
    public static float calcularMedia(float n1, float n2, float n3, float n4){

       return (n1+n2+n3+n4) / 4;
    }

    public static String menssagem()

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome;
        nome = sc.nextLine();
        float n1,n2,n3,n4;
        n1 = sc.nextFloat();
        n3 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        calcularMedia(n1,n2,n3,n4);
        


    }

}
