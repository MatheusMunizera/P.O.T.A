/*
Faça uma função que converta um número na base 10 para a base 2. Método: divisões sucessivas
Divisor: número 2
Parar quando: quociente for igual a zero
—————————————————————————————- 
                1a divisão: 23/2 = 11 (resto 1)
                2a divisão: 11/2 = 5 (resto 1) 
                3a divisão: 5/2 = 2 (resto 1) 
                4a divisão: 2/2 = 1 (resto 0) 
                5a divisão: 1/2 = 0 (resto 1)
—————————————————————————————-
Terminada a divisão, pegaremos os restos das divisões na ordem inversa (1 0 1 1 1). 
Esta será a resposta da conversão: Resposta = 23 base 10 -> base 2 = 1 0 1 1 1
*/
package recursaoexercicio8;

/**
 *
 * @author munizera
 */
public class RecursaoExercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder binario = new StringBuilder();
        
        System.out.println(converterEmBinario(23, binario).reverse());
        
    }
    
    public static StringBuilder converterEmBinario(int n, StringBuilder binario){
  
        if( n / 2 == 0){
            return binario.append( n % 2);
        }else{
            binario.append( n % 2);
            converterEmBinario(n/2, binario);
            return binario;

        }
    }

}
