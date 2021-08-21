/*
Construa um programa que monte um vetor de inteiros com n posições 
(tamanho definido pelo usuário) e inicie cada elemento com um valor digitado pelo usuário.
Desenvolva uma função que retorne a soma dos elementos do vetor.

Dica: use um parâmetro inteiro para servir de "contador" para o índice do vetor.
*/

package recursaoexercicio7;

import java.util.Scanner;

/**
 *
 * @author munizera
 */
public class RecursaoExercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("\n A soma de todos os valores é: " + functionVetor(4,0));
    }
    
    public static int functionVetor(int n, int cont){
        int vetor[] = new int[n];
        Scanner num = new Scanner(System.in);
      
        
        if(cont == n){
            return vetor[cont-1];
        }else{
            System.out.println("Digite o " + (cont+1) + "° numero" );
             vetor[cont] = num.nextInt();
             cont++;
          
             return vetor[cont -1 ] + functionVetor(n,cont);
        }
       
        
        
        
        
        
        
        
    }

}
