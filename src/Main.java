import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o código do produto entre 1-5:");
        int cod = sc.nextInt();

        System.out.println("Digite a quantidade desejada:");
        int quant = sc.nextInt();

        double total = 0.0;

        if (cod == 1) {
            total = quant * 4.0;
        } else if (cod == 2) {
            total = quant * 4.5;
        } else if (cod == 3) {
            total = quant * 5.0;
        } else if (cod == 4) {
            total = quant * 2.0;
        } else if (cod == 5) {
            total = quant * 1.5;
        } else {
            System.out.println("Código de produto inválido.");
            // Se o código for inválido, o total permanece em 0.0
        }

        if (total != 0.0) {
            System.out.printf("Total: R$ %.2f%n", total);
        }

        sc.close();    }
}