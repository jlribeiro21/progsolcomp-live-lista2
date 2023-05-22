import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 12: ");
        int numeroMes = input.nextInt();

        String nomeMes;
        String estacao;

        switch (numeroMes) {
            case 1:
                nomeMes = "Janeiro";
                estacao = "Verão";
                break;
            case 2:
                nomeMes = "Fevereiro";
                estacao = "Verão";
                break;
            case 3:
                nomeMes = "Março";
                estacao = "Outono";
                break;
            case 4:
                nomeMes = "Abril";
                estacao = "Outono";
                break;
            case 5:
                nomeMes = "Maio";
                estacao = "Outono";
                break;
            case 6:
                nomeMes = "Junho";
                estacao = "Inverno";
                break;
            case 7:
                nomeMes = "Julho";
                estacao = "Inverno";
                break;
            case 8:
                nomeMes = "Agosto";
                estacao = "Inverno";
                break;
            case 9:
                nomeMes = "Setembro";
                estacao = "Primavera";
                break;
            case 10:
                nomeMes = "Outubro";
                estacao = "Primavera";
                break;
            case 11:
                nomeMes = "Novembro";
                estacao = "Primavera";
                break;
            case 12:
                nomeMes = "Dezembro";
                estacao = "Verão";
                break;
            default:
                System.out.println("Número inválido. Digite um valor entre 1 e 12.");
                return;
        }

        System.out.println("Mês: " + nomeMes + " - Estação: " + estacao);
    }
}

