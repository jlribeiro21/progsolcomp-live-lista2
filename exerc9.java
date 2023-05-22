/* Nome do Aluno: José Lucas Augusto Ribeiro
* RA: 323114228
* Nome do Programa: Exercicio 9
* Data: 21.05.2023
*/

import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da venda: R$");
        double valorVenda = input.nextDouble();

        System.out.println("Selecione a condição de pagamento:");
        System.out.println("1 - Venda à vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");
        System.out.print("Opção: ");
        int opcao = input.nextInt();

        double totalVenda;

        switch (opcao) {
            case 1:
                totalVenda = valorVenda * 0.9; // desconto de 10%
                break;
            case 2:
                totalVenda = valorVenda * 0.95; // desconto de 5%
                break;
            case 3:
                totalVenda = valorVenda;
                break;
            case 4:
                totalVenda = valorVenda * 1.05; // acréscimo de 5%
                break;
            case 5:
                totalVenda = valorVenda * 0.92; // desconto de 8%
                break;
            case 6:
                totalVenda = valorVenda * 0.93; // desconto de 7%
                break;
            default:
                System.out.println("Opção inválida. Selecione uma opção de 1 a 6.");
                return;
        }

        System.out.println("Total da venda: R$" + totalVenda);
    }
}

