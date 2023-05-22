import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}