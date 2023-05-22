import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número A: ");
        int a = input.nextInt();

        System.out.print("Digite o número B: ");
        int b = input.nextInt();

        int maior = a;
        if (b > maior) {
            maior = b;
        }

        System.out.println("O maior número é: " + maior);
    }
}
