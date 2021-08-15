/*
 Leia um número inteiro,n , e mostre a somatória dos números que estão entre 1 e n
 */
package repeticaofor;

import java.util.Scanner;

/**
 *
 * @author munizera
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro:");
        int n, soma=0;
        Scanner entrada = new Scanner (System.in);
        n = entrada.nextInt();
        
        for( int i = 1; i <= n; i++){
            soma += i;
        }
        
        System.out.println("A soma entre 1 e " + n + " é: " + soma);
    }
    
}
