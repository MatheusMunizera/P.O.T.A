/*

Declare um vetor de 10 posições e o preencha com os 10 primeiros números impares e o escreva.
 */
package vetor1;

import java.util.Random;


/**
 *
 * @author munizera
 */
public class Vetor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Random random = new Random();
        int gerado = random.nextInt(100);
        int vetor[] = new int[10];
        
        for(int i = 0; i < vetor.length; ){
           
            gerado = random.nextInt(100);
            
            if(gerado % 2 > 0){
                vetor[i] = gerado;
                System.out.println(vetor[i]);
                i++;
            }
        }
        
       
        
    }
    
}
