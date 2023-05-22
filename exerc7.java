import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numDiarias = input.nextInt();

        double valorDiaria = 60.00;
        double taxaServico;

        if (numDiarias > 15) {
            taxaServico = 5.50;
        } else if (numDiarias == 15) {
            taxaServico = 6.00;
        } else {
            taxaServico = 8.00;
        }

        double total = (valorDiaria + taxaServico) * numDiarias;

        System.out.println("Total da hospedagem: R$" + total);
    }
}
