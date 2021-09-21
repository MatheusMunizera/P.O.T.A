

package exercicio1;

/**
 *
 * @author munizera
 */
public class Exercicio1 {

    /*
    1) Escreva uma função recursiva que calcule o número de grupos distintos com k
    pessoas que podem ser formados a partir de um conjunto de n pessoas. 
    A definição abaixo da função Comb(n, k) define as regras: (Valor 1,0)

    
    Comb(n,k)={n                                                             se K =1
                       {1                                                             se K = n
                       {Comb(n-1, k-1) + Comb(n-1,k)                se 1 < k < n
    
     */
    public static void main(String[] args) {
     
        System.out.println(comb(4,3)); // Imprimir resultado
       
    }
    
    public static int comb(int n, int k){
        
        if(k == 1 ){  // Caso o parametro K seja igual a 1
            return n; // o retorno será n, ou seja, um grupo com 1 pessoa pode ser formado N vezes
        }else { // Caso contrário
            if(k == n){ // Com K igual a N, seria como um grupo com valor X de pessoas sendo formado X vezes, ou seja, valores iguais
                return 1; // Então deve ser retornado 1, 
            }else{// Caso contrário
                if( 1 < k && k < n){ // Se os valores de K nao forem igual a 1 ou a N
                return (comb((n-1),(k-1)) + comb((n-1), k));// Retorna então a soma entre a mesma funçao, sendo
                // funcao(os dois mesmos valores -1 ) + funcao(n-1, k)
                // assim com essa recursividade é possivel calcular o numero de grupos distintos com k pessoas que podem ser formados a 
                // partir de um conjunto n de pessoas
                }
            }
        }
       return 0; // Caso os parametros nao entrarem na lógica acima, retorne 0
    }
}
