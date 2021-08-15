

package anonovoexercicio2;

/**
 * @author munizera
 */
public class AnoNovoExercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        contagemRegressiva(5);
    }

    public static void contagemRegressiva(int n){
        //Condição de Parada
        if(n == 0){
            System.out.println("Feliz Ano Novo");
        }else{
            //Alteração de estado
            System.out.printf(n + " -> ");
            contagemRegressiva(--n );
        }
    }
}
