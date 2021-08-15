/*
Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por dois (imprimindo o novo valor) até que ele seja maior do que 100.
Ex.: se o usuário digita 8, deveremos observar na tela a seguinte sequência: 8 16 32 64 128
– Usar whileou ou do-while
 */
package repeticaowhile;

import java.util.Scanner;

/**
 *
 * @author munizera
 */
public class RepeticaoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int number;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero");
        number = entrada.nextInt();
        
        while(number <+ 100){
            number = number * 2;
            System.out.println(number);
        }
    }
    
}
