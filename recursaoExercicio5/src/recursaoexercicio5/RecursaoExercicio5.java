/*
Construir um algoritmo iterativo para imprimir a série de FIBONACCI até o n° termo.
O termo deve ser passado pelo usuário.
A série de FIBONACCI é formada pela sequência: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...


Ela é infinita e começa com 0 e 1. Os números seguintes são sempre a soma dos dois números anteriores. 
Portanto: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34… 
*/
package recursaoexercicio5;

/**
 *
 * @author munizera
 */
public class RecursaoExercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(calcularFibonacci(2));
        
    }
    
    public static int calcularFibonacci(int n){
     
        if(n <= 1){
            return n;
        }else{
          
            return  calcularFibonacci(n-1) + calcularFibonacci(n-2);
        }
        
    }

}
