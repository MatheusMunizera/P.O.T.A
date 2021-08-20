/*
1) Crie um programa que leia dois números, a base e o expoente, e apresente a potência entre esses números.
Obs.: Utilize expoente inteiro e com valor maior ou igual a zero.
*/
package recursaoexercicio1;

/**
 *
 * @author munizera
 */
public class RecursaoExercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
 calcularPotencia(2,3);
        
    }
    
    public static int calcularPotencia(int base, int expo){
       int resultado;
        if(expo == 0){
           
             return 1;
        }else{
            
            resultado = base*calcularPotencia(base, expo-1);
           System.out.println( resultado);
            
            return resultado;
            
        }
        //16
    }

}
