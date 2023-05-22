/* Nome do Aluno: José Lucas Augusto Ribeiro
* RA: 323114228
* Nome do Programa: Exercicio 21
* Data: 21.05.2023
*/

import java.util.Scanner;

public class exerc21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println();
        }
    }
}
