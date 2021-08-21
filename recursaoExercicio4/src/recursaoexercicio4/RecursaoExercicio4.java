/*
Desenvolva um programa que calcule o fatorial de um número inteiro não negativo fornecido pelo usuário.
*/

package recursaoexercicio4;

/**
 *
 * @author munizera
 */
public class RecursaoExercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(calcularFatorial(3));
        
    }
    
    public static int calcularFatorial(int n){
        if(n == 1){
            return 1;
        }else{
            return n * calcularFatorial(n-1);
        }
    }

}
