/* Nome do Aluno: José Lucas Augusto Ribeiro
* RA: 323114228
* Nome do Programa: Exercicio 5
* Data: 21.05.2023
*/

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.print("Digite a idade: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.print("Digite a naturalidade: ");
        String naturalidade = input.nextLine();

        System.out.print("Deseja visualizar dados completos? (S/N): ");
        char opcao = input.nextLine().charAt(0);

        if (opcao == 'S' || opcao == 's') {
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N' || opcao == 'n') {
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
        } else {
            System.out.println("Digitação errada. Tente novamente.");
        }
    }
}
