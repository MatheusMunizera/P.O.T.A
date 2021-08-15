/*
Dadas as temperaturas que foram registradas diariamente durante uma semana, 
deseja-se determinar em quantos dias dessa semana a temperatura esteve acima da média. 
Escreva um programa que resolva esse problema e, após apresentar o resultado, 
pergunte ao usuário se ele deseja resolvê-lo novamente com outros dados.
 */
package vetor3;

import java.util.Scanner;

/**
 *
 * @author munizera
 */
public class Vetor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int vetor[] = new int[7], media , n;
        char resp = 's';
        do{
            media = 0;
            n = 0;
        System.out.println("Digite as temperaturas durante a semana");
        System.out.printf("Segunda: ");
        vetor[0] = entrada.nextInt();
        System.out.printf("Terça: ");
        vetor[1] = entrada.nextInt();
        System.out.printf("Quarta: ");
        vetor[2] = entrada.nextInt();
        System.out.printf("Quinta: ");
        vetor[3] = entrada.nextInt();
        System.out.printf("Sexta: ");
        vetor[4] = entrada.nextInt();
        System.out.printf("Sabado: ");
       vetor[5] = entrada.nextInt();
        System.out.printf("Domingo: ");
        vetor[6] = entrada.nextInt();
        
       
           
            for(int i = 0; i < vetor.length; i++){
                media += vetor[i];
            }
        
           media = media / vetor.length;
           
           for ( int i = 0; i < vetor.length; i++){
               if(vetor[i] > media){
                   n++;
               }
           }
           
           System.out.println(n + " dias da semana foram acima da média");
            System.out.println("Deseja continuar? (s/n)");
            resp = entrada.next().charAt(0);
        }while(resp == 's');
        
        
    }
    
}
