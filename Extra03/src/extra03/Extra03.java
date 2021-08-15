/*
 Para definir uma sequência a partir de um número inteiro positivo, temos as seguintes regras: n → n/2 (n é par)
n → 3n + 1 (n é ímpar)
● Usando a regra acima e iniciando com o número 13, geramos a seguinte sequência:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
● Podemos ver que esta sequência (iniciando em 13 e terminando em 1) contém 10 termos. 
Embora ainda não tenha sido provado (este problema é conhecido como Problema de Collatz), 
sabemos que com qualquer número que você começar, a sequência resultante chega no número 1 em algum momento. 
Elaborar um programa que dado um determinado número, informe a sequência de Collatz do mesmo.
● Extra: Desenvolva um programa que descubra qual o número inicial entre 1 e 1 milhão que produz a maior sequência.
 */
package extra03;

import java.util.Scanner;
/**
 *
 * @author munizera
 */
public class Extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        int n;
        System.out.println("Digite um numero inteiro positivo!");
        Scanner  entrada = new Scanner(System.in);
        n = entrada.nextInt();
        
        
        while(n > 1){
            System.out.printf(n + " → "); 
            if(n % 2 == 0){
                n = n/2;
            }else{
                n = (3*n) + 1;
            }
            
        }
        System.out.print(n + "\n");
        
    
           
            
    }
    
}
