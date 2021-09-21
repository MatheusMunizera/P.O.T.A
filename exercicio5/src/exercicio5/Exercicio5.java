

package exercicio5;

/**
 5) Implemente o método de busca binária em java ou em C e teste com um vetor de tamanho
10 com qualquer número no vetor. (Valor 1,0)
 * @author munizera
 */
public class Exercicio5 {

    public static void main(String[] args) {
        
        int vetor[] = {0,12,24,37,48,56,62,79,85,93}; // Vetor de tamanho 10
        
        int num = 56; // Numero na qual estou procurando
        
        int resultado = buscaBinaria(num, vetor); // Armazenando o resultado para melhor visualização
        
        System.out.println("Encontrando o numero " + num + " no vetor"); 
        
        if(resultado > 0){ // Se caso for encontrado, imprimir a posição na qual foi encontrada
            System.out.println("O numero "+ num + " foi encontrado na posição: " + resultado);
        }else{ // Se caso nao encontrado avisa ao usuário
            System.out.println("Não foi encontrado o numero " + num);
        }
        
    }
    
    public static int buscaBinaria( int num, int vetor[]){ 
// A função recebe um num, na qual é o que o usuário deseja buscar
// E recebe um vetor, na qual é o lugar onde iremos procurar o num
   
       int inicio = 0;  // Posição Inicial Padrão do vetor
       int fim = vetor.length - 1; // Posição final do vetor, no caso 10 - 1, pois o inicio é igual a 0
       
       while( inicio <= fim ){ 
           int centro = (inicio + fim) / 2; // Lógica básica para determinar o centro do vetor
           if(num == vetor[centro]){
               return centro; // Quando o num que buscarmos estiver no centro, ele será retornado
           }
           if( num < vetor[centro]){
               fim = centro - 1;  // Se o numero estiver na primeira parte, ou seja do começo até o centro
               //  O valor de centro é setado como o fim, ou seja, estamos vendo apenas  a primeira metade do vetor
               // pois na segunda metade não há necessidade de busca pois  NUM < VETOR[centro]
               // Tendo em vista que o vetor esteja ordenado é claro.
           }
           if( num > vetor[centro]){
               inicio = centro + 1; // Segue a mesma ideologia acima, porém trabalha com a segunda parte do vetor
               // O que leva a entender o que o numero que buscamos é maior que numero que está no centro.
           }
       }
       return -1; 
                
      
        
        
        
    }

}
