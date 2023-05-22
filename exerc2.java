import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = input.nextInt();

        int menor = Math.min(Math.min(a, b), c);

        int maior = Math.max(Math.max(a, b), c);

        int intermediario = a + b + c - menor - maior;

        System.out.println("Os valores em ordem crescente são: " + menor + ", " + intermediario + ", " + maior);
    }
}