package somaexercicio1;
import java.util.Scanner;
/**
 *
 * @author munizera
 */
public class SomaExercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int number = 0;
        System.out.println("Digite um numero inteiro: ");
        number = entrada.nextInt();
        System.out.println("A soma de  todos os numero até "+ number + 
                 " é " + soma(number));
    }

    public static int soma(int n) { // int inicial para funcionar o if comentado

        // Condição de Parada:
        if (n == 1) {
            return 1;
        } else {
            //Alteração de estada
            return  (n + soma(n - 1));
        }
    }

//        if(inicial <= n){
//            return inicial + soma(++inicial, n);
//        }
}
