import java.util.Scanner;

public class atvd1 {

    public static double calcularMedia(int[] idades) {

        int soma = 0;

        for (int i = 0; i < idades.length; i++) {
            soma += idades[i];
        }

        return (double) soma / idades.length;
    }

    public static void listarNomes(String[] nomes, int[] idades, double media) {

        for (int i = 0; i < idades.length; i++) {

            if (idades[i] > media) {
                System.out.println("\nPessoas acima da média:");
                System.out.println(nomes[i]);
            }else{
                System.out.println("sem pessoas com idade acima da media");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media;
        String[] nomes = new String[20];
        int[] idades = new int[20];

        for (int i = 0; i < nomes.length; i++) {

            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();
        }

        media = calcularMedia(idades);

        System.out.println("\nMédia das idades: " + media);

        listarNomes(nomes, idades, media);

        sc.close();
    }
}