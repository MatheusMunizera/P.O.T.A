/*
 Exercício Condicional - if

Faça um programa em Java que receba:
    -o nome e a idade
de duas pessoas e em seguida diga qual pessoa é mais velha.

 */
package conditionalif;

import java.util.Scanner;

/**
 *
 * @author munizera
 */
public class conditionalif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1, name2;
        int age1,age2;
        
        //
        Scanner person1 = new Scanner (System.in);
        Scanner person2 = new Scanner (System.in);
        //
        
        //First Person
        System.out.println("Pessoa 1 - Digite seu nome:");
        name1 = person1.nextLine();
        System.out.println("Pessoa 1 - Digite sua idade:");
        age1 = person1.nextInt();
        
        //Second Person
        System.out.println("Pessoa 2 - Digite seu nome:");
        name2 = person2.nextLine();
        System.out.println("Pessoa 2 - Digite sua idade:");
        age2 = person2.nextInt();

        //Conditional If
        
        if(age1 == age2){
            System.out.println("Ambas possuem a mesma idade");
        }else {
            if( age1 > age2){
                System.out.println(name1 + " é mais velho que " + name2);
          }else{
                System.out.println(name2 + " é mais velho que " + name1);
            }
        }
        
        
        
    }
    
}
