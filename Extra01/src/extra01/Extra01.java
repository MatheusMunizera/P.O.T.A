/*
 Neste problema, você deverá exibir uma lista de 1 a 100, um em cada linha, com as seguintes exceções:
Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número;
Números divisíveis por 5 devem aparecer como 'Buzz' ao invés do número;
Números divisíveis por 3 e 5 devem aparecer como 'FizzBuzz' ao invés do número.
 */
package extra01;

import java.util.ArrayList;

/**
 *
 * @author munizera
 */
public class Extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int vetor[] = new int[100];
         
         for(int i = 1; i < vetor.length; i++){
             vetor[i] = i;
             if(i%3 == 0 && i % 5 == 0){
                 System.out.println("FizzBuzz");
             }else {
                 if(i % 5 == 0){
                     System.out.println("Buzz");
                 }else{
                       if(i%3 == 0){
                     System.out.println("Fizz");
                 }else{
                           System.out.println(vetor[i]);
                       }
                 }
         }
    }
    
}
}
