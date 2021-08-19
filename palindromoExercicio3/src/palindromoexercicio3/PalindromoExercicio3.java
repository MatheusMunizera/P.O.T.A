
/*
Faça um programa recursivo que verifique se uma palavra é palindromo.
– Exemplo: ovo, ana, abba, 010010
 */
package palindromoexercicio3;

import java.util.*;

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

        StringBuilder palavra = new StringBuilder("ana08976");

        System.out.println(verificarPalindromo(palavra));
       //verificarPalindromo(palavra);

    }

    public static String verificarPalindromo(StringBuilder p) {

        char[] arrayed = p.toString().toCharArray();

        for (int i = 0; i < p.length(); i++) {
            for (int j = p.length() - 1; j > 0; j--) {
                if (arrayed[i] == arrayed[j]) {

                    p = p.deleteCharAt(i);
                    p = p.deleteCharAt(j-1);

                    verificarPalindromo(p);

                    return "É palindromo";
                 //   System.out.println("palin");
                } else {
                   return "Não é palindromo";
                 //   System.out.println("not palin");
                }

            }
        }
   return "Não foi possivel verificar";
    }
    
}
        
    
