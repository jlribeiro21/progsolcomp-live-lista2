/* Nome do Aluno: José Lucas Augusto Ribeiro
* RA: 323114228
* Nome do Programa: Exercicio 14
* Data: 21.05.2023
*/

public class exerc14 {
    public static void main(String[] args) {
        int tamanho = 50;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = 0;
        }

        System.out.println("Vetor preenchido com zeros:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);
        }
    }
}
