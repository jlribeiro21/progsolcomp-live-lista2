/* Nome do Aluno: José Lucas Augusto Ribeiro
* RA: 323114228
* Nome do Programa: Exercicio 20
* Data: 21.05.2023
*/

import java.util.Scanner;

public class exerc20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a carga máxima do elevador em kg: ");
        int cargaMaxima = scanner.nextInt();

        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        int quantidadeMaximaPessoas = scanner.nextInt();

        int pesoTotal = 0;
        int quantidadePessoas = 0;

        do {
            System.out.print("Digite o peso da pessoa em kg: ");
            int pesoPessoa = scanner.nextInt();

            if (pesoTotal + pesoPessoa <= cargaMaxima && quantidadePessoas < quantidadeMaximaPessoas) {
                pesoTotal += pesoPessoa;
                quantidadePessoas++;
                System.out.println("Pessoa adicionada ao elevador.");
            } else {
                System.out.println("Carga máxima do elevador atingida ou número máximo de pessoas alcançado. Encerrando a entrada de pessoas.");
                break;
            }
        } while (true);

        System.out.println("Total de pessoas no elevador: " + quantidadePessoas);
        System.out.println("Peso total no elevador: " + pesoTotal + " kg");
    }
}

