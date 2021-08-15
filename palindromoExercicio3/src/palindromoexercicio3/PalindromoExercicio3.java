
/*
Faça um programa recursivo que verifique se uma palavra é palindromo.
– Exemplo: ovo, ana, abba, 010010
*/
package palindromoexercicio3;

/**
 *
 * @author munizera
 */
public class PalindromoExercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        char vetor[] = new char[]{'o', 'v', 'o'};
        
    
    
    
        verificarPalindromo(vetor, 0);
    }
    
    public static void verificarPalindromo(char[] p, int n){
         int x = p.length;
            if (x < n ){
                System.out.println("Fim");
            }else{
                verificarPalindromo()
            }
     }  
       
        
        
           
        
     
    }

}
