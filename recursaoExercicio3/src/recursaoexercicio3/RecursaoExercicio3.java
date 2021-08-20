// 3) Encontrar o valor do maior elemento de um vetor de inteiros
//de tamanho n (informadopelo usuário).

package recursaoexercicio3;

/**
 *
 * @author munizera
 */
public class RecursaoExercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int[] n =   {34,48,5,7,999999999,12,59,19,3424399,342432331};
     
     
     System.out.println(maiorValor(n, n.length-1));
     
     
    }
    public static int maiorValor(int[] n, int max){
            
            
            if(max == 0){
                return n[0];
            }else{
               
                    if(n[max] > maiorValor(n, max - 1 )){
                        return n[max];
                      
                }else{
                        return maiorValor(n,max-1);
                    }
                
            }
            
    }
    
    
}
