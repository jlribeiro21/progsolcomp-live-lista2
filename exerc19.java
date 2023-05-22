/* Nome do Aluno: José Lucas Augusto Ribeiro
* RA: 323114228
* Nome do Programa: Exercicio 19
* Data: 21.05.2023
*/

import java.util.Scanner;

public class exerc19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o volume inicial do gás em centímetros cúbicos: ");
        int volumeInicial = scanner.nextInt();

        int volumeAtual = volumeInicial;
        int tempo = 0;

        while (volumeAtual <= 1000) {
            volumeAtual *= 2;
            tempo++;
        }

        System.out.println("O volume se tornará maior que 1000 cm³ em " + tempo + " segundos.");
    }
}
