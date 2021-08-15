/*
Leia um vetor de 20 posições e em seguida um valor X qualquer. 
Seu programa devera fazer uma busca do valor de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado.
 */
package vetor2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author munizera
 */
public class Vetor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        
        int gerado, n, vetor[] = new int[20];
        boolean find = false;
       
        
        System.out.println("Digite um numero");
        n = entrada.nextInt();
        
        for ( int i = 0; i < vetor.length; i++){
            gerado = random.nextInt(30);
            vetor[i] = gerado;
            if (n == vetor[i]){
                find = true;
                System.out.println("O numero "+ n + 
                "\nestá na posição: " + i + " do vetor");
            }
        }
        
        if(find == false){
            System.out.println("Não foi encontrado o numero no vetor");
        }
        System.out.println("Imprimindo os valores do vetor:");
        for( int i = 0; i < vetor.length; i++){
            System.out.printf(vetor[i] + " ");
        }
    }

}
