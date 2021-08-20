
// Altere o programa do exercício anterior para aceitar expoente inteiro negativo.


package recursaoexercicio2;

/**
 *
 * @author munizera
 */
public class RecursaoExercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       calcularPotencia(2,-3);
        
    }
    
    public static double calcularPotencia(int base, int expo){
     double resultado;
        if(expo == 0){
             return 1;
        }else{
  
           resultado = base*calcularPotencia(base, expo + 1);
           System.out.println( 1 /   resultado);
            
          return resultado;
          
        }
        // 3/4 ^ - 3
 // 3/4 ^-3 * 4/3ˆ3        
        
        //1/8
    }

    

}
