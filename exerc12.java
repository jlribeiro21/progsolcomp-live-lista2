/* Nome do Aluno: José Lucas Augusto Ribeiro
* RA: 323114228
* Nome do Programa: Exercicio 12
* Data: 21.05.2023
*/


public class exerc12 {
    public static void main(String[] args) {
        int numero = 0;

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero % 7 != 0);
    }
}
