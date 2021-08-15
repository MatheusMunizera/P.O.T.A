/*
 Jokenpo é uma brincadeira japonesa, onde dois jogadores escolhem um dentre três possíveis itens: Pedra, Papel ou Tesoura.
O objetivo é fazer um juiz de Jokenpo que dada a jogada dos dois jogadores informa o resultado da partida.
As regras são as seguintes:
Pedra empata com Pedra e ganha de Tesoura Tesoura empata com Tesoura e ganha de Papel Papel empata com Papel e ganha de Pedra
 */
package extra02;

import java.util.Scanner;

/**
 *
 * @author munizera
 */
public class Extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char again = 'n';

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("JOGADOR 1 - Escolha sua jogada: \n"
                    + "[0] Pedra \n"
                    + "[1] Papel \n"
                    + "[2] Tesoura");
            int player1 = scan.nextInt();
            System.out.println("JOGADOR 2 - Escolha sua jogada: \n"
                    + "[0] Pedra \n"
                    + "[1] Papel \n"
                    + "[2] Tesoura");
            int player2 = scan.nextInt();

            if (player1 == player2) {
                System.out.println("=== EMPATE ===");
            } else {
                if (player1 == 0 && player2 == 2) {
                    System.out.println(" === JOGADOR 1 VENCEU");
                } else {
                    if (player2 == 0 && player1 == 2) {
                        System.out.println("==== JOGADOR 2 VENCEU");
                    } else {
                        if (player1 > player2) {
                            System.out.println(" === JOGADOR 1 VENCEU");
                        } else {
                            if (player2 > player1) {
                                System.out.println(" ==== JOGADOR 2 VENCEU");
                            }
                        }
                    }
                }

            }

            System.out.println("Deseja Continuar? [s/n]");
            again = scan.next().charAt(0);
        } while (again == 's');

    }

}
