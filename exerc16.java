/* Nome do Aluno: José Lucas Augusto Ribeiro
* RA: 323114228
* Nome do Programa: Exercicio 16
* Data: 21.05.2023
*/

import java.util.Scanner;

public class exerc16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (ou um número menor que 0 para sair): ");
            numero = scanner.nextInt();
        } while (numero >= 0);

        System.out.println("Número digitado menor que 0. Encerrando o programa.");
    }
}
